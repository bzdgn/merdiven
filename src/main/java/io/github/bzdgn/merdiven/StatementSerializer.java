package io.github.bzdgn.merdiven;

import java.util.List;

import io.github.bzdgn.merdiven.statement.BaseStatement;

public class StatementSerializer {
	
	public static String serialize(List<BaseStatement> statements) {
		StringBuilder builder = new StringBuilder();
		int statementSize = statements.size();
		int i = 0;
		
		for (BaseStatement statement : statements) {
			builder.append(statement.toString());
			i++;
			
			if (i < statementSize) {
				builder.append(" ");
			}
		}
		
		return builder.toString();
	}

}
