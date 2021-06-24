package io.github.bzdgn.merdiven;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import io.github.bzdgn.merdiven.Statement.StatementBuilder;

public class StatementTest {
	
	@Test
	public void ensureQueryBuilderBuildsWithParametersAndOperations() {
		String expected = "firstName=\"Levent\" and lastName=\"Divilioglu\" number=\"717\" github=\"bzdgn\" ( type=\"Engineer\" or type=\"Guitarist\" ) ";
		StatementBuilder builder = new StatementBuilder();
		
		Statement statement = builder
				.add("firstName", "Levent")
				.and()
				.add("lastName", "Divilioglu")
				.add("number", "717")
				.add("github", "bzdgn")
				.openBracket()
					.add("type", "Engineer")
					.or()
					.add("type", "Guitarist")
				.closeBracket()
				.build();
		
		String actual = statement.toString();
		System.out.println("Generated string: " + actual);
		
		assertEquals(expected, actual);
	}

}
