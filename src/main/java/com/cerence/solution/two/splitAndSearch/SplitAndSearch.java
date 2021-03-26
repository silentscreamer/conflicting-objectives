package com.cerence.solution.two.splitAndSearch;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import com.cerence.solution.WordObject;

public class SplitAndSearch {
	public static List<WordObject> splitAndSearch(Set<String> words, String wordWithLengthSix) {

		final char[] characters = wordWithLengthSix.toCharArray();
		final StringBuilder firstPart = new StringBuilder();
		final StringBuilder secondPart = new StringBuilder(wordWithLengthSix);
		final List<WordObject> wordObjectPresentList = new ArrayList<>();
		WordObject wordObject = null;

		for (int i = 0; i < characters.length; i++) {
			wordObject = new WordObject(wordWithLengthSix, firstPart.append(characters[i]).toString(),
					secondPart.deleteCharAt(0).toString());
			if (words.contains(wordObject.getFirstPart()) && words.contains(wordObject.getSecondPart())) {
				wordObjectPresentList.add(wordObject);
			}
		}

		return wordObjectPresentList;
	}
}
