package io.github.bzdgn.merdiven.statement.data.wrapper;

class PlainStringWrapper extends BaseWrapper {
	
	private final String wrapperBegin;
	private final String wrapperEnd;
	
	public PlainStringWrapper(String wrapper) {
		super(WrapperType.PLAIN_STRING_WRAPPER);
		this.wrapperBegin = wrapper;
		this.wrapperEnd = wrapper;
	}
	
	public PlainStringWrapper(String wrapperBegin, String wrapperEnd) {
		super(WrapperType.PLAIN_STRING_WRAPPER);
		this.wrapperBegin = wrapperBegin;
		this.wrapperEnd = wrapperEnd;
	}
	
	@Override
	public String getWrapperBegin() {
		return wrapperBegin;
	}

	@Override
	public String getWrapperEnd() {
		return wrapperEnd;
	}

}
