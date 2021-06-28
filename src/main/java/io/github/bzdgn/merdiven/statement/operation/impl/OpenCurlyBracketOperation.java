package io.github.bzdgn.merdiven.statement.operation.impl;

import io.github.bzdgn.merdiven.statement.operation.BlockOperationStatement;
import io.github.bzdgn.merdiven.statement.operation.BlockOperationType;
import io.github.bzdgn.merdiven.statement.operation.OperationType;

class OpenCurlyBracketOperation extends BlockOperationStatement {
	
	private static final String DEFAULT_VALUE = "{";
	
	public OpenCurlyBracketOperation() {
		super(OperationType.OPEN_CURLY_BRACKET, DEFAULT_VALUE, BlockOperationType.START_BLOCK_OPERATION);
	}
	
	public OpenCurlyBracketOperation(String customValue) {
		super(OperationType.OPEN_CURLY_BRACKET, customValue, BlockOperationType.START_BLOCK_OPERATION);
	}

}
