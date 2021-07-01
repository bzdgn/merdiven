package io.github.bzdgn.merdiven.statement.operation.impl;

import io.github.bzdgn.merdiven.statement.operation.BlockOperationStatement;
import io.github.bzdgn.merdiven.statement.operation.BlockOperationType;
import io.github.bzdgn.merdiven.statement.operation.OperationType;

class OpenBracketOperation extends BlockOperationStatement {
	
	private static final String DEFAULT_VALUE = "[";
	
	public OpenBracketOperation() {
		super(OperationType.OPEN_BRACKET, DEFAULT_VALUE, BlockOperationType.START_BLOCK_OPERATION);
	}
	
	public OpenBracketOperation(String customValue) {
		super(OperationType.OPEN_BRACKET, customValue, BlockOperationType.START_BLOCK_OPERATION);
	}

}
