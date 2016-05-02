package io;

import java.util.Set;

import com.google.gson.Gson;

public class UMLS {
	private String cui = "";
	private String tui = "";
	private SemanticType semanticType;
	private String text = "";
	private String fword = "";
	private String sourceType = "";
	private String code = "";
	private String id = "";
	private Set<String> texts;
	
	public UMLS(){	}
	
	public String getCui() {
		return cui;
	}
	public void setCui(String cui) {
		this.cui = cui;
	}
	public String getTui() {
		return tui;
	}
	public void setTui(String tui) {
		this.tui = tui;
	}
	public SemanticType getSemanticType() {
		return semanticType;
	}
	public void setSemanticType(SemanticType semanticType) {
		this.semanticType = semanticType;
	}
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	public String getFword() {
		return fword;
	}
	public void setFword(String fword) {
		this.fword = fword;
	}
	public String getSourceType() {
		return sourceType;
	}
	public void setSourceType(String sourceType) {
		this.sourceType = sourceType;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public Set<String> getTexts() {
		return texts;
	}
	public void setTexts(Set<String> texts) {
		this.texts = texts;
	}

	@Override
	public String toString() {
		return new Gson().toJson(this);
	}
	
	

}
