package com.sp.project0623.animal;

//������ ������
public class Duck extends Bird{
	String name="����";
	int wingCount=2;

	/*
	public Duck(){
	 super();
	}
	*/
	//��Ӱ��迡�� �θ��� �����ڰ� �μ��ִ� �Ű������� �ִ� �������ϰ��
	//�ڽ� �����ڿ����� �ڵ����� ȣ���ϴ� super()�� ���̻� ����ϸ� �ȵǰ�
	//�����ڰ� �����ڸ� ���� �����Ͽ� ó���ؾ���
	public Duck(){
	//int x=3; �θ������ ȣ�� ���� �ڽĻ����� �ʱ�ȭ�ϸ� �ȵ�
	 super(true);
	}

	public void fly(){
		//Duck d=new Duck();
		System.out.println(name+"�� �۴��ŷ���");
	}

	public static void main(String[] args) 
	{
		//������ ������ �� ������ ���� �����ϰ� ���� ���� ������ ����غ�
		//��Ӱ����� ��� �ڽ�Ŭ���� �ν��Ͻ��� �޸𸮿� �ø� ��� �θ�Ŭ������ �ν��Ͻ��� �ڵ����� �Բ� �ö�
		//��� ���迡�� �ڽ��� �ν��Ͻ��� �����ϴ� ������, �� �ڽ��� �����ڸ� ȣ���� ��
		//���� �� �θ� ���� �ν��Ͻ� �����Ǿ�� �Ϲ���, sun��� �θ��� �����ڸ� �ڵ����� ȣ���� super();
	    Duck d=new Duck();
		//System.out.println(d.hasFeather);
	}
} 
