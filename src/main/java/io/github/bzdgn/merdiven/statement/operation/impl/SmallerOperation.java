package io.github.bzdgn.merdiven.statement.operation.impl;

import io.github.bzdgn.merdiven.statement.operation.OperationType;
import io.github.bzdgn.merdiven.statement.operation.OperationStatement;

class SmallerOperation extends OperationStatement {
	
	private static final String DEFAULT_VALUE = "<";
	
	public SmallerOperation() {
		super(OperationType.SMALLER, DEFAULT_VALUE);
	}
	
	public SmallerOperation(String customValue) {
		super(OperationType.SMALLER, customValue);
	}

}
