package com.sp.project0623.animal2;

//this��? ���۷��� ����
//��. �������� �̹� java���α׷����� ������ ����
public class Dog{
	String name;
	
	public void run(){
		this.name="������"; // �ش� �޼���� �ν��Ͻ� �޼����̱� ������ this�� ����� �� ����
	}

	public static void main(String[] args){
		Dog d=new Dog();
		System.out.println(d.name);
		//this.name="�Ѹ�"; ->  �� �ڵ�� ���� �� Ŭ������ ������ static�������� �ν��Ͻ��� ����(��ü)�� ����Ű�� this�� ����� �� ����
	}
}
