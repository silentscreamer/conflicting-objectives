package com.cerence.solution;

public class Anagram {

	public static void main(String[] args) {
		String s = "rat";
		String l ="arp";
		boolean b = isAnagram(s,l);
		if(b) {
			System.out.println("Is anagram");
		} else {
			System.out.println("Not anagram");
		}

	}
	
	private static boolean isAnagram(String s, String l) {
		char[] a = s.toCharArray();
		char[] b = l.toCharArray();
		boolean f = true;
		outer:
			for(int i = 0;i<a.length;i++) {
				for(int j = 0;j<b.length;j++) {
					if(a[i] == b[j]) {
						f = true;
						continue outer;
					} else {
						f = false;
						if(b.length == j&& !f) {
							return false;
						}
					}
				}
			}
		return f;
	}

}
