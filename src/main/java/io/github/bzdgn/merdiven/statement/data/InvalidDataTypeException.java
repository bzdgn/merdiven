package io.github.bzdgn.merdiven.statement.data;

public class InvalidDataTypeException extends RuntimeException {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -7291254099898781636L;
	
	private static final String NOT_SUPPORTED_EXCEPTION_MESSAGE = "Operation %s is not supported";
	
	public InvalidDataTypeException(String operation) {
		super(String.format(NOT_SUPPORTED_EXCEPTION_MESSAGE, operation));
	}

}
