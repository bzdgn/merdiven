package io.github.bzdgn.merdiven.statement.operation.impl;

import io.github.bzdgn.merdiven.statement.operation.InvalidOperationTypeException;
import io.github.bzdgn.merdiven.statement.operation.OperationType;
import io.github.bzdgn.merdiven.statement.operation.OperationStatement;

public class OperationFactory {
	
	public static OperationStatement getOperation(OperationType operationType) {
		switch(operationType) {
			case AND:{
				return new AndOperation();
			}
			
			case OR: {
				return new OrOperation();
			}
			
			case EQUALS: {
				return new EqualsOperation();
			}
			
			case GREATER: {
				return new GreaterOperation();
			}
			
			case GREATER_AND_EQUALS: {
				return new GreaterAndEqualsOperation();
			}
			
			case SMALLER: {
				return new SmallerOperation();
			}
			
			case SMALLER_AND_EQUALS: {
				return new SmallerAndEqualsOperation();
			}
			
			case OPEN_PARENTHESIS: {
				return new OpenParenthesisOperation();
			}
			
			case CLOSE_PARENTHESIS: {
				return new CloseParenthesisOperation();
			}
			
			case OPEN_BRACKET: {
				return new OpenBracketOperation();
			}
			
			case CLOSE_BRACKET: {
				return new CloseBracketOperation();
			}
			
			case OPEN_ANGLE_BRACKET: {
				return new OpenAngleBracketOperation();
			}
			
			case CLOSE_ANGLE_BRACKET: {
				return new CloseAngleBracketOperation();
			}
			
			case OPEN_CURLY_BRACKET: {
				return new OpenCurlyBracketOperation();
			}
			
			case CLOSE_CURLY_BRACKET: {
				return new CloseCurlyBracketOperation();
			}
			
			default: {
				throw new InvalidOperationTypeException(operationType.toString());
			}
		}
	}
	
	public static OperationStatement getOperation(OperationType operation, String value) {
		switch(operation) {
			case AND:{
				return new AndOperation(value);
			}
			
			case OR: {
				return new OrOperation(value);
			}
			
			case EQUALS: {
				return new EqualsOperation(value);
			}
			
			case GREATER: {
				return new GreaterOperation(value);
			}
			
			case GREATER_AND_EQUALS: {
				return new GreaterAndEqualsOperation(value);
			}
			
			case SMALLER: {
				return new SmallerOperation(value);
			}
			
			case SMALLER_AND_EQUALS: {
				return new SmallerAndEqualsOperation(value);
			}
			
			case OPEN_PARENTHESIS: {
				return new OpenParenthesisOperation(value);
			}
			
			case CLOSE_PARENTHESIS: {
				return new CloseParenthesisOperation(value);
			}
			
			case OPEN_BRACKET: {
				return new OpenBracketOperation(value);
			}
			
			case CLOSE_BRACKET: {
				return new CloseBracketOperation(value);
			}
			
			case OPEN_ANGLE_BRACKET: {
				return new OpenAngleBracketOperation(value);
			}
			
			case CLOSE_ANGLE_BRACKET: {
				return new CloseAngleBracketOperation(value);
			}
			
			case OPEN_CURLY_BRACKET: {
				return new OpenCurlyBracketOperation(value);
			}
			
			case CLOSE_CURLY_BRACKET: {
				return new CloseCurlyBracketOperation(value);
			}
			
			case CUSTOM: {
				return new CustomOperation(value);
			}
			
			default: {
				throw new InvalidOperationTypeException(operation.toString());
			}
		}
	}

}
