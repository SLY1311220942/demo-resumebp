package com.sly.resumebp.common.returncode.resumebpcode;

import com.sly.resumebp.common.returncode.IReturnCode;

/**
 * _断点续传返回code枚举
 * @author sly
 * @time 2019年3月5日
 */
public enum ResumebpCode implements IReturnCode {
	,
	;
	
	
	
	
	/**
	 * 错误code
	 */
	private int code;
	/**
	 * 错误信息
	 */
	private String msg;

	/**
	 * 枚举构造方法
	 * 
	 * @param code
	 * @param msg
	 */
	private ResumebpCode(int code, String msg) {
		this.code = code;
		this.msg = msg;
	}

	/**
	 * 获取错误code
	 * 
	 * @return
	 * @author sly
	 * @time 2018年11月14日
	 */
	@Override
	public int getCode() {
		return this.code;
	}

	/**
	 * 获取错误信息
	 * 
	 * @return
	 * @author sly
	 * @time 2018年11月14日
	 */
	@Override
	public String getMsg() {
		return this.msg;
	}

	/**
	 * 获取枚举名称
	 * 
	 * @return
	 * @author sly
	 * @time 2018年11月14日
	 */
	@Override
	public String getName() {
		return this.name();
	}
}

