package com.sp.project0623.animal;

//새를 정의함
public class Bird{
	int x;
	String name="새";
	int wingCount=2;
	private boolean hasFeather=true;

	public Bird(boolean hasFeather){
		System.out.println("새의 초기화 생성자 뿅");
		this.hasFeather=hasFeather;
	}

	public void fly(){
		System.out.println(name+"이 퍼덕거려요");
	}
}
