package com.cerence.solution;

public class WordObject {
	private final String originalWord;
	private final String firstPart;
	private final String secondPart;

	public WordObject(String originalWord, String firstPart, String secondPart) {
		this.originalWord = originalWord;
		this.firstPart = firstPart;
		this.secondPart = secondPart;
	}

	public WordObject(final String originalWord, final int splitPosition) {
		this.originalWord = originalWord;
		this.firstPart = originalWord.substring(0, splitPosition + 1);
		this.secondPart = originalWord.substring(splitPosition + 1);
	}

	public String getOriginalWord() {
		return originalWord;
	}

	public String getFirstPart() {
		return firstPart;
	}

	public String getSecondPart() {
		return secondPart;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((firstPart == null) ? 0 : firstPart.hashCode());
		result = prime * result + ((originalWord == null) ? 0 : originalWord.hashCode());
		result = prime * result + ((secondPart == null) ? 0 : secondPart.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		WordObject other = (WordObject) obj;
		if (firstPart == null) {
			if (other.firstPart != null)
				return false;
		} else if (!firstPart.equals(other.firstPart))
			return false;
		if (originalWord == null) {
			if (other.originalWord != null)
				return false;
		} else if (!originalWord.equals(other.originalWord))
			return false;
		if (secondPart == null) {
			if (other.secondPart != null)
				return false;
		} else if (!secondPart.equals(other.secondPart))
			return false;
		return true;
	}

}
