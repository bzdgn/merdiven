package io.github.bzdgn.merdiven.statement.operation.impl;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import io.github.bzdgn.merdiven.statement.StatementType;
import io.github.bzdgn.merdiven.statement.operation.BlockOperationStatement;
import io.github.bzdgn.merdiven.statement.operation.BlockOperationType;
import io.github.bzdgn.merdiven.statement.operation.OperationType;
import io.github.bzdgn.merdiven.statement.operation.OperationStatement;

public class OperationFactoryTest {
	
	/*
	 * default constructor calls
	 */
	@Test
	public void ensureAndOperationCreatedSuccessfully() {
		OperationStatement statement = OperationFactory.getOperation(OperationType.AND);
		
		assertEquals(StatementType.OPERATION, statement.getStatementType());
		assertEquals(OperationType.AND, statement.getOperation());
		assertEquals("and", statement.toString());
	}
	
	@Test
	public void ensureOrOperationCreatedSuccessfully() {
		OperationStatement statement = OperationFactory.getOperation(OperationType.OR);
		
		assertEquals(StatementType.OPERATION, statement.getStatementType());
		assertEquals(OperationType.OR, statement.getOperation());
		assertEquals("or", statement.toString());
	}
	
	@Test
	public void ensureEqualsOperationCreatedSuccessfully() {
		OperationStatement statement = OperationFactory.getOperation(OperationType.EQUALS);
		
		assertEquals(StatementType.OPERATION, statement.getStatementType());
		assertEquals(OperationType.EQUALS, statement.getOperation());
		assertEquals("=", statement.toString());
	}
	
	@Test
	public void ensureGreaterOperationCreatedSuccessfully() {
		OperationStatement statement = OperationFactory.getOperation(OperationType.GREATER);
		
		assertEquals(StatementType.OPERATION, statement.getStatementType());
		assertEquals(OperationType.GREATER, statement.getOperation());
		assertEquals(">", statement.toString());
	}
	
	@Test
	public void ensureGreaterAndEqualsOperationCreatedSuccessfully() {
		OperationStatement statement = OperationFactory.getOperation(OperationType.GREATER_AND_EQUALS);
		
		assertEquals(StatementType.OPERATION, statement.getStatementType());
		assertEquals(OperationType.GREATER_AND_EQUALS, statement.getOperation());
		assertEquals(">=", statement.toString());
	}
	
	@Test
	public void ensureSmallerOperationCreatedSuccessfully() {
		OperationStatement statement = OperationFactory.getOperation(OperationType.SMALLER);
		
		assertEquals(StatementType.OPERATION, statement.getStatementType());
		assertEquals(OperationType.SMALLER, statement.getOperation());
		assertEquals("<", statement.toString());
	}
	
	@Test
	public void ensureSmallerAndEqualsOperationCreatedSuccessfully() {
		OperationStatement statement = OperationFactory.getOperation(OperationType.SMALLER_AND_EQUALS);
		
		assertEquals(StatementType.OPERATION, statement.getStatementType());
		assertEquals(OperationType.SMALLER_AND_EQUALS, statement.getOperation());
		assertEquals("<=", statement.toString());
	}
	
	@Test
	public void ensureOpenParenthesisOperationCreatedSuccessfully() {
		OperationStatement statement = OperationFactory.getOperation(OperationType.OPEN_PARENTHESIS);
		
		assertEquals(StatementType.OPERATION, statement.getStatementType());
		assertEquals(OperationType.OPEN_PARENTHESIS, statement.getOperation());
		assertEquals(BlockOperationType.START_BLOCK_OPERATION, ((BlockOperationStatement)statement).getBlockOperationType());
		assertEquals("(", statement.toString());
	}
	
	@Test
	public void ensureCloseParenthesisOperationCreatedSuccessfully() {
		OperationStatement statement = OperationFactory.getOperation(OperationType.CLOSE_PARENTHESIS);
		
		assertEquals(StatementType.OPERATION, statement.getStatementType());
		assertEquals(OperationType.CLOSE_PARENTHESIS, statement.getOperation());
		assertEquals(BlockOperationType.END_BLOCK_OPERATION, ((BlockOperationStatement)statement).getBlockOperationType());
		assertEquals(")", statement.toString());
	}
	
	@Test
	public void ensureOpenBracketOperationCreatedSuccessfully() {
		OperationStatement statement = OperationFactory.getOperation(OperationType.OPEN_BRACKET);
		
		assertEquals(StatementType.OPERATION, statement.getStatementType());
		assertEquals(OperationType.OPEN_BRACKET, statement.getOperation());
		assertEquals(BlockOperationType.START_BLOCK_OPERATION, ((BlockOperationStatement)statement).getBlockOperationType());
		assertEquals("[", statement.toString());
	}
	
	@Test
	public void ensureCloseBracketOperationCreatedSuccessfully() {
		OperationStatement statement = OperationFactory.getOperation(OperationType.CLOSE_BRACKET);
		
		assertEquals(StatementType.OPERATION, statement.getStatementType());
		assertEquals(OperationType.CLOSE_BRACKET, statement.getOperation());
		assertEquals(BlockOperationType.END_BLOCK_OPERATION, ((BlockOperationStatement)statement).getBlockOperationType());
		assertEquals("]", statement.toString());
	}
	
	@Test
	public void ensureOpenAngleBracketOperationCreatedSuccessfully() {
		OperationStatement statement = OperationFactory.getOperation(OperationType.OPEN_ANGLE_BRACKET);
		
		assertEquals(StatementType.OPERATION, statement.getStatementType());
		assertEquals(OperationType.OPEN_ANGLE_BRACKET, statement.getOperation());
		assertEquals(BlockOperationType.START_BLOCK_OPERATION, ((BlockOperationStatement)statement).getBlockOperationType());
		assertEquals("<", statement.toString());
	}
	
	@Test
	public void ensureCloseAngleBracketOperationCreatedSuccessfully() {
		OperationStatement statement = OperationFactory.getOperation(OperationType.CLOSE_ANGLE_BRACKET);
		
		assertEquals(StatementType.OPERATION, statement.getStatementType());
		assertEquals(OperationType.CLOSE_ANGLE_BRACKET, statement.getOperation());
		assertEquals(BlockOperationType.END_BLOCK_OPERATION, ((BlockOperationStatement)statement).getBlockOperationType());
		assertEquals(">", statement.toString());
	}
	
	@Test
	public void ensureOpenCurlyBracketOperationCreatedSuccessfully() {
		OperationStatement statement = OperationFactory.getOperation(OperationType.OPEN_CURLY_BRACKET);
		
		assertEquals(StatementType.OPERATION, statement.getStatementType());
		assertEquals(OperationType.OPEN_CURLY_BRACKET, statement.getOperation());
		assertEquals(BlockOperationType.START_BLOCK_OPERATION, ((BlockOperationStatement)statement).getBlockOperationType());
		assertEquals("{", statement.toString());
	}
	
	@Test
	public void ensureCloseCurlyBracketOperationCreatedSuccessfully() {
		OperationStatement statement = OperationFactory.getOperation(OperationType.CLOSE_CURLY_BRACKET);
		
		assertEquals(StatementType.OPERATION, statement.getStatementType());
		assertEquals(OperationType.CLOSE_CURLY_BRACKET, statement.getOperation());
		assertEquals(BlockOperationType.END_BLOCK_OPERATION, ((BlockOperationStatement)statement).getBlockOperationType());
		assertEquals("}", statement.toString());
	}
	
	/*
	 * parameter constructor calls
	 */
	@Test
	public void ensureAndOperationWithValueCreatedSuccessfully() {
		String value = "--AND--";
		OperationStatement statement = OperationFactory.getOperation(OperationType.AND, value);
		
		assertEquals(StatementType.OPERATION, statement.getStatementType());
		assertEquals(OperationType.AND, statement.getOperation());
		assertEquals(value, statement.toString());
	}
	
	@Test
	public void ensureOrOperationWithValueCreatedSuccessfully() {
		String value = "--OR--";
		OperationStatement statement = OperationFactory.getOperation(OperationType.OR, value);
		
		assertEquals(StatementType.OPERATION, statement.getStatementType());
		assertEquals(OperationType.OR, statement.getOperation());
		assertEquals(value, statement.toString());
	}
	
	@Test
	public void ensureGreaterAndEqualsOperationWithValueCreatedSuccessfully() {
		String value = "-->=--";
		OperationStatement statement = OperationFactory.getOperation(OperationType.GREATER_AND_EQUALS, value);
		
		assertEquals(StatementType.OPERATION, statement.getStatementType());
		assertEquals(OperationType.GREATER_AND_EQUALS, statement.getOperation());
		assertEquals(value, statement.toString());
	}
	
	@Test
	public void ensureSmallerOperationWithValueCreatedSuccessfully() {
		String value = "--<--";
		OperationStatement statement = OperationFactory.getOperation(OperationType.SMALLER, value);
		
		assertEquals(StatementType.OPERATION, statement.getStatementType());
		assertEquals(OperationType.SMALLER, statement.getOperation());
		assertEquals(value, statement.toString());
	}
	
	@Test
	public void ensureSmallerAndEqualsOperationWithValueCreatedSuccessfully() {
		String value = "--<=--";
		OperationStatement statement = OperationFactory.getOperation(OperationType.SMALLER_AND_EQUALS, value);
		
		assertEquals(StatementType.OPERATION, statement.getStatementType());
		assertEquals(OperationType.SMALLER_AND_EQUALS, statement.getOperation());
		assertEquals(value, statement.toString());
	}
	
	@Test
	public void ensureOpenParenthesisOperationWithValueCreatedSuccessfully() {
		String value = "--(--";
		OperationStatement statement = OperationFactory.getOperation(OperationType.OPEN_PARENTHESIS, value);
		
		assertEquals(StatementType.OPERATION, statement.getStatementType());
		assertEquals(OperationType.OPEN_PARENTHESIS, statement.getOperation());
		assertEquals(BlockOperationType.START_BLOCK_OPERATION, ((BlockOperationStatement)statement).getBlockOperationType());
		assertEquals(value, statement.toString());
	}
	
	@Test
	public void ensureCloseParenthesisOperationWithValueCreatedSuccessfully() {
		String value = "--)--";
		OperationStatement statement = OperationFactory.getOperation(OperationType.CLOSE_PARENTHESIS, value);
		
		assertEquals(StatementType.OPERATION, statement.getStatementType());
		assertEquals(OperationType.CLOSE_PARENTHESIS, statement.getOperation());
		assertEquals(BlockOperationType.END_BLOCK_OPERATION, ((BlockOperationStatement)statement).getBlockOperationType());
		assertEquals(value, statement.toString());
	}
	
	@Test
	public void ensureOpenBracketOperationWithValueCreatedSuccessfully() {
		String value = "--[--";
		OperationStatement statement = OperationFactory.getOperation(OperationType.OPEN_BRACKET, value);
		
		assertEquals(StatementType.OPERATION, statement.getStatementType());
		assertEquals(OperationType.OPEN_BRACKET, statement.getOperation());
		assertEquals(BlockOperationType.START_BLOCK_OPERATION, ((BlockOperationStatement)statement).getBlockOperationType());
		assertEquals(value, statement.toString());
	}
	
	@Test
	public void ensureCloseBracketOperationWithValueCreatedSuccessfully() {
		String value = "--]--";
		OperationStatement statement = OperationFactory.getOperation(OperationType.CLOSE_BRACKET, value);
		
		assertEquals(StatementType.OPERATION, statement.getStatementType());
		assertEquals(OperationType.CLOSE_BRACKET, statement.getOperation());
		assertEquals(BlockOperationType.END_BLOCK_OPERATION, ((BlockOperationStatement)statement).getBlockOperationType());
		assertEquals(value, statement.toString());
	}
	
	@Test
	public void ensureOpenCurlyBracketOperationWithValueCreatedSuccessfully() {
		String value = "--{--";
		OperationStatement statement = OperationFactory.getOperation(OperationType.OPEN_CURLY_BRACKET, value);
		
		assertEquals(StatementType.OPERATION, statement.getStatementType());
		assertEquals(OperationType.OPEN_CURLY_BRACKET, statement.getOperation());
		assertEquals(BlockOperationType.START_BLOCK_OPERATION, ((BlockOperationStatement)statement).getBlockOperationType());
		assertEquals(value, statement.toString());
	}
	
	@Test
	public void ensureCloseCurlyBracketOperationWithValueCreatedSuccessfully() {
		String value = "--}--";
		OperationStatement statement = OperationFactory.getOperation(OperationType.CLOSE_CURLY_BRACKET, value);
		
		assertEquals(StatementType.OPERATION, statement.getStatementType());
		assertEquals(OperationType.CLOSE_CURLY_BRACKET, statement.getOperation());
		assertEquals(BlockOperationType.END_BLOCK_OPERATION, ((BlockOperationStatement)statement).getBlockOperationType());
		assertEquals(value, statement.toString());
	}
	
	// custom operation
	@Test
	public void ensureCustomOperationWithValueCreatedSuccessfully() {
		String value = "--|||--";	// some custom operation example
		OperationStatement statement = OperationFactory.getOperation(OperationType.CUSTOM, value);
		
		assertEquals(StatementType.OPERATION, statement.getStatementType());
		assertEquals(OperationType.CUSTOM, statement.getOperation());
		assertEquals(value, statement.toString());
	}

}
