package io.github.bzdgn.merdiven.statement.data.impl;

import io.github.bzdgn.merdiven.statement.data.DataStatement;
import io.github.bzdgn.merdiven.statement.data.DataType;
import io.github.bzdgn.merdiven.statement.data.wrapper.WrapperFactory;
import io.github.bzdgn.merdiven.statement.data.wrapper.WrapperType;

class GreaterAndEqualsDataStatement extends DataStatement {
	
	private static final String DEFAULT_OPERATOR = ">=";
	
	public GreaterAndEqualsDataStatement(String paramName, String paramValue) {
		super(paramName, paramValue, DEFAULT_OPERATOR, DataType.GREATER_AND_EQUALS_COMPARATIVE_DATA);
	}
	
	public GreaterAndEqualsDataStatement(String paramName, String paramValue, String operator) {
		super(paramName, paramValue, getOperator(operator, DEFAULT_OPERATOR), DataType.GREATER_AND_EQUALS_COMPARATIVE_DATA);
	}
	
	public GreaterAndEqualsDataStatement(String paramName, String paramValue, String operator, String wrapper) {
		super(paramName, paramValue, getOperator(operator, DEFAULT_OPERATOR), WrapperFactory.getPlainStringWrapper(wrapper), DataType.GREATER_AND_EQUALS_COMPARATIVE_DATA);
	}
	
	public GreaterAndEqualsDataStatement(String paramName, String paramValue, String operator, String paramWrapper, String valueWrapper) {
		super(paramName, paramValue, getOperator(operator, DEFAULT_OPERATOR), WrapperFactory.getPlainStringWrapper(paramWrapper), WrapperFactory.getPlainStringWrapper(valueWrapper), DataType.GREATER_AND_EQUALS_COMPARATIVE_DATA);
	}
	
	public GreaterAndEqualsDataStatement(String paramName, String paramValue, String operator, WrapperType wrapperType) {
		super(paramName, paramValue, getOperator(operator, DEFAULT_OPERATOR), WrapperFactory.getPredefinedWrapper(wrapperType), DataType.GREATER_AND_EQUALS_COMPARATIVE_DATA);
	}
	
	public GreaterAndEqualsDataStatement(String paramName, String paramValue, String operator, WrapperType paramWrapperType, WrapperType valueWrapperType) {
		super(paramName, paramValue, getOperator(operator, DEFAULT_OPERATOR), WrapperFactory.getPredefinedWrapper(paramWrapperType), WrapperFactory.getPredefinedWrapper(valueWrapperType), DataType.GREATER_AND_EQUALS_COMPARATIVE_DATA);
	}
	
	public GreaterAndEqualsDataStatement(String paramName, String paramValue, WrapperType wrapperType) {
		super(paramName, paramValue, DEFAULT_OPERATOR, WrapperFactory.getPredefinedWrapper(wrapperType), DataType.GREATER_AND_EQUALS_COMPARATIVE_DATA);
	}
	
	public GreaterAndEqualsDataStatement(String paramName, String paramValue, WrapperType paramWrapperType, WrapperType valueWrapperType) {
		super(paramName, paramValue, DEFAULT_OPERATOR, WrapperFactory.getPredefinedWrapper(paramWrapperType), WrapperFactory.getPredefinedWrapper(valueWrapperType), DataType.GREATER_AND_EQUALS_COMPARATIVE_DATA);
	}

}
