package org.example.fixcode;

/**
 * @author sgao
 */
public class Pet {

	String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Pet withName(String name) {
		setName(name);
		return this;
	}
}
