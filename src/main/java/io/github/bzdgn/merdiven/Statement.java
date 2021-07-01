package io.github.bzdgn.merdiven;

import java.util.ArrayList;
import java.util.List;

import io.github.bzdgn.merdiven.statement.BaseStatement;
import io.github.bzdgn.merdiven.statement.data.DataType;
import io.github.bzdgn.merdiven.statement.data.impl.DataFactory;
import io.github.bzdgn.merdiven.statement.data.wrapper.WrapperType;
import io.github.bzdgn.merdiven.statement.operation.OperationType;
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
		
		/*
		 * add operation for simple field or value as param
		 */
		public StatementBuilder addParam(String param) {
			if (param != null && param != "") {
				param = param.trim();
				
				statements.add(DataFactory.getData(param, null, DataType.FIELD_DATA));
			}

			return this;
		}
		
		public StatementBuilder addParam(String param, String wrapper) {
			if (param != null && param != "") {
				param = param.trim();

				statements.add(DataFactory.getData(param, null, null, wrapper, DataType.FIELD_DATA));
			}

			return this;
		}
		
		public StatementBuilder addParam(String param, WrapperType paramWrapperType) {
			if (param != null && param != "") {
				param = param.trim();
				
				statements.add(DataFactory.getData(param, null, paramWrapperType, null, DataType.FIELD_DATA));
			}

			return this;
		}
		
		/*
		 * add operations for simple assignment with argument constructors
		 */
		public StatementBuilder add(String param, String value) {
			if (param != null && param != "") {
				param = param.trim();

				if (value != null && value.isEmpty()) {
					value = value.trim();
				}
				
				statements.add(DataFactory.getData(param, value, DataType.PLAIN_ASSIGNMENT_DATA));
			}

			return this;
		}
		
		public StatementBuilder add(String param, String value, String operator) {
			if (param != null && param != "") {
				param = param.trim();

				if (value != null && value.isEmpty()) {
					value = value.trim();
				}
				
				statements.add(DataFactory.getData(param, value, operator, DataType.PLAIN_ASSIGNMENT_DATA));
			}

			return this;
		}
		
		public StatementBuilder add(String param, String value, String operator, String wrapper) {
			if (param != null && param != "") {
				param = param.trim();

				if (value != null && value.isEmpty()) {
					value = value.trim();
				}
				
				statements.add(DataFactory.getData(param, value, operator, wrapper, DataType.PLAIN_ASSIGNMENT_DATA));
			}

			return this;
		}
		
		public StatementBuilder add(String param, String value, String operator, String paramWrapper, String valueWrapper) {
			if (param != null && param != "") {
				param = param.trim();

				if (value != null && value.isEmpty()) {
					value = value.trim();
				}

				statements.add(DataFactory.getData(param, value, operator, paramWrapper, valueWrapper, DataType.PLAIN_ASSIGNMENT_DATA));
			}

			return this;
		}
		
		/*
		 * add with comparative operators
		 */
		
		/*
		 * add with Greater
		 */
		public StatementBuilder addGr(String param, String value) {
			if (param != null && param != "") {
				param = param.trim();

				if (value != null && value.isEmpty()) {
					value = value.trim();
				}
				
				statements.add(DataFactory.getData(param, value, DataType.GREATER_COMPARATIVE_DATA));
			}

			return this;
		}
		
		public StatementBuilder addGr(String param, String value, String wrapper) {
			if (param != null && param != "") {
				param = param.trim();

				if (value != null && value.isEmpty()) {
					value = value.trim();
				}
				
				statements.add(DataFactory.getData(param, value, null, wrapper, DataType.GREATER_COMPARATIVE_DATA));
			}

			return this;
		}
		
		public StatementBuilder addGr(String param, String value, String paramWrapper, String valueWrapper) {
			if (param != null && param != "") {
				param = param.trim();

				if (value != null && value.isEmpty()) {
					value = value.trim();
				}
				
				statements.add(DataFactory.getData(param, value, null, paramWrapper, valueWrapper, DataType.GREATER_COMPARATIVE_DATA));
			}

			return this;
		}
		
		public StatementBuilder addGr(String param, String value, WrapperType wrapperType) {
			if (param != null && param != "") {
				param = param.trim();

				if (value != null && value.isEmpty()) {
					value = value.trim();
				}
				
				statements.add(DataFactory.getData(param, value, wrapperType, DataType.GREATER_COMPARATIVE_DATA));
			}

			return this;
		}
		
		public StatementBuilder addGr(String param, String value, WrapperType paramWrapperType, WrapperType valueWrapperType) {
			if (param != null && param != "") {
				param = param.trim();

				if (value != null && value.isEmpty()) {
					value = value.trim();
				}
				
				statements.add(DataFactory.getData(param, value, paramWrapperType, valueWrapperType, DataType.GREATER_COMPARATIVE_DATA));
			}

			return this;
		}
		
		/*
		 * add with Greater And Equals
		 */
		public StatementBuilder addGrEq(String param, String value) {
			if (param != null && param != "") {
				param = param.trim();

				if (value != null && value.isEmpty()) {
					value = value.trim();
				}
				
				statements.add(DataFactory.getData(param, value, DataType.GREATER_AND_EQUALS_COMPARATIVE_DATA));
			}

			return this;
		}
		
		public StatementBuilder addGrEq(String param, String value, String wrapper) {
			if (param != null && param != "") {
				param = param.trim();

				if (value != null && value.isEmpty()) {
					value = value.trim();
				}
				
				statements.add(DataFactory.getData(param, value, null, wrapper, DataType.GREATER_AND_EQUALS_COMPARATIVE_DATA));
			}

			return this;
		}
		
		public StatementBuilder addGrEq(String param, String value, String paramWrapper, String valueWrapper) {
			if (param != null && param != "") {
				param = param.trim();

				if (value != null && value.isEmpty()) {
					value = value.trim();
				}
				
				statements.add(DataFactory.getData(param, value, null, paramWrapper, valueWrapper, DataType.GREATER_AND_EQUALS_COMPARATIVE_DATA));
			}

			return this;
		}
		
		public StatementBuilder addGrEq(String param, String value, WrapperType wrapperType) {
			if (param != null && param != "") {
				param = param.trim();

				if (value != null && value.isEmpty()) {
					value = value.trim();
				}
				
				statements.add(DataFactory.getData(param, value, wrapperType, DataType.GREATER_AND_EQUALS_COMPARATIVE_DATA));
			}

			return this;
		}
		
		public StatementBuilder addGrEq(String param, String value, WrapperType paramWrapperType, WrapperType valueWrapperType) {
			if (param != null && param != "") {
				param = param.trim();

				if (value != null && value.isEmpty()) {
					value = value.trim();
				}
				
				statements.add(DataFactory.getData(param, value, paramWrapperType, valueWrapperType, DataType.GREATER_AND_EQUALS_COMPARATIVE_DATA));
			}

			return this;
		}
		
		/*
		 * add with Smaller
		 */
		public StatementBuilder addSm(String param, String value) {
			if (param != null && param != "") {
				param = param.trim();

				if (value != null && value.isEmpty()) {
					value = value.trim();
				}
				
				statements.add(DataFactory.getData(param, value, DataType.SMALLER_COMPARATIVE_DATA));
			}

			return this;
		}
		
		public StatementBuilder addSm(String param, String value, String wrapper) {
			if (param != null && param != "") {
				param = param.trim();

				if (value != null && value.isEmpty()) {
					value = value.trim();
				}
				
				statements.add(DataFactory.getData(param, value, null, wrapper, DataType.SMALLER_COMPARATIVE_DATA));
			}

			return this;
		}
		
		public StatementBuilder addSm(String param, String value, String paramWrapper, String valueWrapper) {
			if (param != null && param != "") {
				param = param.trim();

				if (value != null && value.isEmpty()) {
					value = value.trim();
				}
				
				statements.add(DataFactory.getData(param, value, null, paramWrapper, valueWrapper, DataType.SMALLER_COMPARATIVE_DATA));
			}

			return this;
		}
		
		public StatementBuilder addSm(String param, String value, WrapperType wrapperType) {
			if (param != null && param != "") {
				param = param.trim();

				if (value != null && value.isEmpty()) {
					value = value.trim();
				}
				
				statements.add(DataFactory.getData(param, value, wrapperType, DataType.SMALLER_COMPARATIVE_DATA));
			}

			return this;
		}
		
		public StatementBuilder addSm(String param, String value, WrapperType paramWrapperType, WrapperType valueWrapperType) {
			if (param != null && param != "") {
				param = param.trim();

				if (value != null && value.isEmpty()) {
					value = value.trim();
				}
				
				statements.add(DataFactory.getData(param, value, paramWrapperType, valueWrapperType, DataType.SMALLER_COMPARATIVE_DATA));
			}

			return this;
		}
		
		
		/*
		 * 
		 * 
		 * 
		 * 
		 * 
		 */
		
		/*
		 * add with Smaller And Equals
		 */
		public StatementBuilder addSmEq(String param, String value) {
			if (param != null && param != "") {
				param = param.trim();

				if (value != null && value.isEmpty()) {
					value = value.trim();
				}
				
				statements.add(DataFactory.getData(param, value, DataType.SMALLER_AND_EQUALS_COMPARATIVE_DATA));
			}

			return this;
		}
		
		public StatementBuilder addSmEq(String param, String value, String wrapper) {
			if (param != null && param != "") {
				param = param.trim();

				if (value != null && value.isEmpty()) {
					value = value.trim();
				}
				
				statements.add(DataFactory.getData(param, value, null, wrapper, DataType.SMALLER_AND_EQUALS_COMPARATIVE_DATA));
			}

			return this;
		}
		
		public StatementBuilder addSmEq(String param, String value, String paramWrapper, String valueWrapper) {
			if (param != null && param != "") {
				param = param.trim();

				if (value != null && value.isEmpty()) {
					value = value.trim();
				}
				
				statements.add(DataFactory.getData(param, value, null, paramWrapper, valueWrapper, DataType.SMALLER_AND_EQUALS_COMPARATIVE_DATA));
			}

			return this;
		}
		
		public StatementBuilder addSmEq(String param, String value, WrapperType wrapperType) {
			if (param != null && param != "") {
				param = param.trim();

				if (value != null && value.isEmpty()) {
					value = value.trim();
				}
				
				statements.add(DataFactory.getData(param, value, wrapperType, DataType.SMALLER_AND_EQUALS_COMPARATIVE_DATA));
			}

			return this;
		}
		
		public StatementBuilder addSmEq(String param, String value, WrapperType paramWrapperType, WrapperType valueWrapperType) {
			if (param != null && param != "") {
				param = param.trim();

				if (value != null && value.isEmpty()) {
					value = value.trim();
				}
				
				statements.add(DataFactory.getData(param, value, paramWrapperType, valueWrapperType, DataType.SMALLER_AND_EQUALS_COMPARATIVE_DATA));
			}

			return this;
		}
		
		/*
		 * operator methods
		 */
		public StatementBuilder and() {
			statements.add(OperationFactory.getOperation(OperationType.AND));

			return this;
		}

		public StatementBuilder and(String value) {
			statements.add(OperationFactory.getOperation(OperationType.AND, value));

			return this;
		}

		public StatementBuilder or() {
			statements.add(OperationFactory.getOperation(OperationType.OR));

			return this;
		}

		public StatementBuilder or(String value) {
			statements.add(OperationFactory.getOperation(OperationType.OR, value));

			return this;
		}

		public StatementBuilder eq() {
			statements.add(OperationFactory.getOperation(OperationType.EQUALS));

			return this;
		}

		public StatementBuilder eq(String value) {
			statements.add(OperationFactory.getOperation(OperationType.EQUALS, value));

			return this;
		}

		public StatementBuilder gr() {
			statements.add(OperationFactory.getOperation(OperationType.GREATER));

			return this;
		}

		public StatementBuilder gr(String value) {
			statements.add(OperationFactory.getOperation(OperationType.GREATER, value));

			return this;
		}

		public StatementBuilder greq() {
			statements.add(OperationFactory.getOperation(OperationType.GREATER_AND_EQUALS));

			return this;
		}

		public StatementBuilder greq(String value) {
			statements.add(OperationFactory.getOperation(OperationType.GREATER_AND_EQUALS, value));

			return this;
		}

		public StatementBuilder sm() {
			statements.add(OperationFactory.getOperation(OperationType.SMALLER));

			return this;
		}

		public StatementBuilder sm(String value) {
			statements.add(OperationFactory.getOperation(OperationType.SMALLER, value));

			return this;
		}

		public StatementBuilder smeq() {
			statements.add(OperationFactory.getOperation(OperationType.SMALLER_AND_EQUALS));

			return this;
		}

		public StatementBuilder smeq(String value) {
			statements.add(OperationFactory.getOperation(OperationType.SMALLER_AND_EQUALS, value));

			return this;
		}
		
		/*
		 * block operators
		 */
		
		/*
		 * Block: Parenthesis
		 */
		public StatementBuilder openParenthesis() {
			statements.add(OperationFactory.getOperation(OperationType.OPEN_PARENTHESIS));

			return this;
		}

		public StatementBuilder openParenthesis(String value) {
			statements.add(OperationFactory.getOperation(OperationType.OPEN_PARENTHESIS, value));

			return this;
		}

		public StatementBuilder closeParenthesis() {
			statements.add(OperationFactory.getOperation(OperationType.CLOSE_PARENTHESIS));

			return this;
		}

		public StatementBuilder closeParenthesis(String value) {
			statements.add(OperationFactory.getOperation(OperationType.CLOSE_PARENTHESIS, value));

			return this;
		}
		
		/*
		 * Block: Bracket
		 */
		public StatementBuilder openBracket() {
			statements.add(OperationFactory.getOperation(OperationType.OPEN_BRACKET));

			return this;
		}

		public StatementBuilder openBracket(String value) {
			statements.add(OperationFactory.getOperation(OperationType.OPEN_BRACKET, value));

			return this;
		}

		public StatementBuilder closeBracket() {
			statements.add(OperationFactory.getOperation(OperationType.CLOSE_BRACKET));

			return this;
		}

		public StatementBuilder closeBracket(String value) {
			statements.add(OperationFactory.getOperation(OperationType.CLOSE_BRACKET, value));

			return this;
		}
		
		/*
		 * Block: Angle Bracket
		 */
		public StatementBuilder openAngleBracket() {
			statements.add(OperationFactory.getOperation(OperationType.OPEN_ANGLE_BRACKET));

			return this;
		}

		public StatementBuilder openAngleBracket(String value) {
			statements.add(OperationFactory.getOperation(OperationType.OPEN_ANGLE_BRACKET, value));

			return this;
		}

		public StatementBuilder closeAngleBracket() {
			statements.add(OperationFactory.getOperation(OperationType.CLOSE_ANGLE_BRACKET));

			return this;
		}

		public StatementBuilder closeAngleBracket(String value) {
			statements.add(OperationFactory.getOperation(OperationType.CLOSE_ANGLE_BRACKET, value));

			return this;
		}
		
		/*
		 * Block: Curly Bracket
		 */
		public StatementBuilder openCurlyBracket() {
			statements.add(OperationFactory.getOperation(OperationType.OPEN_CURLY_BRACKET));

			return this;
		}

		public StatementBuilder openCurlyBracket(String value) {
			statements.add(OperationFactory.getOperation(OperationType.OPEN_CURLY_BRACKET, value));

			return this;
		}

		public StatementBuilder closeCurlyBracket() {
			statements.add(OperationFactory.getOperation(OperationType.CLOSE_CURLY_BRACKET));

			return this;
		}

		public StatementBuilder closeCurlyBracket(String value) {
			statements.add(OperationFactory.getOperation(OperationType.CLOSE_CURLY_BRACKET, value));

			return this;
		}
		
		/*
		 * custom operator
		 */
		public StatementBuilder custom(String value) {
			statements.add(OperationFactory.getOperation(OperationType.CUSTOM, value));

			return this;
		}

		public Statement build() {
			return new Statement(this);
		}

	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		int statementSize = statements.size();
		int i = 0;
		
		for (BaseStatement statement : statements) {
			builder.append(statement.toString());
			i++;
			
			if (i < statementSize) {
				builder.append(" ");
			}
		}

		return builder.toString();
	}

}
