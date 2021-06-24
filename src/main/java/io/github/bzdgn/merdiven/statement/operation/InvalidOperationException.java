package io.github.bzdgn.merdiven.statement.operation;

public class InvalidOperationException extends RuntimeException {
	
	private static final String NOT_SUPPORTED_EXCEPTION_MESSAGE = "Operation %s is not supported";

	/**
	 * 
	 */
	private static final long serialVersionUID = -9093751083761615046L;
	
	public InvalidOperationException(String operation) {
		super(String.format(NOT_SUPPORTED_EXCEPTION_MESSAGE, operation));
	}

}
