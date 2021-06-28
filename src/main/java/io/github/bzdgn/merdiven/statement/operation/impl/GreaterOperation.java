package io.github.bzdgn.merdiven.statement.operation.impl;

import io.github.bzdgn.merdiven.statement.operation.OperationType;
import io.github.bzdgn.merdiven.statement.operation.OperationStatement;

class GreaterOperation extends OperationStatement {
	
	private static final String DEFAULT_VALUE = ">";
	
	public GreaterOperation() {
		super(OperationType.GREATER, DEFAULT_VALUE);
	}
	
	public GreaterOperation(String customValue) {
		super(OperationType.GREATER, customValue);
	}

}
