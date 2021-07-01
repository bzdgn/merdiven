package io.github.bzdgn.merdiven.statement.operation.impl;

import io.github.bzdgn.merdiven.statement.operation.OperationType;
import io.github.bzdgn.merdiven.statement.operation.OperationStatement;

class CustomOperation extends OperationStatement {
	
	public CustomOperation(String customValue) {
		super(OperationType.CUSTOM, customValue);
	}

}
