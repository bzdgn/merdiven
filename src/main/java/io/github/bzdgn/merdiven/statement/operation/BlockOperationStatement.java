package io.github.bzdgn.merdiven.statement.operation;

public class BlockOperationStatement extends OperationStatement {
	
	protected final BlockOperationType blockOperationType;

	public BlockOperationStatement(OperationType operation, String value, BlockOperationType blockOperationType) {
		super(operation, value);
		this.blockOperationType = blockOperationType;
	}

	public BlockOperationType getBlockOperationType() {
		return blockOperationType;
	}
	
}
