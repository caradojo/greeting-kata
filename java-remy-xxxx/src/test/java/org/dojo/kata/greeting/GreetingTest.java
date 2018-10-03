package org.dojo.kata.greeting;

import java.util.Arrays;
import java.util.List;

import org.fest.assertions.api.Assertions;
import org.junit.Test;

public class GreetingTest {

	@Test
	public void greeting_with_a_name_returns_Hello_with_the_name() {
		// Given
		String name = "Bob";
		Greeting gretting = new Greeting();

		// When
		String greetingName = gretting.greet(name);

		// Then
		Assertions.assertThat(greetingName).isEqualTo("Hello, Bob.");
	}

	@Test
	public void greeting_with_null_returns_Hello_my_friend() {
		// Given
		String name = null;
		Greeting gretting = new Greeting();

		// When
		String greetingName = gretting.greet(name);

		// Then
		Assertions.assertThat(greetingName).isEqualTo("Hello, my friend.");
	}

	@Test
	public void greeting_with_uppercase_name_returns_HELLO_NAME() {
		// Given
		String name = "JERRY";
		Greeting gretting = new Greeting();
		
		// When
		String greetingName = gretting.greet(name);
		
		// Then
		Assertions.assertThat(greetingName).isEqualTo("HELLO JERRY!");
	}
	
	@Test
	public void greeting_with_an_array_of_two_names_returns_Hello_with_names() {
		// Given
		List<String> names = Arrays.asList("Jill", "Jane");
		Greeting gretting = new Greeting();
		
		// When
		String greetingName = gretting.greet(names);
		
		// Then
		Assertions.assertThat(greetingName).isEqualTo("Hello, Jill and Jane.");
	}

	@Test
	public void greeting_with_an_array_of_three_names_returns_Hello_with_names() {
		// Given
		List<String> names = Arrays.asList("Amy", "Brian", "Charlotte");
		Greeting gretting = new Greeting();
		
		// When
		String greetingName = gretting.greet(names);
		
		// Then
		Assertions.assertThat(greetingName).isEqualTo("Hello, Amy, Brian, and Charlotte.");
	}
}