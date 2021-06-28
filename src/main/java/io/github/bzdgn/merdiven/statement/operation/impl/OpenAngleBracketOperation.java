package io.github.bzdgn.merdiven.statement.operation.impl;

import io.github.bzdgn.merdiven.statement.operation.BlockOperationStatement;
import io.github.bzdgn.merdiven.statement.operation.BlockOperationType;
import io.github.bzdgn.merdiven.statement.operation.OperationType;

class OpenAngleBracketOperation extends BlockOperationStatement {
	
	private static final String DEFAULT_VALUE = "<";
	
	public OpenAngleBracketOperation() {
		super(OperationType.OPEN_ANGLE_BRACKET, DEFAULT_VALUE, BlockOperationType.START_BLOCK_OPERATION);
	}
	
	public OpenAngleBracketOperation(String customValue) {
		super(OperationType.OPEN_ANGLE_BRACKET, customValue, BlockOperationType.START_BLOCK_OPERATION);
	}

}
