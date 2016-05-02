package io;

public class SemanticType {
	String code;
	String tui;
	String text;
	
	public SemanticType(String code, String tui, String text) {
		this.code = code;
		this.tui = tui;
		this.text = text;
	}
	
	public String getCode() {
		return code;
	}
	
	public String getTui() {
		return tui;
	}
	
	public String getText() {
		return text;
	}
}
