package org.dojo.kata;

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

}
