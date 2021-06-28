package io.github.bzdgn.merdiven.statement.operation.impl;

import io.github.bzdgn.merdiven.statement.operation.BlockOperationStatement;
import io.github.bzdgn.merdiven.statement.operation.BlockOperationType;
import io.github.bzdgn.merdiven.statement.operation.OperationType;

class CloseAngleBracketOperation extends BlockOperationStatement {
	
	private static final String DEFAULT_VALUE = ">";
	
	public CloseAngleBracketOperation() {
		super(OperationType.CLOSE_ANGLE_BRACKET, DEFAULT_VALUE, BlockOperationType.END_BLOCK_OPERATION);
	}
	
	public CloseAngleBracketOperation(String customValue) {
		super(OperationType.CLOSE_ANGLE_BRACKET, customValue, BlockOperationType.END_BLOCK_OPERATION);
	}

}
