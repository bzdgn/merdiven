package io.github.bzdgn.merdiven.statement.operation;

import io.github.bzdgn.merdiven.statement.BaseStatement;
import io.github.bzdgn.merdiven.statement.StatementType;

public abstract class OperationStatement extends BaseStatement {
	
	private final Operation operation;

	public OperationStatement(Operation operation) {
		super(StatementType.OPERATION);
		this.operation = operation;
	}
	
	public Operation getOperation() {
		return operation;
	}
	
	@Override
	public abstract String toString();
	
}
