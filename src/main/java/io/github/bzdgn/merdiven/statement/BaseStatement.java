package io.github.bzdgn.merdiven.statement;

public abstract class BaseStatement {

	private final StatementType statementType;

	public StatementType getStatementType() {
		return statementType;
	}

	public BaseStatement(StatementType statementType) {
		this.statementType = statementType;
	}

}
