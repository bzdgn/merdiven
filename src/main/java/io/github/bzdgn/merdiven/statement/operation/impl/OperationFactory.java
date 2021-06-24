package io.github.bzdgn.merdiven.statement.operation.impl;

import io.github.bzdgn.merdiven.statement.operation.InvalidOperationException;
import io.github.bzdgn.merdiven.statement.operation.Operation;
import io.github.bzdgn.merdiven.statement.operation.OperationStatement;

public class OperationFactory {
	
	public static OperationStatement getOperation(Operation operation) {
		switch(operation) {
			case AND:{
				return new AndOperation();
			}
			
			case OR: {
				return new OrOperation();
			}
			
			case OPEN_BRACKET: {
				return new OpenBracketOperation();
			}
			
			case CLOSE_BRACKET: {
				return new CloseBracketOperation();
			}
			
			default: {
				throw new InvalidOperationException(operation.toString());
			}
		}
	}

}
