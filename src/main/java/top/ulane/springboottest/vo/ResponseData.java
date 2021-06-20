package top.ulane.springboottest.vo;

import java.io.Serializable;

public class ResponseData <T> implements Serializable {
	private int code;
	private String msg;
	private T data;
	private String AFSF = "SFSDF12";
	
	public ResponseData() {
		super();
	}
	
	public ResponseData(T data) {
		super();
		this.code = 0;
		this.msg = "success";
		this.data = data;
	}

	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	public T getData() {
		return data;
	}
	public void setData(T data) {
		this.data = data;
	}

	public String getAFSF() {
		return AFSF;
	}
	public void setAFSF(String aFSF) {
		AFSF = aFSF;
	}
	
}
