package com.cerence.solution;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class ReadFile {

	public Set<String> getWordsInFile(File file) throws FileNotFoundException, IOException {
		Set<String> words = new HashSet<String>();
		FileReader fr = new FileReader(file);
		BufferedReader br = new BufferedReader(fr);
		String line;
		while ((line = br.readLine()) != null) {
			words.add(line);
		}
		fr.close();
		return words;
	}
	public List<String> getWordsWithLengthSix(Set<String> words) {
		return words.stream().filter(word->word.length() == 6).collect(Collectors.toList());
	}
}
