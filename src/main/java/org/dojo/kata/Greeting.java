package org.dojo.kata;

import java.util.List;
import java.util.stream.Collectors;

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
		String namesWithComma = separateWithComma(names.subList(0, names.size() - 1));
		
		if(names.size() > 2) {
			namesWithComma += ",";
		}
		
		String name = namesWithComma +  " and "+ names.get(names.size() - 1);
		return greet(name);
	}

	private static String separateWithComma(List<String> names) {
		return names.stream().collect( Collectors.joining( ", "));
	}

}
