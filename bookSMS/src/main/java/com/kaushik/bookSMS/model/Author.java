package com.kaushik.bookSMS.model;

public class Author {

	private String authorName;
	private int authorAge;
	public String getAuthorName() {
		return authorName;
	}
	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}
	public int getAuthorAge() {
		return authorAge;
	}
	public void setAuthorAge(int authorAge) {
		this.authorAge = authorAge;
	}
	
	@Override
	public String toString() {
		return "Author [authorName=" + authorName + ", authorAge=" + authorAge + "]";
	}
	
}
