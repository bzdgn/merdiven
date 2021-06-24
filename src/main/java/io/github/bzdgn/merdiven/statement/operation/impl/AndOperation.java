package io.github.bzdgn.merdiven.statement.operation.impl;

import io.github.bzdgn.merdiven.statement.operation.Operation;
import io.github.bzdgn.merdiven.statement.operation.OperationStatement;

class AndOperation extends OperationStatement {
	
	public AndOperation() {
		super(Operation.AND);
	}

	@Override
	public String toString() {
		return "and";
	}

}
