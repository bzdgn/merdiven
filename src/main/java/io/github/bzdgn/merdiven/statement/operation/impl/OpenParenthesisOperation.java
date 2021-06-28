package io.github.bzdgn.merdiven.statement.operation.impl;

import io.github.bzdgn.merdiven.statement.operation.BlockOperationStatement;
import io.github.bzdgn.merdiven.statement.operation.BlockOperationType;
import io.github.bzdgn.merdiven.statement.operation.OperationType;

class OpenParenthesisOperation extends BlockOperationStatement {
	
	private static final String DEFAULT_VALUE = "(";
	
	public OpenParenthesisOperation() {
		super(OperationType.OPEN_PARENTHESIS, DEFAULT_VALUE, BlockOperationType.START_BLOCK_OPERATION);
	}
	
	public OpenParenthesisOperation(String customValue) {
		super(OperationType.OPEN_PARENTHESIS, customValue, BlockOperationType.START_BLOCK_OPERATION);
	}

}
