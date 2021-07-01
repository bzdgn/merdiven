package io.github.bzdgn.merdiven.statement.operation.impl;

import io.github.bzdgn.merdiven.statement.operation.OperationType;
import io.github.bzdgn.merdiven.statement.operation.OperationStatement;

class AndOperation extends OperationStatement {
	
	private static final String DEFAULT_VALUE = "and";
	
	public AndOperation() {
		super(OperationType.AND, DEFAULT_VALUE);
	}
	
	public AndOperation(String customValue) {
		super(OperationType.AND, customValue);
	}

}
