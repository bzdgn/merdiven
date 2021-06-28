package io.github.bzdgn.merdiven.statement.data;

import io.github.bzdgn.merdiven.statement.BaseStatement;
import io.github.bzdgn.merdiven.statement.StatementType;
import io.github.bzdgn.merdiven.statement.data.wrapper.Wrapper;
import io.github.bzdgn.merdiven.statement.data.wrapper.WrapperFactory;

public class DataStatement extends BaseStatement {

	private static final String DEFAULT_PARAM_WRAPPER = "";
	private static final String DEFAULT_VALUE_WRAPPER = "\"";
	
	private final DataType dataStatementType;
	private final String paramName;
	private final String paramValue;
	private final String operator;
	private final Wrapper paramWrapper;
	private final Wrapper valueWrapper;

	public DataStatement(String paramName, String paramValue, String operator, DataType dataStatementType) {
		this(
			paramName,
			paramValue, 
			operator,
			getDefaultWrapper(DEFAULT_PARAM_WRAPPER),
			getDefaultWrapper(DEFAULT_VALUE_WRAPPER),
			dataStatementType
		);
	}
	
	public DataStatement(String paramName, String paramValue, String operator, Wrapper wrapper, DataType dataStatementType) {
		super(StatementType.SIMPLE_DATA);
		this.paramName = paramName;
		this.paramValue = paramValue;
		this.operator = operator;
		this.paramWrapper = wrapper;
		this.valueWrapper = wrapper;
		this.dataStatementType = dataStatementType;
	}
	
	public DataStatement(String paramName, String paramValue, String operator, Wrapper paramWrapper, Wrapper valueWrapper, DataType dataStatementType) {
		super(StatementType.SIMPLE_DATA);
		this.paramName = paramName;
		this.paramValue = paramValue;
		this.operator = operator;
		this.paramWrapper = paramWrapper;
		this.valueWrapper = valueWrapper;
		this.dataStatementType = dataStatementType;
	}
	
	public DataType getDataStatementType() {
		return dataStatementType;
	}
	
	private static Wrapper getDefaultWrapper(String defaultWrapper) {
		return WrapperFactory.getPlainStringWrapper(defaultWrapper);
	}
	
	@Override
	public String toString() {
		String paramWrapperBegin = paramWrapper.getWrapperBegin();
		String paramWrapperEnd = paramWrapper.getWrapperEnd();
		String valueWrapperBegin = valueWrapper.getWrapperBegin();
		String valueWrapperEnd = valueWrapper.getWrapperEnd();
		
		return String.format(
				"%s%s%s%s%s%s%s",
				paramWrapperBegin,
				paramName,
				paramWrapperEnd,
				operator,
				valueWrapperBegin,
				paramValue,
				valueWrapperEnd);
	}
	
	protected static String getOperator(String operator, String defaultOperator) {
		if (operator == null) {
			return defaultOperator;
		}
		
		return operator;
	}
	
}
