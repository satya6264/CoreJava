package com.vidvaan.ExtendsThread;

public class YouTube {
	public static void main(String[] args) {
		Play play = new Play();
		Stream stream = new Stream();
		stream.start();
		play.start();
		
	}

}
