package com.sp.project0623.animal2;

public class Duck extends Bird{ //Duck is a Bird
	String name="������";

	public void fly(){
		System.out.println("������ ��");
	}


// ���
// ��Ģ: �ش� ��ü�ڷ����� ���󰡸��
// ����: ��, �������̵� �� �޼��尡 ���� ��� �ڽ��� �޼��带 �켱����
	public static void main(String[] args){ 
		//1) ���� ������ �����, ���� ���� �ڷ������� �����ǰ�
		//���� ���� �ڷ����̶��, ����ȯ�� �����ؾ���
		//byte b=5;
		//short s=3; 
		//byte k=(byte)s; 
		
		Duck d= new Duck();
		System.out.println(d.name); //Duck�� ���۷��� �ּҰ� ���
		//��Ӱ��迡�� �θ�� �ڽ��� ���ÿ� �ν��Ͻ� �����ɶ��� 
		//�θ�, �ڽ��� �ν��Ͻ��� �ڽ��� �ν��Ͻ��� ����ȭ�Ǿ�����
		//���� ����ȭ�� �ν��Ͻ� ������ �θ��� �ν��Ͻ��� �����Ϸ���
		//up casting �����ڸ� ����ϰ� �ٽ� �ڽ����� ���������� down casting
		Bird b1=(Bird)d; 
		//System.out.println((Bird)d); -> Duck�� ���۷��� �ּҰ� ���, ���� ������
		System.out.println(b1.name);
		
		//����ȭ�� �ν��Ͻ� ������ ������ �޼��尡 �������̵� �Ǿ��ִٸ�
		//sun�翡���� �ڽ��� �޼��带 ���׷��̵�� �����Ͽ� ��������ȯ�� �ߴٰ� �ϴ����
		//���� ������ ������ �޼��带 �켱���� 
		b1.fly(); 
	
		/*
		Bird b= new Bird();
		//��ü�ڷ������� �θ�Ŭ������ �ڷ����� �� ū ��(������ �� ����)
		b=d; //���� �ڷ������� ������ ����Ű�� �����Ƿ�, �ڵ�����ȯ�� (up casting) -> ���� ����� �ʿ䰡 ������
		d=(Duck)b; //down casting: �ش��ڵ�� ���� �ڷ����� ������ ��������ȯ�ؾ� ������ �ȳ� 

		//System.out.println(d.name); -> �� ����
		Duck c=(Duck)b;
		//System.out.println(c.name);

		Bird k=c; //up casting
		//System.out.println(k.name);
		*/
	}
}
