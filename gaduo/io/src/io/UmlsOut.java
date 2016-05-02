package io;

import java.util.List;

public class UmlsOut {
	List<UMLS> umlss;
	int score;
	int start;
	int end;
	Polarity polaruty;
//	Section section = ;
	String text = "";
	String id = "";
	
	public UmlsOut(List<UMLS> umlss, int score, int start, int end, Polarity polaruty, String text, String id) {
		super();
		this.umlss = umlss;
		this.score = score;
		this.start = start;
		this.end = end;
		this.polaruty = polaruty;
		this.text = text;
		this.id = id;
	}

	public List<UMLS> getUmlss() {
		return umlss;
	}

	public int getScore() {
		return score;
	}

	public int getStart() {
		return start;
	}

	public int getEnd() {
		return end;
	}

	public Polarity getPolaruty() {
		return polaruty;
	}

	public String getText() {
		return text;
	}

	public String getId() {
		return id;
	}

	@Override
	public String toString() {
		return "UmlsOut [umlss=" + umlss + ", score=" + score + ", start=" + start + ", end=" + end + ", polaruty="
				+ polaruty + ", text=" + text + ", id=" + id + "]";
	}
	
	
}
