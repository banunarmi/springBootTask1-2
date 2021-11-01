package com.example.demo;

public enum ResponseStatus {
	SUCCESS("Success",2000),
	BADREQUEST("Validation faild",4000);
	
	private String status;
	private int code;
	
	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	private ResponseStatus(String status, int code) {
		this.status = status;
		this.code = code;
	}

	
}
