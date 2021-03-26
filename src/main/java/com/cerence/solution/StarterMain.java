package com.cerence.solution;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class StarterMain {

	public static void main(String[] args) throws IOException {
		
		File file = new FetchFile().getFile();
		Set<String> words = new ReadFile().getWordsInFile(file);
		List<String> wordsWithLengthSix = new ReadFile().getWordsWithLengthSix(words);
		firstSolution(words, wordsWithLengthSix);
		Set<String> wordsWithLengthLessThanSix = words.stream().filter(word -> word.length() < 6)
				.collect(Collectors.toSet());
		secondSolution(wordsWithLengthLessThanSix, wordsWithLengthSix);

	}

	public static void firstSolution(Set<String> words, List<String> wordsWithLengthSix) {
		final List<WordObject> wordObjectPresentList = new ArrayList<>();

		long startTime = new Date().getTime();

		words.removeAll(wordsWithLengthSix);
		wordsWithLengthSix.forEach(wordWithLengthSix -> {
			wordObjectPresentList.addAll(
					com.cerence.solution.one.splitAndSearch.SplitAndSearch.splitAndSearch(words, wordWithLengthSix));
		});

		for (WordObject wordObject : wordObjectPresentList) {
			System.out.println("{'" + wordObject.getOriginalWord() + "','" + wordObject.getFirstPart() + "','"
					+ wordObject.getSecondPart() + "'}");
		}
		long endTime = new Date().getTime();
		System.out.println("Total time taken to perform first solution:" + (endTime - startTime)
				+ " milliseconds List Length is " + wordObjectPresentList.size());
	}

	public static void secondSolution(Set<String> words, List<String> wordsWithLengthSix) {
		final List<WordObject> wordObjectPresentList = new LinkedList<>();

		long startTime = new Date().getTime();
		words.removeAll(wordsWithLengthSix);
		wordsWithLengthSix.forEach(wordWithLengthSix -> {
			wordObjectPresentList.addAll(
					com.cerence.solution.two.splitAndSearch.SplitAndSearch.splitAndSearch(words, wordWithLengthSix));
		});

		for (WordObject wordObject : wordObjectPresentList) {
			System.out.println("{'" + wordObject.getOriginalWord() + "','" + wordObject.getFirstPart() + "','"
					+ wordObject.getSecondPart() + "'}");
		}
		long endTime = new Date().getTime();
		System.out.println("Total time taken to perform second solution:" + (endTime - startTime)
				+ " milliseconds and List Length is " + wordObjectPresentList.size());
	}

}
