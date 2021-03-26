package com.cerence.solution;

import java.io.File;
import java.io.FileNotFoundException;

public class FetchFile {

	static File file;

	public File getFile() {
		String userDir = System.getProperty("user.dir");
		FetchFile.file = new File(
				System.getProperty("user.dir") + "/src/main/resources/wordlist.txt");
		return file;
	}
}
