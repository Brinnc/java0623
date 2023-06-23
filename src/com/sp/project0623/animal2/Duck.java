package com.sp.project0623.animal2;

public class Duck extends Bird{ //Duck is a Bird
	String name="난오리";

	public void fly(){
		System.out.println("오리가 남");
	}


// 결론
// 원칙: 해당 객체자료형을 따라가면됨
// 예외: 단, 오버라이딩 된 메서드가 있을 경우 자식의 메서드를 우선시함
	public static void main(String[] args){ 
		//1) 만일 오리가 새라면, 서로 같은 자료형으로 인정되고
		//서로 같은 자료형이라면, 형변환도 가능해야함
		//byte b=5;
		//short s=3; 
		//byte k=(byte)s; 
		
		Duck d= new Duck();
		System.out.println(d.name); //Duck의 레퍼런스 주소값 출력
		//상속관계에서 부모와 자식이 동시에 인스턴스 생성될때는 
		//부모, 자식의 인스턴스는 자식의 인스턴스로 군집화되어진다
		//따라서 군집화된 인스턴스 내에서 부모의 인스턴스를 접근하려면
		//up casting 연산자를 사용하고 다시 자식으로 내려오려면 down casting
		Bird b1=(Bird)d; 
		//System.out.println((Bird)d); -> Duck의 레퍼런스 주소값 출력, 위와 동일함
		System.out.println(b1.name);
		
		//군집화된 인스턴스 내에서 동일한 메서드가 오버라이딩 되어있다면
		//sun사에서는 자식의 메서드를 업그래이드로 인정하여 강제형변환을 했다고 하더라고
		//본래 본인이 소유한 메서드를 우선시함 
		b1.fly(); 
	
		/*
		Bird b= new Bird();
		//객체자료형에서 부모클래스의 자료형이 더 큰 것(범위가 더 넓음)
		b=d; //새의 자료형으로 오리를 가리키고 있으므로, 자동형변환임 (up casting) -> 굳이 명시할 필요가 없긴함
		d=(Duck)b; //down casting: 해당코드는 새의 자료형을 오리로 강제형변환해야 오류가 안남 

		//System.out.println(d.name); -> 난 오리
		Duck c=(Duck)b;
		//System.out.println(c.name);

		Bird k=c; //up casting
		//System.out.println(k.name);
		*/
	}
}
