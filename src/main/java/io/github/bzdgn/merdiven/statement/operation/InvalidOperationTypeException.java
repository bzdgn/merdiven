package io.github.bzdgn.merdiven.statement.operation;

public class InvalidOperationTypeException extends RuntimeException {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -9093751083761615046L;
	
	private static final String NOT_SUPPORTED_EXCEPTION_MESSAGE = "Operation %s is not supported";
	
	public InvalidOperationTypeException(String operation) {
		super(String.format(NOT_SUPPORTED_EXCEPTION_MESSAGE, operation));
	}

}
