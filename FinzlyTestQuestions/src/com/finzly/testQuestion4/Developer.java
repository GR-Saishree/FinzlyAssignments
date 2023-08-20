package com.finzly.testQuestion4;

public class Developer extends Employee {

	private String programmingLanguage;
	
	Developer(String name,int id,String programmingLanguage){
		super(name,id);
		setProgrammingLanguage(programmingLanguage);
		System.out.println("Developer uses the primary programming language: "+getProgrammingLanguage());
	}

	public String getProgrammingLanguage() {
		return programmingLanguage;
	}

	public void setProgrammingLanguage(String programmingLanguage) {
		this.programmingLanguage = programmingLanguage;
	}
}
