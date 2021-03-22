package com.vidvaan.string.practice;

public class WordsCount {

	public static void main(String[] args) {

		String s = "java is a software developing language";
		
		int count=0;
		
		char[] ch = s.toCharArray();
		for (int i = 0; i < s.length(); i++) {
			ch[i]=s.charAt(i);
			if(((i>0)&&(ch[i]!=' ')&&(ch[i-1]==' '))||((ch[0]!=' ')&&(i==0))) {
				count++;
			}
			
		}
		System.out.println(count);
		
		
	}
}
