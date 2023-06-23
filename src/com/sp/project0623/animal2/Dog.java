package com.sp.project0623.animal2;

//this란? 레퍼런스 변수
//단. 변수명은 이미 java프로그램에서 정해져 있음
public class Dog{
	String name;
	
	public void run(){
		this.name="강아지"; // 해당 메서드는 인스턴스 메서드이기 때문에 this를 사용할 수 있음
	}

	public static void main(String[] args){
		Dog d=new Dog();
		System.out.println(d.name);
		//this.name="둘리"; ->  이 코드는 에러 남 클래스의 원본인 static영역에서 인스턴스가 본인(주체)을 가리키는 this를 사용할 수 없음
	}
}
