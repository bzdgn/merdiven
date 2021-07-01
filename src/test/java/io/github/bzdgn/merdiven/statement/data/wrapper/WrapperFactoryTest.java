package io.github.bzdgn.merdiven.statement.data.wrapper;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class WrapperFactoryTest {
	
	/*
	 * PLAIN_STRING_WRAPPER
	 */
	@Test
	public void ensurePlainStringWrapperWithGenericWrapperCreatedAndFunctioning() {
		Wrapper wrapper = WrapperFactory.getPlainStringWrapper("'");
		
		assertEquals(WrapperType.PLAIN_STRING_WRAPPER, wrapper.getWrapperType());
		assertEquals("'", wrapper.getWrapperBegin());
		assertEquals("'", wrapper.getWrapperEnd());
	}
	
	@Test
	public void ensurePlainStringWrapperWithMultipleWrapperCreatedAndFunctioning() {
		Wrapper wrapper = WrapperFactory.getPlainStringWrapper("<", ">");
		
		assertEquals(WrapperType.PLAIN_STRING_WRAPPER, wrapper.getWrapperType());
		assertEquals("<", wrapper.getWrapperBegin());
		assertEquals(">", wrapper.getWrapperEnd());
	}
	
	/*
	 * Predefined Wrappers
	 */
	
	@Test
	public void ensureAngleBracketWrapperByTypeCreatedAndFunctioning() {
		Wrapper wrapper = WrapperFactory.getPredefinedWrapper(WrapperType.ANGLE_BRACKET_WRAPPER);
		
		assertEquals(WrapperType.ANGLE_BRACKET_WRAPPER, wrapper.getWrapperType());
		assertEquals("<", wrapper.getWrapperBegin());
		assertEquals(">", wrapper.getWrapperEnd());
	}
	
	@Test
	public void ensureBracketWrapperByTypeCreatedAndFunctioning() {
		Wrapper wrapper = WrapperFactory.getPredefinedWrapper(WrapperType.BRACKET_WRAPPER);
		
		assertEquals(WrapperType.BRACKET_WRAPPER, wrapper.getWrapperType());
		assertEquals("[", wrapper.getWrapperBegin());
		assertEquals("]", wrapper.getWrapperEnd());
	}
	
	@Test
	public void ensureCurlyBracketWrapperByTypeCreatedAndFunctioning() {
		Wrapper wrapper = WrapperFactory.getPredefinedWrapper(WrapperType.CURLY_BRACKET_WRAPPER);
		
		assertEquals(WrapperType.CURLY_BRACKET_WRAPPER, wrapper.getWrapperType());
		assertEquals("{", wrapper.getWrapperBegin());
		assertEquals("}", wrapper.getWrapperEnd());
	}
	
	@Test
	public void ensureParenthesisWrapperByTypeCreatedAndFunctioning() {
		Wrapper wrapper = WrapperFactory.getPredefinedWrapper(WrapperType.PARENTHESIS_WRAPPER);
		
		assertEquals(WrapperType.PARENTHESIS_WRAPPER, wrapper.getWrapperType());
		assertEquals("(", wrapper.getWrapperBegin());
		assertEquals(")", wrapper.getWrapperEnd());
	}
	
	@Test
	public void ensurePlainStringWrapperByTypeCreatedAndFunctioning() {
		Wrapper wrapper = WrapperFactory.getPredefinedWrapper(WrapperType.PLAIN_STRING_WRAPPER);
		
		assertEquals(WrapperType.PLAIN_STRING_WRAPPER, wrapper.getWrapperType());
		assertEquals("\"", wrapper.getWrapperBegin());
		assertEquals("\"", wrapper.getWrapperEnd());
	}

}
