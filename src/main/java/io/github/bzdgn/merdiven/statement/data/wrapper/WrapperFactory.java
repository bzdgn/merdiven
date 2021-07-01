package io.github.bzdgn.merdiven.statement.data.wrapper;

public class WrapperFactory {
	
	public static Wrapper getPredefinedWrapper(WrapperType wrapperType) {
		switch(wrapperType) {
			case PLAIN_STRING_WRAPPER:{
				return new PlainStringWrapper("\"");
			}
			
			case PARENTHESIS_WRAPPER: {
				return new ParenthesisWrapper();
			}
			
			case BRACKET_WRAPPER: {
				return new BracketWrapper();
			}
			
			case CURLY_BRACKET_WRAPPER: {
				return new CurlyBracketWrapper();
			}
			
			case ANGLE_BRACKET_WRAPPER: {
				return new AngleBracketWrapper();
			}
			
			default: {
				throw new InvalidWrapperTypeException(wrapperType.toString());
			}
		}
	}
	
	public static Wrapper getPlainStringWrapper(String wrapper) {
		return new PlainStringWrapper(wrapper);
	}
	
	public static Wrapper getPlainStringWrapper(String paramWrapper, String valueWrapper) {
		return new PlainStringWrapper(paramWrapper, valueWrapper);
	}
	
}
