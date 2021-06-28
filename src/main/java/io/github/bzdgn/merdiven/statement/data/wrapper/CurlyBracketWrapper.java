package io.github.bzdgn.merdiven.statement.data.wrapper;

public class CurlyBracketWrapper extends BaseWrapper {
	
	private static final String CURLY_BRACKET_BEGIN = "{";
	private static final String CURLY_BRACKET_END = "}";
	
	public CurlyBracketWrapper() {
		super(WrapperType.CURLY_BRACKET_WRAPPER);
	}

	@Override
	public String getWrapperBegin() {
		return CURLY_BRACKET_BEGIN;
	}

	@Override
	public String getWrapperEnd() {
		return CURLY_BRACKET_END;
	}

}
