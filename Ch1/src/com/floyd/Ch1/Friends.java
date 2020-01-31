package com.floyd.Ch1;

public class Friends {
	
	private String name, birthday;

	public Friends(String name, String birthday){
		this.name = name;
		this.birthday = birthday;
	}
	
	public void print(){
		System.out.println(this.name + "\t" + this.birthday);
	}
}
