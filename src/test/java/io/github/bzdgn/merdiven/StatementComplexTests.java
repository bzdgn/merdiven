package io.github.bzdgn.merdiven;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import io.github.bzdgn.merdiven.Statement.StatementBuilder;
import io.github.bzdgn.merdiven.util.TestUtils;

public class StatementComplexTests {
	
	@Test
	public void ensureBuilderBuildsLogicalAndComparativeOperations() {
		String expected = "available=\"true\" and reputation>\"5000\" and hits>=\"1M\" and age<\"80\" and experience<=\"40\" and occupation=\"Engineer\" or occupation=\"Developer\"";
		StatementBuilder builder = new StatementBuilder();
		
		Statement statement = builder
				.add("available", "true")
				.and()
				.addGr("reputation", "5000")
				.and()
				.addGrEq("hits", "1M")
				.and()
				.addSm("age", "80")
				.and()
				.addSmEq("experience", "40")
				.and()
				.add("occupation", "Engineer")
				.or()
				.add("occupation", "Developer")
				.build();
		
		String actual = statement.toString();
		TestUtils.print(this.getClass(), "ensureBuilderBuildsLogicalAndComparativeOperations", actual);
		
		assertEquals(expected, actual);
	}
	
	@Test
	public void ensureBuilderBuildsLogicalAndComparativeOperationsWithParenthesis() {
		String expected = "( available=\"true\" and reputation>\"5000\" and hits>=\"1M\" and age<\"80\" and experience<=\"40\" ) and ( occupation=\"Engineer\" or occupation=\"Developer\" )";
		StatementBuilder builder = new StatementBuilder();
		
		Statement statement = builder
				.openParenthesis()
					.add("available", "true")
					.and()
					.addGr("reputation", "5000")
					.and()
					.addGrEq("hits", "1M")
					.and()
					.addSm("age", "80")
					.and()
					.addSmEq("experience", "40")
				.closeParenthesis()
				.and()
				.openParenthesis()
					.add("occupation", "Engineer")
					.or()
					.add("occupation", "Developer")
				.closeParenthesis()
				.build();
		
		String actual = statement.toString();
		TestUtils.print(this.getClass(), "ensureBuilderBuildsLogicalAndComparativeOperationsWithParenthesis", actual);
		
		assertEquals(expected, actual);
	}
	
	@Test
	public void ensureBuilderBuildsLogicalAndComparativeOperationsWithNestedBlocks() {
		String expected = "[ ( name=\"Levent\" and number=\"717\" ) or ( isOccupied=\"true\" and ( startDate>\"2002-11-06\" and endDate<\"2020-01-01\" ) ) ]";
		StatementBuilder builder = new StatementBuilder();
		
		Statement statement = builder
				.openBracket()
					.openParenthesis()
						.add("name", "Levent")
						.and()
						.add("number", "717")
					.closeParenthesis()
					.or()
					.openParenthesis()
						.add("isOccupied", "true")
						.and()
						.openParenthesis()
							.addGr("startDate", "2002-11-06")
							.and()
							.addSm("endDate", "2020-01-01")
						.closeParenthesis()
					.closeParenthesis()
				.closeBracket()
				.build();
		
		String actual = statement.toString();
		TestUtils.print(this.getClass(), "ensureBuilderBuildsLogicalAndComparativeOperationsWithParenthesis", actual);
		
		assertEquals(expected, actual);
	}
	
	/*
	 * readme examples
	 */
	@Test
	public void ensureSimpleJSONStructureIsBuilt() {
		String expected = "[ { \"name\":\"Levent\" , \"id\":\"717\" , \"isOccupied\":\"true\" , \"info\" : { \"languages\" : [ \"english\" , \"turkish\" , \"dutch\" ] } } ]";
		StatementBuilder builder = new StatementBuilder();
		
		Statement statement = builder
				.openBracket()
					.openCurlyBracket()
						.add("name", "Levent", ":", "\"")
						.and(",")
						.add("id", "717", ":", "\"")
						.and(",")
						.add("isOccupied", "true", ":", "\"")
						.and(",")
						.addParam("info", "\"")
						.eq(":")
						.openCurlyBracket()
							.addParam("languages", "\"")
							.eq(":")
							.openBracket()
								.addParam("english", "\"")
								.and(",")
								.addParam("turkish", "\"")
								.and(",")
								.addParam("dutch", "\"")
							.closeBracket()
						.closeCurlyBracket()
					.closeCurlyBracket()
				.closeBracket()
				.build();
		
		String actual = statement.toString();
		TestUtils.print(this.getClass(), "ensureSimpleJSONStructureIsBuilt", actual);
		
		assertEquals(expected, actual);
	}
	
}
