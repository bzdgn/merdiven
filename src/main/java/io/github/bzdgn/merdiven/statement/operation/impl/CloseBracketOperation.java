package io.github.bzdgn.merdiven.statement.operation.impl;

import io.github.bzdgn.merdiven.statement.operation.BlockOperationStatement;
import io.github.bzdgn.merdiven.statement.operation.BlockOperationType;
import io.github.bzdgn.merdiven.statement.operation.OperationType;

class CloseBracketOperation extends BlockOperationStatement {
	
	private static final String DEFAULT_VALUE = "]";
	
	public CloseBracketOperation() {
		super(OperationType.CLOSE_BRACKET, DEFAULT_VALUE, BlockOperationType.END_BLOCK_OPERATION);
	}
	
	public CloseBracketOperation(String customValue) {
		super(OperationType.CLOSE_BRACKET, customValue, BlockOperationType.END_BLOCK_OPERATION);
	}

}
