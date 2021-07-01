package io.github.bzdgn.merdiven.statement.data.wrapper;

public class BracketWrapper extends BaseWrapper {
	
	private static final String BRACKET_BEGIN = "[";
	private static final String BRACKET_END = "]";
	
	public BracketWrapper() {
		super(WrapperType.BRACKET_WRAPPER);
	}

	@Override
	public String getWrapperBegin() {
		return BRACKET_BEGIN;
	}

	@Override
	public String getWrapperEnd() {
		return BRACKET_END;
	}

}
