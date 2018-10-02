package org.dojo.kata;

import java.util.List;

public class Greeting {

	private static boolean isInUppercase(String name) {
		return name.equals(name.toUpperCase());
	}

	public String greet(String name) {
		if (name == null)
			return "Hello, my friend.";
		if(isInUppercase(name))
			return "HELLO " + name + "!";
		return "Hello, " + name + ".";
	}

	public String greet(List<String> names) {
		String name = names.get(0) + " and "+ names.get(1);
		return greet(name);
	}

}
