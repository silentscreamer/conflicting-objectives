package com.cerence.solution;

import java.io.File;

public class FetchFile {

	static File file;

	public File getFile() {

		FetchFile.file = new File(System.getProperty("user.dir") + "/src/main/resources/wordlist.txt");
		return file;
	}
}
