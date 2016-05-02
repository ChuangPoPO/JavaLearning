package io;

public class Polarity {
	String text = "";
	String code = "";
	
	public Polarity(String text, String code) {
		super();
		this.text = text;
		this.code = code;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}
	
	
}
