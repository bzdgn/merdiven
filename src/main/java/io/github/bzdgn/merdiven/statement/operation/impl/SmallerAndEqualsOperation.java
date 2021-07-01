package io.github.bzdgn.merdiven.statement.operation.impl;

import io.github.bzdgn.merdiven.statement.operation.OperationType;
import io.github.bzdgn.merdiven.statement.operation.OperationStatement;

class SmallerAndEqualsOperation extends OperationStatement {
	
	private static final String DEFAULT_VALUE = "<=";
	
	public SmallerAndEqualsOperation() {
		super(OperationType.SMALLER_AND_EQUALS, DEFAULT_VALUE);
	}
	
	public SmallerAndEqualsOperation(String customValue) {
		super(OperationType.SMALLER_AND_EQUALS, customValue);
	}

}
