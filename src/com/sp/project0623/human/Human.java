package com.sp.project0623.human;

public class Human{
	String name;
	String hairColor;
	boolean curlyHair=false;
	boolean hasIntell=true;
	boolean speak=true;

	public Human(boolean curlyHair){
		System.out.println("사람");
		this.curlyHair=curlyHair;
	}

	public Human(){ //오버로딩
		
	}

	public void walk(){
		System.out.println(name+"이 걷다");
	}
}
