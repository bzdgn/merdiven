package io.github.bzdgn.merdiven.statement.operation.impl;

import io.github.bzdgn.merdiven.statement.operation.BlockOperationStatement;
import io.github.bzdgn.merdiven.statement.operation.BlockOperationType;
import io.github.bzdgn.merdiven.statement.operation.OperationType;

class CloseParenthesisOperation extends BlockOperationStatement {
	
	private static final String DEFAULT_VALUE = ")";
	
	public CloseParenthesisOperation() {
		super(OperationType.CLOSE_PARENTHESIS, DEFAULT_VALUE, BlockOperationType.END_BLOCK_OPERATION);
	}
	
	public CloseParenthesisOperation(String customValue) {
		super(OperationType.CLOSE_PARENTHESIS, customValue, BlockOperationType.END_BLOCK_OPERATION);
	}

}
