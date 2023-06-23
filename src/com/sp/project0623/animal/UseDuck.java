package com.sp.project0623.animal;

class UseDuck{

	//상속관계에서 부모의 생성자가 인수있는 매개변수가 있는 생성자일경우
	//자식 생성자에서의 자동으로 호출하던 super()는 더이상 사용하면 안되고
	//개발자가 생성자를 직접 정의하여 처리해야함
	/*public Duck(){
	 super(true/false);
	}
	*/

	public static void main(String[] args) 
	{
		//오리를 생성한 후 오리가 직접 보유하고 있지 않은 깃털을 출력해봄
		//상속관계의 경우 자식클래스 인스턴스를 메모리에 올릴 경우 부모클래스의 인스턴스도 자동으로 함께 올라감
		//상속 관계에서 자식의 인스턴스를 생성하는 시점에, 즉 자식의 생성자를 호출할 때
		//시점 상 부모가 먼저 인스턴스 생성되어야 하무로, sun사는 부모의 생성자를 자동으로 호출함 super();
	    Duck d=new Duck();
		//System.out.println(d.hasFeather);
	}
}
