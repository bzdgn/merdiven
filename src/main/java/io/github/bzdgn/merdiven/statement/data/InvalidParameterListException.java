package io.github.bzdgn.merdiven.statement.data;

public class InvalidParameterListException extends RuntimeException {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -4239035465779547429L;
	
	private static final String INVALID_PARAMETER_LIST_MESSAGE = "Invalid parameter list: %s";
	
	public InvalidParameterListException(String message) {
		super(String.format(INVALID_PARAMETER_LIST_MESSAGE, message));
	}

}
