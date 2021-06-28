package io.github.bzdgn.merdiven;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import io.github.bzdgn.merdiven.Statement.StatementBuilder;
import io.github.bzdgn.merdiven.statement.data.wrapper.WrapperType;
import io.github.bzdgn.merdiven.util.TestUtils;

public class StatementTest {
	
	/*
	 * Initial test, I don't want to remove this trivial test :)
	 */
	@Test
	public void ensureBuilderBuildsWithTrivialParametersAndOperations() {
		String expected = "firstName=\"Levent\" and lastName=\"Divilioglu\" number=\"717\" github=\"bzdgn\" [ type=\"Engineer\" or type=\"Guitarist\" ]";
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
		TestUtils.print(this.getClass(), "ensureBuilderBuildsWithTrivialParametersAndOperations", actual);
		
		assertEquals(expected, actual);
	}
	
	/*
	 * Overloaded generic addParam methods
	 */
	@Test
	public void ensureAddParamOverloadedOperationsBuiltSuccessfully() {
		String expected = "'field' fieldNoWrapper \"wrappedField\" <xmlField> [bracketField] {curlyField} (parenthesisField) \"plainStringField\"";
		StatementBuilder builder = new StatementBuilder();
		
		Statement statement = builder
				.addParam("field")
				.addParam("fieldNoWrapper", "")
				.addParam("wrappedField", "\"")
				.addParam("xmlField", WrapperType.ANGLE_BRACKET_WRAPPER)
				.addParam("bracketField", WrapperType.BRACKET_WRAPPER)
				.addParam("curlyField", WrapperType.CURLY_BRACKET_WRAPPER)
				.addParam("parenthesisField", WrapperType.PARENTHESIS_WRAPPER)
				.addParam("plainStringField", WrapperType.PLAIN_STRING_WRAPPER)
				.build();
		
		String actual = statement.toString();
		TestUtils.print(this.getClass(), "ensureAddParamOverloadedOperationsBuiltSuccessfully", actual);
		
		assertEquals(expected, actual);
	}
	
	/*
	 * Overloaded generic add methods
	 */
	@Test
	public void ensureAddOverloadedOperationsBuiltSuccessfully() {
		String expected = "name=\"Levent\" number:\"717\" |address|:=|Dimebag Straat| ++description++::==^^I sell nice guitars^^";
		StatementBuilder builder = new StatementBuilder();
		
		Statement statement = builder
				.add("name", "Levent")
				.add("number", "717", ":")
				.add("address", "Dimebag Straat", ":=", "|")
				.add("description", "I sell nice guitars", "::==", "++", "^^")
				.build();
		
		String actual = statement.toString();
		TestUtils.print(this.getClass(), "ensureAddOverloadedOperationsBuiltSuccessfully", actual);
		
		assertEquals(expected, actual);
	}
	
	/*
	 * Simple Methods for add with comparatives
	 */
	@Test
	public void ensureComparativeAddWithSimpleComparativeOperationsBuiltSuccessfully() {
		String expected = "numberOfGuitars>\"10\" numberOfPicks>=\"20\" numberOfRooms<\"30\" numberOfAmps<=\"40\"";
		StatementBuilder builder = new StatementBuilder();
		
		Statement statement = builder
				.addGr("numberOfGuitars", "10")
				.addGrEq("numberOfPicks", "20")
				.addSm("numberOfRooms", "30")
				.addSmEq("numberOfAmps", "40")
				.build();
		
		String actual = statement.toString();
		TestUtils.print(this.getClass(), "ensureComparativeAddWithSimpleComparativeOperationsBuiltSuccessfully", actual);
		
		assertEquals(expected, actual);
	}
	
	/*
	 * Add Greater with overloaded methods
	 */
	@Test
	public void ensureComparativeAddWithGreaterOverloadedWithStringWrappersBuiltSuccessfully() {
		String expected = "numberA>\"10\" 'numberB'>'20' 'numberC'>\"30\"";
		StatementBuilder builder = new StatementBuilder();
		
		Statement statement = builder
				.addGr("numberA", "10")
				.addGr("numberB", "20", "'")
				.addGr("numberC", "30", "'", "\"")
				.build();
		
		String actual = statement.toString();
		TestUtils.print(this.getClass(), "ensureComparativeAddWithGreaterOverloadedWithStringWrappersBuiltSuccessfully", actual);
		
		assertEquals(expected, actual);
	}
	
	@Test
	public void ensureComparativeAddWithGreaterOverloadedWithPredefinedWrappersBuiltSuccessfully() {
		String expected = "<numberA>><10> [numberA]>[20] {numberA}>{30} (numberA)>(40) \"numberA\">\"50\"";
		StatementBuilder builder = new StatementBuilder();
		
		Statement statement = builder
				.addGr("numberA", "10", WrapperType.ANGLE_BRACKET_WRAPPER)
				.addGr("numberA", "20", WrapperType.BRACKET_WRAPPER)
				.addGr("numberA", "30", WrapperType.CURLY_BRACKET_WRAPPER)
				.addGr("numberA", "40", WrapperType.PARENTHESIS_WRAPPER)
				.addGr("numberA", "50", WrapperType.PLAIN_STRING_WRAPPER)
				.build();
		
		String actual = statement.toString();
		TestUtils.print(this.getClass(), "ensureComparativeAddWithGreaterOverloadedWithPredefinedWrappersBuiltSuccessfully", actual);
		
		assertEquals(expected, actual);
	}
	
	@Test
	public void ensureComparativeAddWithGreaterOverloadedWithMultiplePredefinedWrappersBuiltSuccessfully() {
		String expected = "{numberA}>[10]";
		StatementBuilder builder = new StatementBuilder();
		
		Statement statement = builder
				.addGr("numberA", "10", WrapperType.CURLY_BRACKET_WRAPPER, WrapperType.BRACKET_WRAPPER)
				.build();
		
		String actual = statement.toString();
		TestUtils.print(this.getClass(), "ensureComparativeAddWithGreaterOverloadedWithMultiplePredefinedWrappersBuiltSuccessfully", actual);
		
		assertEquals(expected, actual);
	}
	
	/*
	 * Add Greater And Equals with overloaded methods
	 */
	@Test
	public void ensureComparativeAddWithGreaterAndEqualsOverloadedWithStringWrappersBuiltSuccessfully() {
		String expected = "numberA>=\"10\" 'numberB'>='20' 'numberC'>=\"30\"";
		StatementBuilder builder = new StatementBuilder();
		
		Statement statement = builder
				.addGrEq("numberA", "10")
				.addGrEq("numberB", "20", "'")
				.addGrEq("numberC", "30", "'", "\"")
				.build();
		
		String actual = statement.toString();
		TestUtils.print(this.getClass(), "ensureComparativeAddWithGreaterAndEqualsOverloadedWithStringWrappersBuiltSuccessfully", actual);
		
		assertEquals(expected, actual);
	}
	
	@Test
	public void ensureComparativeAddWithGreaterAndEqualsOverloadedWithPredefinedWrappersBuiltSuccessfully() {
		String expected = "<numberA>>=<10> [numberA]>=[20] {numberA}>={30} (numberA)>=(40) \"numberA\">=\"50\"";
		StatementBuilder builder = new StatementBuilder();
		
		Statement statement = builder
				.addGrEq("numberA", "10", WrapperType.ANGLE_BRACKET_WRAPPER)
				.addGrEq("numberA", "20", WrapperType.BRACKET_WRAPPER)
				.addGrEq("numberA", "30", WrapperType.CURLY_BRACKET_WRAPPER)
				.addGrEq("numberA", "40", WrapperType.PARENTHESIS_WRAPPER)
				.addGrEq("numberA", "50", WrapperType.PLAIN_STRING_WRAPPER)
				.build();
		
		String actual = statement.toString();
		TestUtils.print(this.getClass(), "ensureComparativeAddWithGreaterAndEqualsOverloadedWithPredefinedWrappersBuiltSuccessfully", actual);
		
		assertEquals(expected, actual);
	}
	
	@Test
	public void ensureComparativeAddWithGreaterAndEqualsOverloadedWithMultiplePredefinedWrappersBuiltSuccessfully() {
		String expected = "{numberA}>=[10]";
		StatementBuilder builder = new StatementBuilder();
		
		Statement statement = builder
				.addGrEq("numberA", "10", WrapperType.CURLY_BRACKET_WRAPPER, WrapperType.BRACKET_WRAPPER)
				.build();
		
		String actual = statement.toString();
		TestUtils.print(this.getClass(), "ensureComparativeAddWithGreaterAndEqualsOverloadedWithMultiplePredefinedWrappersBuiltSuccessfully", actual);
		
		assertEquals(expected, actual);
	}
	
	/*
	 * Add Smaller with overloaded methods
	 */
	@Test
	public void ensureComparativeAddWithSmallerOverloadedWithStringWrappersBuiltSuccessfully() {
		String expected = "numberA<\"10\" 'numberB'<'20' 'numberC'<\"30\"";
		StatementBuilder builder = new StatementBuilder();
		
		Statement statement = builder
				.addSm("numberA", "10")
				.addSm("numberB", "20", "'")
				.addSm("numberC", "30", "'", "\"")
				.build();
		
		String actual = statement.toString();
		TestUtils.print(this.getClass(), "ensureComparativeAddWithSmallerOverloadedWithStringWrappersBuiltSuccessfully", actual);
		
		assertEquals(expected, actual);
	}
	
	@Test
	public void ensureComparativeAddWithSmallerOverloadedWithPredefinedWrappersBuiltSuccessfully() {
		String expected = "<numberA><<10> [numberA]<[20] {numberA}<{30} (numberA)<(40) \"numberA\"<\"50\"";
		StatementBuilder builder = new StatementBuilder();
		
		Statement statement = builder
				.addSm("numberA", "10", WrapperType.ANGLE_BRACKET_WRAPPER)
				.addSm("numberA", "20", WrapperType.BRACKET_WRAPPER)
				.addSm("numberA", "30", WrapperType.CURLY_BRACKET_WRAPPER)
				.addSm("numberA", "40", WrapperType.PARENTHESIS_WRAPPER)
				.addSm("numberA", "50", WrapperType.PLAIN_STRING_WRAPPER)
				.build();
		
		String actual = statement.toString();
		TestUtils.print(this.getClass(), "ensureComparativeAddWithSmallerOverloadedWithPredefinedWrappersBuiltSuccessfully", actual);
		
		assertEquals(expected, actual);
	}
	
	@Test
	public void ensureComparativeAddWithSmallerOverloadedWithMultiplePredefinedWrappersBuiltSuccessfully() {
		String expected = "{numberA}<[10]";
		StatementBuilder builder = new StatementBuilder();
		
		Statement statement = builder
				.addSm("numberA", "10", WrapperType.CURLY_BRACKET_WRAPPER, WrapperType.BRACKET_WRAPPER)
				.build();
		
		String actual = statement.toString();
		TestUtils.print(this.getClass(), "ensureComparativeAddWithSmallerOverloadedWithMultiplePredefinedWrappersBuiltSuccessfully", actual);
		
		assertEquals(expected, actual);
	}
	
	/*
	 * Add Smaller And Equals with overloaded methods
	 */
	@Test
	public void ensureComparativeAddWithSmallerAndEqualsOverloadedWithStringWrappersBuiltSuccessfully() {
		String expected = "numberA<=\"10\" 'numberB'<='20' 'numberC'<=\"30\"";
		StatementBuilder builder = new StatementBuilder();
		
		Statement statement = builder
				.addSmEq("numberA", "10")
				.addSmEq("numberB", "20", "'")
				.addSmEq("numberC", "30", "'", "\"")
				.build();
		
		String actual = statement.toString();
		TestUtils.print(this.getClass(), "ensureComparativeAddWithSmallerAndEqualsOverloadedWithStringWrappersBuiltSuccessfully", actual);
		
		assertEquals(expected, actual);
	}
	
	@Test
	public void ensureComparativeAddWithSmallerAndEqualsOverloadedWithPredefinedWrappersBuiltSuccessfully() {
		String expected = "<numberA><=<10> [numberA]<=[20] {numberA}<={30} (numberA)<=(40) \"numberA\"<=\"50\"";
		StatementBuilder builder = new StatementBuilder();
		
		Statement statement = builder
				.addSmEq("numberA", "10", WrapperType.ANGLE_BRACKET_WRAPPER)
				.addSmEq("numberA", "20", WrapperType.BRACKET_WRAPPER)
				.addSmEq("numberA", "30", WrapperType.CURLY_BRACKET_WRAPPER)
				.addSmEq("numberA", "40", WrapperType.PARENTHESIS_WRAPPER)
				.addSmEq("numberA", "50", WrapperType.PLAIN_STRING_WRAPPER)
				.build();
		
		String actual = statement.toString();
		TestUtils.print(this.getClass(), "ensureComparativeAddWithSmallerAndEqualsOverloadedWithPredefinedWrappersBuiltSuccessfully", actual);
		
		assertEquals(expected, actual);
	}
	
	@Test
	public void ensureComparativeAddWithSmallerAndEqualsOverloadedWithMultiplePredefinedWrappersBuiltSuccessfully() {
		String expected = "{numberA}<=[10]";
		StatementBuilder builder = new StatementBuilder();
		
		Statement statement = builder
				.addSmEq("numberA", "10", WrapperType.CURLY_BRACKET_WRAPPER, WrapperType.BRACKET_WRAPPER)
				.build();
		
		String actual = statement.toString();
		TestUtils.print(this.getClass(), "ensureComparativeAddWithSmallerAndEqualsOverloadedWithMultiplePredefinedWrappersBuiltSuccessfully", actual);
		
		assertEquals(expected, actual);
	}
	
	/*
	 * operators
	 */
	
	@Test
	public void ensureOperatorsBuiltSuccessfully() {
		String expected = "and or = > >= < <=";
		StatementBuilder builder = new StatementBuilder();
		
		Statement statement = builder
				.and()
				.or()
				.eq()
				.gr()
				.greq()
				.sm()
				.smeq()
				.build();
		
		String actual = statement.toString();
		TestUtils.print(this.getClass(), "ensureOperatorsBuiltSuccessfully", actual);
		
		assertEquals(expected, actual);
	}
	
	@Test
	public void ensureOperatorsWithCustomValuesBuiltSuccessfully() {
		String expected = "<<AND>> <<OR>> <<EQ>> <<GREATER>> <<GREATER_AND_EQUALS>> <<SMALLER>> <<SMALLER_AND_EQUALS>>";
		StatementBuilder builder = new StatementBuilder();
		
		Statement statement = builder
				.and("<<AND>>")
				.or("<<OR>>")
				.eq("<<EQ>>")
				.gr("<<GREATER>>")
				.greq("<<GREATER_AND_EQUALS>>")
				.sm("<<SMALLER>>")
				.smeq("<<SMALLER_AND_EQUALS>>")
				.build();
		
		String actual = statement.toString();
		TestUtils.print(this.getClass(), "ensureOperatorsWithCustomValuesBuiltSuccessfully", actual);
		
		assertEquals(expected, actual);
	}
	
	/*
	 * BLOCK tests
	 */
	
	@Test
	public void ensureSimpleBlocksAreBuiltSuccessfully() {
		String expected = "< > [ ] { } ( ) <<< >>> [[[ ]]] {{{ }}} ((( )))";
		StatementBuilder builder = new StatementBuilder();
		
		Statement statement = builder
				.openAngleBracket()
				.closeAngleBracket()
				.openBracket()
				.closeBracket()
				.openCurlyBracket()
				.closeCurlyBracket()
				.openParenthesis()
				.closeParenthesis()
				.openAngleBracket("<<<")
				.closeAngleBracket(">>>")
				.openBracket("[[[")
				.closeBracket("]]]")
				.openCurlyBracket("{{{")
				.closeCurlyBracket("}}}")
				.openParenthesis("(((")
				.closeParenthesis(")))")
				.build();
		
		String actual = statement.toString();
		TestUtils.print(this.getClass(), "ensureSimpleBlocksAreBuiltSuccessfully", actual);
		
		assertEquals(expected, actual);
	}
	
	@Test
	public void ensureNestedBlocksAreBuiltSuccessfully() {
		String expected = "< [ { ( <<< [[[ {{{ ((( ))) }}} ]]] >>> ) } ] >";
		StatementBuilder builder = new StatementBuilder();
		
		Statement statement = builder
				.openAngleBracket()
				.openBracket()
				.openCurlyBracket()
				.openParenthesis()
				.openAngleBracket("<<<")
				.openBracket("[[[")
				.openCurlyBracket("{{{")
				.openParenthesis("(((")
				.closeParenthesis(")))")
				.closeCurlyBracket("}}}")
				.closeBracket("]]]")
				.closeAngleBracket(">>>")
				.closeParenthesis()
				.closeCurlyBracket()
				.closeBracket()
				.closeAngleBracket()
				.build();
		
		String actual = statement.toString();
		TestUtils.print(this.getClass(), "ensureNestedBlocksAreBuiltSuccessfully", actual);
		
		assertEquals(expected, actual);
	}
	
	/*
	 * custom operation
	 */
	@Test
	public void ensureCustomOperationIsBuiltSuccessfully() {
		String expected = "SELECT";
		StatementBuilder builder = new StatementBuilder();
		
		Statement statement = builder
				.custom("SELECT")
				.build();
		
		String actual = statement.toString();
		TestUtils.print(this.getClass(), "ensureCustomOperationIsBuiltSuccessfully", actual);
		
		assertEquals(expected, actual);
	}
	
}
