package com.vidvaan.oops.abstraction.Interface;

public interface Drawable {
	void draw();

}

class Reactangle implements Drawable {

	@Override
	public void draw() {
		System.out.println("Drawing rectangle...");
	}

}

class Cirle implements Drawable {

	@Override
	public void draw() {
		System.out.println("Drawinfg circle...");
	}

	public static void main(String[] args) {
		Drawable d = new Cirle();
		d.draw();
	}

}
