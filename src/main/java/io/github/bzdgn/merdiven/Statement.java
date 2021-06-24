package io.github.bzdgn.merdiven;

import java.util.ArrayList;
import java.util.List;

import io.github.bzdgn.merdiven.statement.BaseStatement;
import io.github.bzdgn.merdiven.statement.data.DataStatement;
import io.github.bzdgn.merdiven.statement.operation.Operation;
import io.github.bzdgn.merdiven.statement.operation.impl.OperationFactory;

public class Statement {

	private final List<BaseStatement> statements;

	public Statement(StatementBuilder queryBuilder) {
		this.statements = queryBuilder.statements;
	}

	public static class StatementBuilder {
		private List<BaseStatement> statements;

		public StatementBuilder() {
			statements = new ArrayList<>();
		}

		public StatementBuilder add(String param, String value) {
			if (param != null && param != "") {
				param = param.trim();

				if (value != null && value.isEmpty()) {
					value = value.trim();
				}

				statements.add(new DataStatement(param, value));
			}

			return this;
		}

		public StatementBuilder and() {
			statements.add(OperationFactory.getOperation(Operation.AND));

			return this;
		}

		public StatementBuilder or() {
			statements.add(OperationFactory.getOperation(Operation.OR));

			return this;
		}

		public StatementBuilder openBracket() {
			statements.add(OperationFactory.getOperation(Operation.OPEN_BRACKET));

			return this;
		}

		public StatementBuilder closeBracket() {
			statements.add(OperationFactory.getOperation(Operation.CLOSE_BRACKET));

			return this;
		}

		public Statement build() {
			return new Statement(this);
		}

	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		for (BaseStatement statement : statements) {
			builder.append(statement.toString());
			builder.append(" ");
		}

		return builder.toString();
	}

}
