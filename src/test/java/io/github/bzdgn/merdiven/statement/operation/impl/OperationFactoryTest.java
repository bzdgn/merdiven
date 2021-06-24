package io.github.bzdgn.merdiven.statement.operation.impl;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import io.github.bzdgn.merdiven.statement.StatementType;
import io.github.bzdgn.merdiven.statement.operation.Operation;
import io.github.bzdgn.merdiven.statement.operation.OperationStatement;

public class OperationFactoryTest {
	
	@Test
	public void ensureAndOperationCreatedSuccessfully() {
		OperationStatement statement = OperationFactory.getOperation(Operation.AND);
		
		assertEquals(StatementType.OPERATION, statement.getStatementType());
		assertEquals(Operation.AND, statement.getOperation());
	}
	
	@Test
	public void ensureOrOperationCreatedSuccessfully() {
		OperationStatement statement = OperationFactory.getOperation(Operation.OR);
		
		assertEquals(StatementType.OPERATION, statement.getStatementType());
		assertEquals(Operation.OR, statement.getOperation());
	}
	
	@Test
	public void ensureOpenBracketOperationCreatedSuccessfully() {
		OperationStatement statement = OperationFactory.getOperation(Operation.OPEN_BRACKET);
		
		assertEquals(StatementType.OPERATION, statement.getStatementType());
		assertEquals(Operation.OPEN_BRACKET, statement.getOperation());
	}
	
	@Test
	public void ensureCloseBracketOperationCreatedSuccessfully() {
		OperationStatement statement = OperationFactory.getOperation(Operation.CLOSE_BRACKET);
		
		assertEquals(StatementType.OPERATION, statement.getStatementType());
		assertEquals(Operation.CLOSE_BRACKET, statement.getOperation());
	}

}
