package org.example.fixcode;

/**
 * @author sgao
 */
public class Doggy extends Pet {

	private String color;

	public String getColor() {
		return color;
	}

	public Doggy withColor(String color) {
		this.color = color;
		return this;
	}
}
