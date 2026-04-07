package com.api.pojo;

import java.util.Objects;

public class UserPOJO {
	private String name;

	public UserPOJO(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "USERPOJO [name=" + name + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		UserPOJO other = (UserPOJO) obj;
		return Objects.equals(name, other.name);
	}
}
