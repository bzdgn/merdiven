package io.github.bzdgn.merdiven.statement.data.impl;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import io.github.bzdgn.merdiven.statement.StatementType;
import io.github.bzdgn.merdiven.statement.data.DataStatement;
import io.github.bzdgn.merdiven.statement.data.DataType;
import io.github.bzdgn.merdiven.statement.data.InvalidParameterListException;
import io.github.bzdgn.merdiven.statement.data.wrapper.WrapperType;
import io.github.bzdgn.merdiven.util.TestUtils;

public class DataFactoryTest {
	
	private static final String param = "school_id";
	private static final String value = "717";
	
	/*
	 * field data constructor calls
	 */
	@Test
	public void ensureFieldDataCreatedSuccessfully() {
		DataStatement statement = DataFactory.getData(param, null, DataType.FIELD_DATA);
		
		assertEquals(StatementType.SIMPLE_DATA, statement.getStatementType());
		assertEquals(DataType.FIELD_DATA, statement.getDataStatementType());
		assertEquals("'school_id'", statement.toString());
		
		TestUtils.print(this.getClass(), "ensureFieldDataCreatedSuccessfully", statement.toString());
	}
	
	@Test
	public void ensureFieldDataWithEmptyStringWrapperCreatedSuccessfully() {
		DataStatement statement = DataFactory.getData(param, null, null, "", DataType.FIELD_DATA);
		
		assertEquals(StatementType.SIMPLE_DATA, statement.getStatementType());
		assertEquals(DataType.FIELD_DATA, statement.getDataStatementType());
		assertEquals("school_id", statement.toString());
		
		TestUtils.print(this.getClass(), "ensureFieldDataWithEmptyStringWrapperCreatedSuccessfully", statement.toString());
	}
	
	@Test
	public void ensureFieldDataWithStringWrapperCreatedSuccessfully() {
		DataStatement statement = DataFactory.getData(param, null, null, "^", DataType.FIELD_DATA);
		
		assertEquals(StatementType.SIMPLE_DATA, statement.getStatementType());
		assertEquals(DataType.FIELD_DATA, statement.getDataStatementType());
		assertEquals("^school_id^", statement.toString());
		
		TestUtils.print(this.getClass(), "ensureFieldDataWithStringWrapperCreatedSuccessfully", statement.toString());
	}
	
	@Test
	public void ensureFieldDataWithPredefinedWrapperCreatedSuccessfully() {
		DataStatement statement = DataFactory.getData(param, null, WrapperType.ANGLE_BRACKET_WRAPPER, DataType.FIELD_DATA);
		
		assertEquals(StatementType.SIMPLE_DATA, statement.getStatementType());
		assertEquals(DataType.FIELD_DATA, statement.getDataStatementType());
		assertEquals("<school_id>", statement.toString());
		
		TestUtils.print(this.getClass(), "ensureFieldDataWithPredefinedWrapperCreatedSuccessfully", statement.toString());
	}
	
	@Test(expected = InvalidParameterListException.class)
	public void ensureFieldDataNotCreatedSuccessfullyWhenNonNullValue() {
		DataFactory.getData(param, "some-value", DataType.FIELD_DATA);
	}
	
	@Test(expected = InvalidParameterListException.class)
	public void ensureFieldDataNotCreatedSuccessfullyWithStringWrapperWhenNonNullValue() {
		DataFactory.getData(param, "some-value", null, "^", DataType.FIELD_DATA);
	}
	
	@Test(expected = InvalidParameterListException.class)
	public void ensureFieldDataNotCreatedSuccessfullyWithStringWrapperWhenNonNullOperator() {
		DataFactory.getData(param, null, "some-value", "^", DataType.FIELD_DATA);
	}
	
	@Test(expected = InvalidParameterListException.class)
	public void ensureFieldDataNotCreatedSuccessfullyWithStringWrapperWhenNonNullValueAndNonNullOperator() {
		DataFactory.getData(param, "some-value", "some-value", "^", DataType.FIELD_DATA);
	}
	
	@Test(expected = InvalidParameterListException.class)
	public void ensureFieldDataNotCreatedSuccessfullyWithPredefinedWrapperWhenNonNullValue() {
		DataFactory.getData(param, "some-value", WrapperType.ANGLE_BRACKET_WRAPPER, DataType.FIELD_DATA);
	}
	
	/*
	 * plain data constructor calls
	 */
	@Test
	public void ensurePlainAssignmentDataCreatedSuccessfully() {
		DataStatement statement = DataFactory.getData(param, value, DataType.PLAIN_ASSIGNMENT_DATA);
		
		assertEquals(StatementType.SIMPLE_DATA, statement.getStatementType());
		assertEquals(DataType.PLAIN_ASSIGNMENT_DATA, statement.getDataStatementType());
		assertEquals("school_id=\"717\"", statement.toString());
		
		TestUtils.print(this.getClass(), "ensurePlainAssignmentDataCreatedSuccessfully", statement.toString());
	}
	
	@Test
	public void ensurePlainAssignmentDataCreatedSuccessfullyWithOperator() {
		DataStatement statement = DataFactory.getData(param, value, "!=", DataType.PLAIN_ASSIGNMENT_DATA);
		
		assertEquals(StatementType.SIMPLE_DATA, statement.getStatementType());
		assertEquals(DataType.PLAIN_ASSIGNMENT_DATA, statement.getDataStatementType());
		assertEquals("school_id!=\"717\"", statement.toString());
		
		TestUtils.print(this.getClass(), "ensurePlainAssignmentDataCreatedSuccessfullyWithOperator", statement.toString());
	}
	
	@Test
	public void ensurePlainAssignmentDataCreatedSuccessfullyWithOperatorAndGenericStringWrapper() {
		DataStatement statement = DataFactory.getData(param, value, "!=", "'", DataType.PLAIN_ASSIGNMENT_DATA);
		
		assertEquals(StatementType.SIMPLE_DATA, statement.getStatementType());
		assertEquals(DataType.PLAIN_ASSIGNMENT_DATA, statement.getDataStatementType());
		assertEquals("'school_id'!='717'", statement.toString());
		
		TestUtils.print(this.getClass(), "ensurePlainAssignmentDataCreatedSuccessfullyWithOperatorAndGenericStringWrapper", statement.toString());
	}
	
	@Test
	public void ensurePlainAssignmentDataCreatedSuccessfullyWithOperatorAndMultipleStringWrapper() {
		DataStatement statement = DataFactory.getData(param, value, "!=", "|", "$", DataType.PLAIN_ASSIGNMENT_DATA);
		
		assertEquals(StatementType.SIMPLE_DATA, statement.getStatementType());
		assertEquals(DataType.PLAIN_ASSIGNMENT_DATA, statement.getDataStatementType());
		assertEquals("|school_id|!=$717$", statement.toString());
		
		TestUtils.print(this.getClass(), "ensurePlainAssignmentDataCreatedSuccessfullyWithOperatorAndMultipleStringWrapper", statement.toString());
	}
	
	@Test
	public void ensurePlainAssignmentDataCreatedSuccessfullyWithOperatorAndGenericWrapper() {
		DataStatement statement = DataFactory.getData(param, value, "!=", WrapperType.BRACKET_WRAPPER, DataType.PLAIN_ASSIGNMENT_DATA);
		
		assertEquals(StatementType.SIMPLE_DATA, statement.getStatementType());
		assertEquals(DataType.PLAIN_ASSIGNMENT_DATA, statement.getDataStatementType());
		assertEquals("[school_id]!=[717]", statement.toString());
		
		TestUtils.print(this.getClass(), "ensurePlainAssignmentDataCreatedSuccessfullyWithOperatorAndGenericWrapper", statement.toString());
	}
	
	@Test
	public void ensurePlainAssignmentDataCreatedSuccessfullyWithOperatorAndMultipleWrapper() {
		DataStatement statement = DataFactory.getData(param, value, "!=", WrapperType.CURLY_BRACKET_WRAPPER, WrapperType.PARENTHESIS_WRAPPER, DataType.PLAIN_ASSIGNMENT_DATA);
		
		assertEquals(StatementType.SIMPLE_DATA, statement.getStatementType());
		assertEquals(DataType.PLAIN_ASSIGNMENT_DATA, statement.getDataStatementType());
		assertEquals("{school_id}!=(717)", statement.toString());
		
		TestUtils.print(this.getClass(), "ensurePlainAssignmentDataCreatedSuccessfullyWithOperatorAndMultipleWrapper", statement.toString());
	}
	
	@Test
	public void ensurePlainAssignmentDataCreatedSuccessfullyWithGenericWrapper() {
		DataStatement statement = DataFactory.getData(param, value, WrapperType.BRACKET_WRAPPER, DataType.PLAIN_ASSIGNMENT_DATA);
		
		assertEquals(StatementType.SIMPLE_DATA, statement.getStatementType());
		assertEquals(DataType.PLAIN_ASSIGNMENT_DATA, statement.getDataStatementType());
		assertEquals("[school_id]=[717]", statement.toString());
		
		TestUtils.print(this.getClass(), "ensurePlainAssignmentDataCreatedSuccessfullyWithGenericWrapper", statement.toString());
	}
	
	@Test
	public void ensurePlainAssignmentDataCreatedSuccessfullyWithMultipleWrapper() {
		DataStatement statement = DataFactory.getData(param, value, WrapperType.CURLY_BRACKET_WRAPPER, WrapperType.PARENTHESIS_WRAPPER, DataType.PLAIN_ASSIGNMENT_DATA);
		
		assertEquals(StatementType.SIMPLE_DATA, statement.getStatementType());
		assertEquals(DataType.PLAIN_ASSIGNMENT_DATA, statement.getDataStatementType());
		assertEquals("{school_id}=(717)", statement.toString());
		
		TestUtils.print(this.getClass(), "ensurePlainAssignmentDataCreatedSuccessfullyWithMultipleWrapper", statement.toString());
	}
	
	/*
	 * comparative data constructor calls
	 */
	
	/*
	 * Data Type: GREATER_AND_EQUALS_COMPARATIVE_DATA
	 */
	@Test
	public void ensureGreaterAndEqualsDataCreatedSuccessfully() {
		DataStatement statement = DataFactory.getData(param, value, DataType.GREATER_AND_EQUALS_COMPARATIVE_DATA);
		
		assertEquals(StatementType.SIMPLE_DATA, statement.getStatementType());
		assertEquals(DataType.GREATER_AND_EQUALS_COMPARATIVE_DATA, statement.getDataStatementType());
		assertEquals("school_id>=\"717\"", statement.toString());
		
		TestUtils.print(this.getClass(), "ensureGreaterAndEqualsDataCreatedSuccessfully", statement.toString());
	}
	
	@Test
	public void ensureGreaterAndEqualsDataCreatedSuccessfullyWithOperator() {
		DataStatement statement = DataFactory.getData(param, value, "#>=#", DataType.GREATER_AND_EQUALS_COMPARATIVE_DATA);
		
		assertEquals(StatementType.SIMPLE_DATA, statement.getStatementType());
		assertEquals(DataType.GREATER_AND_EQUALS_COMPARATIVE_DATA, statement.getDataStatementType());
		assertEquals("school_id#>=#\"717\"", statement.toString());
		
		TestUtils.print(this.getClass(), "ensureGreaterAndEqualsDataCreatedSuccessfullyWithOperator", statement.toString());
	}
	
	@Test
	public void ensureGreaterAndEqualsDataCreatedSuccessfullyWithOperatorAndGenericStringWrapper() {
		DataStatement statement = DataFactory.getData(param, value, "#>=#", "'", DataType.GREATER_AND_EQUALS_COMPARATIVE_DATA);
		
		assertEquals(StatementType.SIMPLE_DATA, statement.getStatementType());
		assertEquals(DataType.GREATER_AND_EQUALS_COMPARATIVE_DATA, statement.getDataStatementType());
		assertEquals("'school_id'#>=#'717'", statement.toString());
		
		TestUtils.print(this.getClass(), "ensureGreaterAndEqualsDataCreatedSuccessfullyWithOperatorAndGenericStringWrapper", statement.toString());
	}
	
	@Test
	public void ensureGreaterAndEqualsDataCreatedSuccessfullyWithOperatorAndMultipleStringWrapper() {
		DataStatement statement = DataFactory.getData(param, value, "#>=#", "|", "$", DataType.GREATER_AND_EQUALS_COMPARATIVE_DATA);
		
		assertEquals(StatementType.SIMPLE_DATA, statement.getStatementType());
		assertEquals(DataType.GREATER_AND_EQUALS_COMPARATIVE_DATA, statement.getDataStatementType());
		assertEquals("|school_id|#>=#$717$", statement.toString());
		
		TestUtils.print(this.getClass(), "ensureGreaterAndEqualsDataCreatedSuccessfullyWithOperatorAndMultipleStringWrapper", statement.toString());
	}
	
	@Test
	public void ensureGreaterAndEqualsDataCreatedSuccessfullyWithOperatorAndGenericWrapper() {
		DataStatement statement = DataFactory.getData(param, value, "#>=#", WrapperType.ANGLE_BRACKET_WRAPPER, DataType.GREATER_AND_EQUALS_COMPARATIVE_DATA);
		
		assertEquals(StatementType.SIMPLE_DATA, statement.getStatementType());
		assertEquals(DataType.GREATER_AND_EQUALS_COMPARATIVE_DATA, statement.getDataStatementType());
		assertEquals("<school_id>#>=#<717>", statement.toString());
		
		TestUtils.print(this.getClass(), "ensureGreaterAndEqualsDataCreatedSuccessfullyWithOperatorAndGenericWrapper", statement.toString());
	}
	
	@Test
	public void ensureGreaterAndEqualsDataCreatedSuccessfullyWithOperatorAndMultipleWrapper() {
		DataStatement statement = DataFactory.getData(param, value, "#>=#", WrapperType.ANGLE_BRACKET_WRAPPER, WrapperType.CURLY_BRACKET_WRAPPER, DataType.GREATER_AND_EQUALS_COMPARATIVE_DATA);
		
		assertEquals(StatementType.SIMPLE_DATA, statement.getStatementType());
		assertEquals(DataType.GREATER_AND_EQUALS_COMPARATIVE_DATA, statement.getDataStatementType());
		assertEquals("<school_id>#>=#{717}", statement.toString());
		
		TestUtils.print(this.getClass(), "ensureGreaterAndEqualsDataCreatedSuccessfullyWithOperatorAndMultipleWrapper", statement.toString());
	}
	
	@Test
	public void ensureGreaterAndEqualsDataCreatedSuccessfullyWithGenericWrapper() {
		DataStatement statement = DataFactory.getData(param, value, WrapperType.ANGLE_BRACKET_WRAPPER, DataType.GREATER_AND_EQUALS_COMPARATIVE_DATA);
		
		assertEquals(StatementType.SIMPLE_DATA, statement.getStatementType());
		assertEquals(DataType.GREATER_AND_EQUALS_COMPARATIVE_DATA, statement.getDataStatementType());
		assertEquals("<school_id>>=<717>", statement.toString());
		
		TestUtils.print(this.getClass(), "ensureGreaterAndEqualsDataCreatedSuccessfullyWithGenericWrapper", statement.toString());
	}
	
	@Test
	public void ensureGreaterAndEqualsDataCreatedSuccessfullyWithMultipleWrapper() {
		DataStatement statement = DataFactory.getData(param, value, WrapperType.ANGLE_BRACKET_WRAPPER, WrapperType.CURLY_BRACKET_WRAPPER, DataType.GREATER_AND_EQUALS_COMPARATIVE_DATA);
		
		assertEquals(StatementType.SIMPLE_DATA, statement.getStatementType());
		assertEquals(DataType.GREATER_AND_EQUALS_COMPARATIVE_DATA, statement.getDataStatementType());
		assertEquals("<school_id>>={717}", statement.toString());
		
		TestUtils.print(this.getClass(), "ensureGreaterAndEqualsDataCreatedSuccessfullyWithMultipleWrapper", statement.toString());
	}
	
	/*
	 * Data Type: GREATER_COMPARATIVE_DATA
	 */
	@Test
	public void ensureGreaterDataCreatedSuccessfully() {
		DataStatement statement = DataFactory.getData(param, value, DataType.GREATER_COMPARATIVE_DATA);
		
		assertEquals(StatementType.SIMPLE_DATA, statement.getStatementType());
		assertEquals(DataType.GREATER_COMPARATIVE_DATA, statement.getDataStatementType());
		assertEquals("school_id>\"717\"", statement.toString());
		
		TestUtils.print(this.getClass(), "ensureGreaterDataCreatedSuccessfully", statement.toString());
	}
	
	@Test
	public void ensureGreaterDataCreatedSuccessfullyWithOperator() {
		DataStatement statement = DataFactory.getData(param, value, "#>#", DataType.GREATER_COMPARATIVE_DATA);
		
		assertEquals(StatementType.SIMPLE_DATA, statement.getStatementType());
		assertEquals(DataType.GREATER_COMPARATIVE_DATA, statement.getDataStatementType());
		assertEquals("school_id#>#\"717\"", statement.toString());
		
		TestUtils.print(this.getClass(), "ensureGreaterDataCreatedSuccessfullyWithOperator", statement.toString());
	}
	
	@Test
	public void ensureGreaterDataCreatedSuccessfullyWithOperatorAndGenericStringWrapper() {
		DataStatement statement = DataFactory.getData(param, value, "#>#", "'", DataType.GREATER_COMPARATIVE_DATA);
		
		assertEquals(StatementType.SIMPLE_DATA, statement.getStatementType());
		assertEquals(DataType.GREATER_COMPARATIVE_DATA, statement.getDataStatementType());
		assertEquals("'school_id'#>#'717'", statement.toString());
		
		TestUtils.print(this.getClass(), "ensureGreaterDataCreatedSuccessfullyWithOperatorAndGenericStringWrapper", statement.toString());
	}
	
	@Test
	public void ensureGreaterDataCreatedSuccessfullyWithOperatorAndMultipleStringWrapper() {
		DataStatement statement = DataFactory.getData(param, value, "#>#", "|", "$", DataType.GREATER_COMPARATIVE_DATA);
		
		assertEquals(StatementType.SIMPLE_DATA, statement.getStatementType());
		assertEquals(DataType.GREATER_COMPARATIVE_DATA, statement.getDataStatementType());
		assertEquals("|school_id|#>#$717$", statement.toString());
		
		TestUtils.print(this.getClass(), "ensureGreaterDataCreatedSuccessfullyWithOperatorAndMultipleStringWrapper", statement.toString());
	}
	
	@Test
	public void ensureGreaterDataCreatedSuccessfullyWithOperatorAndGenericWrapper() {
		DataStatement statement = DataFactory.getData(param, value, "#>#", WrapperType.ANGLE_BRACKET_WRAPPER, DataType.GREATER_COMPARATIVE_DATA);
		
		assertEquals(StatementType.SIMPLE_DATA, statement.getStatementType());
		assertEquals(DataType.GREATER_COMPARATIVE_DATA, statement.getDataStatementType());
		assertEquals("<school_id>#>#<717>", statement.toString());
		
		TestUtils.print(this.getClass(), "ensureGreaterDataCreatedSuccessfullyWithOperatorAndGenericWrapper", statement.toString());
	}
	
	@Test
	public void ensureGreaterDataCreatedSuccessfullyWithOperatorAndMultipleWrapper() {
		DataStatement statement = DataFactory.getData(param, value, "#>#", WrapperType.ANGLE_BRACKET_WRAPPER, WrapperType.CURLY_BRACKET_WRAPPER, DataType.GREATER_COMPARATIVE_DATA);
		
		assertEquals(StatementType.SIMPLE_DATA, statement.getStatementType());
		assertEquals(DataType.GREATER_COMPARATIVE_DATA, statement.getDataStatementType());
		assertEquals("<school_id>#>#{717}", statement.toString());
		
		TestUtils.print(this.getClass(), "ensureGreaterDataCreatedSuccessfullyWithOperatorAndMultipleWrapper", statement.toString());
	}
	
	@Test
	public void ensureGreaterDataCreatedSuccessfullyWithGenericWrapper() {
		DataStatement statement = DataFactory.getData(param, value, WrapperType.ANGLE_BRACKET_WRAPPER, DataType.GREATER_COMPARATIVE_DATA);
		
		assertEquals(StatementType.SIMPLE_DATA, statement.getStatementType());
		assertEquals(DataType.GREATER_COMPARATIVE_DATA, statement.getDataStatementType());
		assertEquals("<school_id>><717>", statement.toString());
		
		TestUtils.print(this.getClass(), "ensureGreaterDataCreatedSuccessfullyWithGenericWrapper", statement.toString());
	}
	
	@Test
	public void ensureGreaterDataCreatedSuccessfullyWithMultipleWrapper() {
		DataStatement statement = DataFactory.getData(param, value, WrapperType.ANGLE_BRACKET_WRAPPER, WrapperType.CURLY_BRACKET_WRAPPER, DataType.GREATER_COMPARATIVE_DATA);
		
		assertEquals(StatementType.SIMPLE_DATA, statement.getStatementType());
		assertEquals(DataType.GREATER_COMPARATIVE_DATA, statement.getDataStatementType());
		assertEquals("<school_id>>{717}", statement.toString());
		
		TestUtils.print(this.getClass(), "ensureGreaterDataCreatedSuccessfullyWithMultipleWrapper", statement.toString());
	}
	
	/*
	 * Data Type: SMALLER_AND_EQUALS_COMPARATIVE_DATA
	 */
	@Test
	public void ensureSmallerAndEqualsDataCreatedSuccessfully() {
		DataStatement statement = DataFactory.getData(param, value, DataType.SMALLER_AND_EQUALS_COMPARATIVE_DATA);
		
		assertEquals(StatementType.SIMPLE_DATA, statement.getStatementType());
		assertEquals(DataType.SMALLER_AND_EQUALS_COMPARATIVE_DATA, statement.getDataStatementType());
		assertEquals("school_id<=\"717\"", statement.toString());
		
		TestUtils.print(this.getClass(), "ensureSmallerAndEqualsDataCreatedSuccessfully", statement.toString());
	}
	
	@Test
	public void ensureSmallerAndEqualsDataCreatedSuccessfullyWithOperator() {
		DataStatement statement = DataFactory.getData(param, value, "#<=#", DataType.SMALLER_AND_EQUALS_COMPARATIVE_DATA);
		
		assertEquals(StatementType.SIMPLE_DATA, statement.getStatementType());
		assertEquals(DataType.SMALLER_AND_EQUALS_COMPARATIVE_DATA, statement.getDataStatementType());
		assertEquals("school_id#<=#\"717\"", statement.toString());
		
		TestUtils.print(this.getClass(), "ensureSmallerAndEqualsDataCreatedSuccessfullyWithOperator", statement.toString());
	}
	
	@Test
	public void ensureSmallerAndEqualsDataCreatedSuccessfullyWithOperatorAndGenericStringWrapper() {
		DataStatement statement = DataFactory.getData(param, value, "#<=#", "'", DataType.SMALLER_AND_EQUALS_COMPARATIVE_DATA);
		
		assertEquals(StatementType.SIMPLE_DATA, statement.getStatementType());
		assertEquals(DataType.SMALLER_AND_EQUALS_COMPARATIVE_DATA, statement.getDataStatementType());
		assertEquals("'school_id'#<=#'717'", statement.toString());
		
		TestUtils.print(this.getClass(), "ensureSmallerAndEqualsDataCreatedSuccessfullyWithOperatorAndGenericStringWrapper", statement.toString());
	}
	
	@Test
	public void ensureSmallerAndEqualsDataCreatedSuccessfullyWithOperatorAndMultipleStringWrapper() {
		DataStatement statement = DataFactory.getData(param, value, "#<=#", "|", "$", DataType.SMALLER_AND_EQUALS_COMPARATIVE_DATA);
		
		assertEquals(StatementType.SIMPLE_DATA, statement.getStatementType());
		assertEquals(DataType.SMALLER_AND_EQUALS_COMPARATIVE_DATA, statement.getDataStatementType());
		assertEquals("|school_id|#<=#$717$", statement.toString());
		
		TestUtils.print(this.getClass(), "ensureSmallerAndEqualsDataCreatedSuccessfullyWithOperatorAndMultipleStringWrapper", statement.toString());
	}
	
	@Test
	public void ensureSmallerAndEqualsDataCreatedSuccessfullyWithOperatorAndGenericWrapper() {
		DataStatement statement = DataFactory.getData(param, value, "#<=#", WrapperType.ANGLE_BRACKET_WRAPPER, DataType.SMALLER_AND_EQUALS_COMPARATIVE_DATA);
		
		assertEquals(StatementType.SIMPLE_DATA, statement.getStatementType());
		assertEquals(DataType.SMALLER_AND_EQUALS_COMPARATIVE_DATA, statement.getDataStatementType());
		assertEquals("<school_id>#<=#<717>", statement.toString());
		
		TestUtils.print(this.getClass(), "ensureSmallerAndEqualsDataCreatedSuccessfullyWithOperatorAndGenericWrapper", statement.toString());
	}
	
	@Test
	public void ensureSmallerAndEqualsDataCreatedSuccessfullyWithOperatorAndMultipleWrapper() {
		DataStatement statement = DataFactory.getData(param, value, "#<=#", WrapperType.ANGLE_BRACKET_WRAPPER, WrapperType.CURLY_BRACKET_WRAPPER, DataType.SMALLER_AND_EQUALS_COMPARATIVE_DATA);
		
		assertEquals(StatementType.SIMPLE_DATA, statement.getStatementType());
		assertEquals(DataType.SMALLER_AND_EQUALS_COMPARATIVE_DATA, statement.getDataStatementType());
		assertEquals("<school_id>#<=#{717}", statement.toString());
		
		TestUtils.print(this.getClass(), "ensureSmallerAndEqualsDataCreatedSuccessfullyWithOperatorAndMultipleWrapper", statement.toString());
	}
	
	@Test
	public void ensureSmallerAndEqualsDataCreatedSuccessfullyWithGenericWrapper() {
		DataStatement statement = DataFactory.getData(param, value, WrapperType.ANGLE_BRACKET_WRAPPER, DataType.SMALLER_AND_EQUALS_COMPARATIVE_DATA);
		
		assertEquals(StatementType.SIMPLE_DATA, statement.getStatementType());
		assertEquals(DataType.SMALLER_AND_EQUALS_COMPARATIVE_DATA, statement.getDataStatementType());
		assertEquals("<school_id><=<717>", statement.toString());
		
		TestUtils.print(this.getClass(), "ensureSmallerAndEqualsDataCreatedSuccessfullyWithGenericWrapper", statement.toString());
	}
	
	@Test
	public void ensureSmallerAndEqualsDataCreatedSuccessfullyWithMultipleWrapper() {
		DataStatement statement = DataFactory.getData(param, value, WrapperType.ANGLE_BRACKET_WRAPPER, WrapperType.CURLY_BRACKET_WRAPPER, DataType.SMALLER_AND_EQUALS_COMPARATIVE_DATA);
		
		assertEquals(StatementType.SIMPLE_DATA, statement.getStatementType());
		assertEquals(DataType.SMALLER_AND_EQUALS_COMPARATIVE_DATA, statement.getDataStatementType());
		assertEquals("<school_id><={717}", statement.toString());
		
		TestUtils.print(this.getClass(), "ensureSmallerAndEqualsDataCreatedSuccessfullyWithMultipleWrapper", statement.toString());
	}
	
	/*
	 * Data Type: SMALLER_COMPARATIVE_DATA
	 */
	@Test
	public void ensureSmallerDataCreatedSuccessfully() {
		DataStatement statement = DataFactory.getData(param, value, DataType.SMALLER_COMPARATIVE_DATA);
		
		assertEquals(StatementType.SIMPLE_DATA, statement.getStatementType());
		assertEquals(DataType.SMALLER_COMPARATIVE_DATA, statement.getDataStatementType());
		assertEquals("school_id<\"717\"", statement.toString());
		
		TestUtils.print(this.getClass(), "ensureSmallerDataCreatedSuccessfully", statement.toString());
	}
	
	@Test
	public void ensureSmallerDataCreatedSuccessfullyWithOperator() {
		DataStatement statement = DataFactory.getData(param, value, "#<#", DataType.SMALLER_COMPARATIVE_DATA);
		
		assertEquals(StatementType.SIMPLE_DATA, statement.getStatementType());
		assertEquals(DataType.SMALLER_COMPARATIVE_DATA, statement.getDataStatementType());
		assertEquals("school_id#<#\"717\"", statement.toString());
		
		TestUtils.print(this.getClass(), "ensureSmallerDataCreatedSuccessfullyWithOperator", statement.toString());
	}
	
	@Test
	public void ensureSmallerDataCreatedSuccessfullyWithOperatorAndGenericStringWrapper() {
		DataStatement statement = DataFactory.getData(param, value, "#<#", "'", DataType.SMALLER_COMPARATIVE_DATA);
		
		assertEquals(StatementType.SIMPLE_DATA, statement.getStatementType());
		assertEquals(DataType.SMALLER_COMPARATIVE_DATA, statement.getDataStatementType());
		assertEquals("'school_id'#<#'717'", statement.toString());
		
		TestUtils.print(this.getClass(), "ensureSmallerDataCreatedSuccessfullyWithOperatorAndGenericStringWrapper", statement.toString());
	}
	
	@Test
	public void ensureSmallerDataCreatedSuccessfullyWithOperatorAndMultipleStringWrapper() {
		DataStatement statement = DataFactory.getData(param, value, "#<#", "|", "$", DataType.SMALLER_COMPARATIVE_DATA);
		
		assertEquals(StatementType.SIMPLE_DATA, statement.getStatementType());
		assertEquals(DataType.SMALLER_COMPARATIVE_DATA, statement.getDataStatementType());
		assertEquals("|school_id|#<#$717$", statement.toString());
		
		TestUtils.print(this.getClass(), "ensureSmallerDataCreatedSuccessfullyWithOperatorAndMultipleStringWrapper", statement.toString());
	}
	
	@Test
	public void ensureSmallerDataCreatedSuccessfullyWithOperatorAndGenericWrapper() {
		DataStatement statement = DataFactory.getData(param, value, "#<#", WrapperType.ANGLE_BRACKET_WRAPPER, DataType.SMALLER_COMPARATIVE_DATA);
		
		assertEquals(StatementType.SIMPLE_DATA, statement.getStatementType());
		assertEquals(DataType.SMALLER_COMPARATIVE_DATA, statement.getDataStatementType());
		assertEquals("<school_id>#<#<717>", statement.toString());
		
		TestUtils.print(this.getClass(), "ensureSmallerDataCreatedSuccessfullyWithOperatorAndGenericWrapper", statement.toString());
	}
	
	@Test
	public void ensureSmallerDataCreatedSuccessfullyWithOperatorAndMultipleWrapper() {
		DataStatement statement = DataFactory.getData(param, value, "#<#", WrapperType.ANGLE_BRACKET_WRAPPER, WrapperType.CURLY_BRACKET_WRAPPER, DataType.SMALLER_COMPARATIVE_DATA);
		
		assertEquals(StatementType.SIMPLE_DATA, statement.getStatementType());
		assertEquals(DataType.SMALLER_COMPARATIVE_DATA, statement.getDataStatementType());
		assertEquals("<school_id>#<#{717}", statement.toString());
		
		TestUtils.print(this.getClass(), "ensureSmallerDataCreatedSuccessfullyWithOperatorAndMultipleWrapper", statement.toString());
	}
	
	@Test
	public void ensureSmallerDataCreatedSuccessfullyWithGenericWrapper() {
		DataStatement statement = DataFactory.getData(param, value, WrapperType.ANGLE_BRACKET_WRAPPER, DataType.SMALLER_COMPARATIVE_DATA);
		
		assertEquals(StatementType.SIMPLE_DATA, statement.getStatementType());
		assertEquals(DataType.SMALLER_COMPARATIVE_DATA, statement.getDataStatementType());
		assertEquals("<school_id><<717>", statement.toString());
		
		TestUtils.print(this.getClass(), "ensureSmallerDataCreatedSuccessfullyWithGenericWrapper", statement.toString());
	}
	
	@Test
	public void ensureSmallerDataCreatedSuccessfullyWithMultipleWrapper() {
		DataStatement statement = DataFactory.getData(param, value, WrapperType.ANGLE_BRACKET_WRAPPER, WrapperType.CURLY_BRACKET_WRAPPER, DataType.SMALLER_COMPARATIVE_DATA);
		
		assertEquals(StatementType.SIMPLE_DATA, statement.getStatementType());
		assertEquals(DataType.SMALLER_COMPARATIVE_DATA, statement.getDataStatementType());
		assertEquals("<school_id><{717}", statement.toString());
		
		TestUtils.print(this.getClass(), "ensureSmallerDataCreatedSuccessfullyWithMultipleWrapper", statement.toString());
	}
	
	
}
