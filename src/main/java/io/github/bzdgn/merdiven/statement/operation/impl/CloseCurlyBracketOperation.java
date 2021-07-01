package io.github.bzdgn.merdiven.statement.operation.impl;

import io.github.bzdgn.merdiven.statement.operation.BlockOperationStatement;
import io.github.bzdgn.merdiven.statement.operation.BlockOperationType;
import io.github.bzdgn.merdiven.statement.operation.OperationType;

class CloseCurlyBracketOperation extends BlockOperationStatement {
	
	private static final String DEFAULT_VALUE = "}";
	
	public CloseCurlyBracketOperation() {
		super(OperationType.CLOSE_CURLY_BRACKET, DEFAULT_VALUE, BlockOperationType.END_BLOCK_OPERATION);
	}
	
	public CloseCurlyBracketOperation(String customValue) {
		super(OperationType.CLOSE_CURLY_BRACKET, customValue, BlockOperationType.END_BLOCK_OPERATION);
	}

}
