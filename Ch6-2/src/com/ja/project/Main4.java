package com.ja.project;

public class Main4 {
	public static void main(String[] args) {
		PhoneBookData pbd = new PhoneBookData();
		pbd.setName("Hanjo");
		
		System.out.println(pbd.getName());
	}
	
}
class PhoneBookData{
	private String name;
	private String number;
	private String birth;
	
	
	public PhoneBookData(String name, String number, String birth) {
		super();
		this.name = name;
		this.number = number;
		this.birth = birth;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public String getBirth() {
		return birth;
	}
	public void setBirth(String birth) {
		this.birth = birth;
	}
	
	
	
	
}
