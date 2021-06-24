package io.github.bzdgn.merdiven.statement.operation.impl;

import io.github.bzdgn.merdiven.statement.operation.Operation;
import io.github.bzdgn.merdiven.statement.operation.OperationStatement;

class OrOperation extends OperationStatement {
	
	public OrOperation() {
		super(Operation.OR);
	}

	@Override
	public String toString() {
		return "or";
	}

}
