package io.github.bzdgn.merdiven.statement.data;

import io.github.bzdgn.merdiven.statement.BaseStatement;
import io.github.bzdgn.merdiven.statement.StatementType;

public class DataStatement extends BaseStatement {
	
	private final String paramName;
	private final String paramValue;
	
	public DataStatement(String paramName, String paramValue) {
		super(StatementType.DATA);
		this.paramName = paramName;
		this.paramValue = paramValue;
	}
	
	@Override
	public String toString() {
		return String.format("%s=\"%s\"", paramName, paramValue);
	}

}
