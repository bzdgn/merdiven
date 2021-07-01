package io.github.bzdgn.merdiven.statement.data.wrapper;

public class InvalidWrapperTypeException extends RuntimeException {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -2218397867607676856L;
	
	private static final String NOT_SUPPORTED_EXCEPTION_MESSAGE = "Wrapper %s is not supported";
	
	public InvalidWrapperTypeException(String operation) {
		super(String.format(NOT_SUPPORTED_EXCEPTION_MESSAGE, operation));
	}

}
