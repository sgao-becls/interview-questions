package org.example.fixcode;

/**
 * @author sgao
 */
public class Application {

	public static void main(String[] args) {
		Doggy doggy = new Doggy()
				.withName("Alpha")
				.withColor("yellow");
		System.out.println(doggy.getName());
		System.out.println(doggy.getColor());
	}
}
