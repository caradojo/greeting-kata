package org.dojo.kata;

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
}