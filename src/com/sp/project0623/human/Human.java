package com.sp.project0623.human;

public class Human{
	String name;
	String hairColor;
	boolean curlyHair=false;
	boolean hasIntell=true;
	boolean speak=true;

	public Human(boolean curlyHair){
		System.out.println("���");
		this.curlyHair=curlyHair;
	}

	public Human(){ //�����ε�
		
	}

	public void walk(){
		System.out.println(name+"�� �ȴ�");
	}
}
