package io.github.bzdgn.merdiven.util;

public class TestUtils {
	
	@SuppressWarnings("rawtypes")
	public static void print(Class clazz, String test, String input) {
		String testInfo = "Test: " + getClassAndTest(clazz, test);
		
		System.out.println(testInfo);
		System.out.println(getHeaderLine(testInfo));
		System.out.println(input);
		System.out.println();
	}
	
	@SuppressWarnings("rawtypes")
	private static String getClassAndTest(Class clazz, String test) {
		String className = clazz.getSimpleName();
		
		return String.format("%s - %s", className, test);
	}
	
	private static String getHeaderLine(String input) {
		int len = input.length();
		char[] headerLine = new char[len];
		
		for (int i=0; i<len; i++) {
			headerLine[i] = '-';
		}
		
		return new String(headerLine);
	}

}
