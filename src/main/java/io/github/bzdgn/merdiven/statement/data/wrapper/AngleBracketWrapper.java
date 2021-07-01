package io.github.bzdgn.merdiven.statement.data.wrapper;

public class AngleBracketWrapper extends BaseWrapper {
	
	private static final String ANGLE_BRACKET_BEGIN = "<";
	private static final String ANGLE_BRACKET_END = ">";
	
	public AngleBracketWrapper() {
		super(WrapperType.ANGLE_BRACKET_WRAPPER);
	}

	@Override
	public String getWrapperBegin() {
		return ANGLE_BRACKET_BEGIN;
	}

	@Override
	public String getWrapperEnd() {
		return ANGLE_BRACKET_END;
	}

}
