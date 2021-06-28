package io.github.bzdgn.merdiven.statement.data.impl;

import io.github.bzdgn.merdiven.statement.data.DataStatement;
import io.github.bzdgn.merdiven.statement.data.DataType;
import io.github.bzdgn.merdiven.statement.data.wrapper.WrapperFactory;
import io.github.bzdgn.merdiven.statement.data.wrapper.WrapperType;

class FieldDataStatement extends DataStatement {
	
	private static final String DEFAULT_OPERATOR = "";
	private static final String NO_PARAM_VALUE = "";
	private static final String DEFAULT_PARAM_WRAPPER = "'";
	private static final String DEFAULT_NO_VALUE_PARAM_WRAPPER = "";
	
	public FieldDataStatement(String paramName) {
		super(paramName, NO_PARAM_VALUE, DEFAULT_OPERATOR, WrapperFactory.getPlainStringWrapper(DEFAULT_PARAM_WRAPPER), WrapperFactory.getPlainStringWrapper(DEFAULT_NO_VALUE_PARAM_WRAPPER), DataType.FIELD_DATA);
	}
	
	public FieldDataStatement(String paramName, String wrapper) {
		super(paramName, NO_PARAM_VALUE, DEFAULT_OPERATOR, WrapperFactory.getPlainStringWrapper(wrapper), WrapperFactory.getPlainStringWrapper(DEFAULT_NO_VALUE_PARAM_WRAPPER), DataType.FIELD_DATA);
	}
	
	public FieldDataStatement(String paramName, WrapperType wrapperType) {
		super(paramName, NO_PARAM_VALUE, DEFAULT_OPERATOR, WrapperFactory.getPredefinedWrapper(wrapperType), WrapperFactory.getPlainStringWrapper(DEFAULT_NO_VALUE_PARAM_WRAPPER), DataType.FIELD_DATA);
	}
	
}
