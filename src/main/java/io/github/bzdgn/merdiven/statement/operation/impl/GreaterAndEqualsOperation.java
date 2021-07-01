package io.github.bzdgn.merdiven.statement.operation.impl;

import io.github.bzdgn.merdiven.statement.operation.OperationType;
import io.github.bzdgn.merdiven.statement.operation.OperationStatement;

class GreaterAndEqualsOperation extends OperationStatement {
	
	private static final String DEFAULT_VALUE = ">=";
	
	public GreaterAndEqualsOperation() {
		super(OperationType.GREATER_AND_EQUALS, DEFAULT_VALUE);
	}
	
	public GreaterAndEqualsOperation(String customValue) {
		super(OperationType.GREATER_AND_EQUALS, customValue);
	}

}
