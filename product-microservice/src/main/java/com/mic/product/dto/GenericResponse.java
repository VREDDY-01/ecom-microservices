package com.mic.product.dto;

public class GenericResponse {
 
	private String status;
	
	private String message ;

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	@Override
	public String toString() {
		return "ProductResponse [status=" + status + ", message=" + message + "]";
	}
	
	
	
}
