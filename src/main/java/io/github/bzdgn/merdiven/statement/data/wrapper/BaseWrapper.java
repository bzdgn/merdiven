package io.github.bzdgn.merdiven.statement.data.wrapper;

public abstract class BaseWrapper implements Wrapper {
	
	protected final WrapperType wrapperType;
	
	public BaseWrapper(WrapperType wrapperType) {
		this.wrapperType = wrapperType;
	}
	
	public WrapperType getWrapperType() {
		return wrapperType;
	}
	
}
