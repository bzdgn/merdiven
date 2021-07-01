package io.github.bzdgn.merdiven.statement.operation.impl;

import io.github.bzdgn.merdiven.statement.operation.OperationType;
import io.github.bzdgn.merdiven.statement.operation.OperationStatement;

class EqualsOperation extends OperationStatement {
	
	private static final String DEFAULT_VALUE = "=";
	
	public EqualsOperation() {
		super(OperationType.EQUALS, DEFAULT_VALUE);
	}
	
	public EqualsOperation(String customValue) {
		super(OperationType.EQUALS, customValue);
	}

}
