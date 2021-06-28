package io.github.bzdgn.merdiven.statement.data.impl;

import io.github.bzdgn.merdiven.statement.data.DataStatement;
import io.github.bzdgn.merdiven.statement.data.DataType;
import io.github.bzdgn.merdiven.statement.data.wrapper.WrapperFactory;
import io.github.bzdgn.merdiven.statement.data.wrapper.WrapperType;

class SmallerAndEqualsDataStatement extends DataStatement {
	
	private static final String DEFAULT_OPERATOR = "<=";
	
	public SmallerAndEqualsDataStatement(String paramName, String paramValue) {
		super(paramName, paramValue, DEFAULT_OPERATOR, DataType.SMALLER_AND_EQUALS_COMPARATIVE_DATA);
	}
	
	public SmallerAndEqualsDataStatement(String paramName, String paramValue, String operator) {
		super(paramName, paramValue, getOperator(operator, DEFAULT_OPERATOR), DataType.SMALLER_AND_EQUALS_COMPARATIVE_DATA);
	}
	
	public SmallerAndEqualsDataStatement(String paramName, String paramValue, String operator, String wrapper) {
		super(paramName, paramValue, getOperator(operator, DEFAULT_OPERATOR), WrapperFactory.getPlainStringWrapper(wrapper), DataType.SMALLER_AND_EQUALS_COMPARATIVE_DATA);
	}
	
	public SmallerAndEqualsDataStatement(String paramName, String paramValue, String operator, String paramWrapper, String valueWrapper) {
		super(paramName, paramValue, getOperator(operator, DEFAULT_OPERATOR), WrapperFactory.getPlainStringWrapper(paramWrapper), WrapperFactory.getPlainStringWrapper(valueWrapper), DataType.SMALLER_AND_EQUALS_COMPARATIVE_DATA);
	}
	
	public SmallerAndEqualsDataStatement(String paramName, String paramValue, String operator, WrapperType wrapperType) {
		super(paramName, paramValue, getOperator(operator, DEFAULT_OPERATOR), WrapperFactory.getPredefinedWrapper(wrapperType), DataType.SMALLER_AND_EQUALS_COMPARATIVE_DATA);
	}
	
	public SmallerAndEqualsDataStatement(String paramName, String paramValue, String operator, WrapperType paramWrapperType, WrapperType valueWrapperType) {
		super(paramName, paramValue, getOperator(operator, DEFAULT_OPERATOR), WrapperFactory.getPredefinedWrapper(paramWrapperType), WrapperFactory.getPredefinedWrapper(valueWrapperType), DataType.SMALLER_AND_EQUALS_COMPARATIVE_DATA);
	}
	
	public SmallerAndEqualsDataStatement(String paramName, String paramValue, WrapperType wrapperType) {
		super(paramName, paramValue, DEFAULT_OPERATOR, WrapperFactory.getPredefinedWrapper(wrapperType), DataType.SMALLER_AND_EQUALS_COMPARATIVE_DATA);
	}
	
	public SmallerAndEqualsDataStatement(String paramName, String paramValue, WrapperType paramWrapperType, WrapperType valueWrapperType) {
		super(paramName, paramValue, DEFAULT_OPERATOR, WrapperFactory.getPredefinedWrapper(paramWrapperType), WrapperFactory.getPredefinedWrapper(valueWrapperType), DataType.SMALLER_AND_EQUALS_COMPARATIVE_DATA);
	}

}
