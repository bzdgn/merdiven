package io.github.bzdgn.merdiven.statement.operation;

import io.github.bzdgn.merdiven.statement.BaseStatement;
import io.github.bzdgn.merdiven.statement.StatementType;

public abstract class OperationStatement extends BaseStatement {
	
	private final OperationType operation;
	protected String value;
	
	public OperationStatement(OperationType operation, String value) {
		super(StatementType.OPERATION);
		this.operation = operation;
		this.value = value;
	}
	
	public OperationType getOperation() {
		return operation;
	}
	
	@Override
	public String toString() {
		return this.value;
	}
	
}
