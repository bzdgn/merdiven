package io.github.bzdgn.merdiven.statement.data.impl;

import io.github.bzdgn.merdiven.statement.data.DataStatement;
import io.github.bzdgn.merdiven.statement.data.DataType;
import io.github.bzdgn.merdiven.statement.data.InvalidDataTypeException;
import io.github.bzdgn.merdiven.statement.data.InvalidParameterListException;
import io.github.bzdgn.merdiven.statement.data.wrapper.WrapperType;

public class DataFactory {
	
	public static DataStatement getData(String param, String value, DataType dataType) {
		switch(dataType) {
			case FIELD_DATA:{
				if(value != null) {
					throw new InvalidParameterListException("FIELD DATA should the 'value' parameter as NULL");
				}
				
				return new FieldDataStatement(param);
			}
			
			case PLAIN_ASSIGNMENT_DATA:{
				return new PlainAssignmentDataStatement(param, value);
			}
			
			case GREATER_COMPARATIVE_DATA: {
				return new GreaterDataStatement(param, value);
			}
			
			case GREATER_AND_EQUALS_COMPARATIVE_DATA: {
				return new GreaterAndEqualsDataStatement(param, value);
			}
			
			case SMALLER_COMPARATIVE_DATA: {
				return new SmallerDataStatement(param, value);
			}
			
			case SMALLER_AND_EQUALS_COMPARATIVE_DATA: {
				return new SmallerAndEqualsDataStatement(param, value);
			}
			
			default: {
				throw new InvalidDataTypeException(dataType.toString());
			}
		}
	}
	
	public static DataStatement getData(String param, String value, String operator, DataType dataType) {
		switch(dataType) {
			case FIELD_DATA:{
				if(value != null || operator != null) {
					throw new InvalidParameterListException("FIELD DATA should the 'value' and 'operator' parameters as NULL");
				}
				
				return new FieldDataStatement(param);
			}
			
			case PLAIN_ASSIGNMENT_DATA:{
				return new PlainAssignmentDataStatement(param, value, operator);
			}
			
			case GREATER_COMPARATIVE_DATA: {
				return new GreaterDataStatement(param, value, operator);
			}
			
			case GREATER_AND_EQUALS_COMPARATIVE_DATA: {
				return new GreaterAndEqualsDataStatement(param, value, operator);
			}
			
			case SMALLER_COMPARATIVE_DATA: {
				return new SmallerDataStatement(param, value, operator);
			}
			
			case SMALLER_AND_EQUALS_COMPARATIVE_DATA: {
				return new SmallerAndEqualsDataStatement(param, value, operator);
			}
			
			default: {
				throw new InvalidDataTypeException(dataType.toString());
			}
		}
	}
	
	public static DataStatement getData(String param, String value, String operator, String wrapper, DataType dataType) {
		switch(dataType) {
			case FIELD_DATA:{
				if(value != null || operator != null) {
					throw new InvalidParameterListException("FIELD DATA should the 'value' and 'operator' parameters as NULL");
				}
				
				return new FieldDataStatement(param, wrapper);
			}
			
			case PLAIN_ASSIGNMENT_DATA:{
				return new PlainAssignmentDataStatement(param, value, operator, wrapper);
			}
			
			case GREATER_COMPARATIVE_DATA: {
				return new GreaterDataStatement(param, value, operator, wrapper);
			}
			
			case GREATER_AND_EQUALS_COMPARATIVE_DATA: {
				return new GreaterAndEqualsDataStatement(param, value, operator, wrapper);
			}
			
			case SMALLER_COMPARATIVE_DATA: {
				return new SmallerDataStatement(param, value, operator, wrapper);
			}
			
			case SMALLER_AND_EQUALS_COMPARATIVE_DATA: {
				return new SmallerAndEqualsDataStatement(param, value, operator, wrapper);
			}
			
			default: {
				throw new InvalidDataTypeException(dataType.toString());
			}
		}
	}
	
	public static DataStatement getData(String param, String value, String operator, String paramWrapper, String valueWrapper, DataType dataType) {
		switch(dataType) {
			case FIELD_DATA:{
				if(value != null || operator != null || valueWrapper != null) {
					throw new InvalidParameterListException("FIELD DATA should the 'value', 'operator', 'valueWrapper' parameters as NULL");
				}
				
				return new FieldDataStatement(param, paramWrapper);
			}
			
			case PLAIN_ASSIGNMENT_DATA:{
				return new PlainAssignmentDataStatement(param, value, operator, paramWrapper, valueWrapper);
			}
			
			case GREATER_COMPARATIVE_DATA: {
				return new GreaterDataStatement(param, value, operator, paramWrapper, valueWrapper);
			}
			
			case GREATER_AND_EQUALS_COMPARATIVE_DATA: {
				return new GreaterAndEqualsDataStatement(param, value, operator, paramWrapper, valueWrapper);
			}
			
			case SMALLER_COMPARATIVE_DATA: {
				return new SmallerDataStatement(param, value, operator, paramWrapper, valueWrapper);
			}
			
			case SMALLER_AND_EQUALS_COMPARATIVE_DATA: {
				return new SmallerAndEqualsDataStatement(param, value, operator, paramWrapper, valueWrapper);
			}
			
			default: {
				throw new InvalidDataTypeException(dataType.toString());
			}
		}
	}
	
	public static DataStatement getData(String param, String value, String operator, WrapperType wrapperType, DataType dataType) {
		switch(dataType) {
			case FIELD_DATA:{
				if(value != null || operator != null) {
					throw new InvalidParameterListException("FIELD DATA should the 'value' and 'operator' parameters as NULL");
				}
				
				return new FieldDataStatement(param, wrapperType);
			}
			
			case PLAIN_ASSIGNMENT_DATA:{
				return new PlainAssignmentDataStatement(param, value, operator, wrapperType);
			}
			
			case GREATER_COMPARATIVE_DATA: {
				return new GreaterDataStatement(param, value, operator, wrapperType);
			}
			
			case GREATER_AND_EQUALS_COMPARATIVE_DATA: {
				return new GreaterAndEqualsDataStatement(param, value, operator, wrapperType);
			}
			
			case SMALLER_COMPARATIVE_DATA: {
				return new SmallerDataStatement(param, value, operator, wrapperType);
			}
			
			case SMALLER_AND_EQUALS_COMPARATIVE_DATA: {
				return new SmallerAndEqualsDataStatement(param, value, operator, wrapperType);
			}
			
			default: {
				throw new InvalidDataTypeException(dataType.toString());
			}
		}
	}
	
	public static DataStatement getData(String param, String value, String operator, WrapperType paramWrapperType, WrapperType valueWrapperType, DataType dataType) {
		switch(dataType) {
			case FIELD_DATA:{
				if(value != null || operator != null || valueWrapperType != null) {
					throw new InvalidParameterListException("FIELD DATA should the 'value', 'operator', 'valueWrapperType' parameters as NULL");
				}
				
				return new FieldDataStatement(param, paramWrapperType);
			}
			
			case PLAIN_ASSIGNMENT_DATA:{
				return new PlainAssignmentDataStatement(param, value, operator, paramWrapperType, valueWrapperType);
			}
			
			case GREATER_COMPARATIVE_DATA: {
				return new GreaterDataStatement(param, value, operator, paramWrapperType, valueWrapperType);
			}
			
			case GREATER_AND_EQUALS_COMPARATIVE_DATA: {
				return new GreaterAndEqualsDataStatement(param, value, operator, paramWrapperType, valueWrapperType);
			}
			
			case SMALLER_COMPARATIVE_DATA: {
				return new SmallerDataStatement(param, value, operator, paramWrapperType, valueWrapperType);
			}
			
			case SMALLER_AND_EQUALS_COMPARATIVE_DATA: {
				return new SmallerAndEqualsDataStatement(param, value, operator, paramWrapperType, valueWrapperType);
			}
			
			default: {
				throw new InvalidDataTypeException(dataType.toString());
			}
		}
	}
	
	public static DataStatement getData(String param, String value, WrapperType wrapperType, DataType dataType) {
		switch(dataType) {
			case FIELD_DATA:{
				if(value != null) {
					throw new InvalidParameterListException("FIELD DATA should the 'value' parameter as NULL");
				}
				
				return new FieldDataStatement(param, wrapperType);
			}
			
			case PLAIN_ASSIGNMENT_DATA:{
				return new PlainAssignmentDataStatement(param, value, wrapperType);
			}
			
			case GREATER_COMPARATIVE_DATA: {
				return new GreaterDataStatement(param, value, wrapperType);
			}
			
			case GREATER_AND_EQUALS_COMPARATIVE_DATA: {
				return new GreaterAndEqualsDataStatement(param, value, wrapperType);
			}
			
			case SMALLER_COMPARATIVE_DATA: {
				return new SmallerDataStatement(param, value, wrapperType);
			}
			
			case SMALLER_AND_EQUALS_COMPARATIVE_DATA: {
				return new SmallerAndEqualsDataStatement(param, value, wrapperType);
			}
			
			default: {
				throw new InvalidDataTypeException(dataType.toString());
			}
		}
	}
	
	public static DataStatement getData(String param, String value, WrapperType paramWrapperType, WrapperType valueWrapperType, DataType dataType) {
		switch(dataType) {
			case FIELD_DATA:{
				if(value != null || valueWrapperType != null) {
					throw new InvalidParameterListException("FIELD DATA should the 'value' and 'valueWrapperType' parameters as NULL");
				}
				
				return new FieldDataStatement(param, paramWrapperType);
			}
			
			case PLAIN_ASSIGNMENT_DATA:{
				return new PlainAssignmentDataStatement(param, value, paramWrapperType, valueWrapperType);
			}
			
			case GREATER_COMPARATIVE_DATA: {
				return new GreaterDataStatement(param, value, paramWrapperType, valueWrapperType);
			}
			
			case GREATER_AND_EQUALS_COMPARATIVE_DATA: {
				return new GreaterAndEqualsDataStatement(param, value, paramWrapperType, valueWrapperType);
			}
			
			case SMALLER_COMPARATIVE_DATA: {
				return new SmallerDataStatement(param, value, paramWrapperType, valueWrapperType);
			}
			
			case SMALLER_AND_EQUALS_COMPARATIVE_DATA: {
				return new SmallerAndEqualsDataStatement(param, value, paramWrapperType, valueWrapperType);
			}
			
			default: {
				throw new InvalidDataTypeException(dataType.toString());
			}
		}
	}
	
}
