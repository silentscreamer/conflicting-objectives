package com.cerence.solution.one.splitAndSearch;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import com.cerence.solution.WordObject;

public class SplitAndSearch {

	public static List<WordObject> splitAndSearch(Set<String> words, String wordWithLengthSix) {
		final List<WordObject> wordObjectList = new ArrayList<>();
		final List<WordObject> wordObjectPresentList = new ArrayList<>();
		final int lastSplitPosition = wordWithLengthSix.length() - 1;
		int currentSplitPosition = 0;

		while (currentSplitPosition < lastSplitPosition) {
			wordObjectList.add(new WordObject(wordWithLengthSix, currentSplitPosition));
			currentSplitPosition++;
		}

		wordObjectList.forEach(wordObject -> {
			if (words.contains(wordObject.getFirstPart()) && words.contains(wordObject.getSecondPart())) {
				wordObjectPresentList.add(wordObject);
			}
		});

		return wordObjectPresentList;
	}
}
