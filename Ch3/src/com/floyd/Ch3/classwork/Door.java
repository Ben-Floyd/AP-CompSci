package com.floyd.Ch3.classwork;
public class Door {
	private String state, name;
	
	public Door(String state, String name){
		this.state = state;
		this.name = name;
	}
	
	public void open(){
		state = "open";
	}
	
	public void close(){
		state = "closed";
	}
	
	public String getName(){
		return name;
	}
	
	public String getState(){
		return state;
	}
	
	public void setName(String name){
		this.name = name;
	}
	
	public void setState(String state){
		this.state = state;
	}
}
