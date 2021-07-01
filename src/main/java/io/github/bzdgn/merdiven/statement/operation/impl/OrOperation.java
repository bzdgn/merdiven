package io.github.bzdgn.merdiven.statement.operation.impl;

import io.github.bzdgn.merdiven.statement.operation.OperationType;
import io.github.bzdgn.merdiven.statement.operation.OperationStatement;

class OrOperation extends OperationStatement {
	
	private static final String DEFAULT_VALUE = "or";
	
	public OrOperation() {
		super(OperationType.OR, DEFAULT_VALUE);
	}
	
	public OrOperation(String customValue) {
		super(OperationType.OR, customValue);
	}

}
