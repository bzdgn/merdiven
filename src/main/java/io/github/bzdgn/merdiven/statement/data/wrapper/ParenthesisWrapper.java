package io.github.bzdgn.merdiven.statement.data.wrapper;

public class ParenthesisWrapper extends BaseWrapper {
	
	private static final String PARENTHESIS_BEGIN = "(";
	private static final String PARENTHESIS_END = ")";
	
	public ParenthesisWrapper() {
		super(WrapperType.PARENTHESIS_WRAPPER);
	}

	@Override
	public String getWrapperBegin() {
		return PARENTHESIS_BEGIN;
	}

	@Override
	public String getWrapperEnd() {
		return PARENTHESIS_END;
	}

}
