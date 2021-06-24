package io.github.bzdgn.merdiven.statement.operation.impl;

import io.github.bzdgn.merdiven.statement.operation.Operation;
import io.github.bzdgn.merdiven.statement.operation.OperationStatement;

class OpenBracketOperation extends OperationStatement {
	
	public OpenBracketOperation() {
		super(Operation.OPEN_BRACKET);
	}

	@Override
	public String toString() {
		return "(";
	}

}
