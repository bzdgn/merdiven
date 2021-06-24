package io.github.bzdgn.merdiven.statement.operation.impl;

import io.github.bzdgn.merdiven.statement.operation.Operation;
import io.github.bzdgn.merdiven.statement.operation.OperationStatement;

class CloseBracketOperation extends OperationStatement {
	
	public CloseBracketOperation() {
		super(Operation.CLOSE_BRACKET);
	}

	@Override
	public String toString() {
		return ")";
	}

}
