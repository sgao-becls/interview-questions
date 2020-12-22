package org.example.grouping;

/**
 * @author sgao
 */
public class User {

	private Integer id;

	private String name;

	private Boolean validated;

	public User(Integer id, String name, Boolean validated) {
		this.id = id;
		this.name = name;
		this.validated = validated;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Boolean getValidated() {
		return validated;
	}

	public void setValidated(Boolean validated) {
		this.validated = validated;
	}
}
