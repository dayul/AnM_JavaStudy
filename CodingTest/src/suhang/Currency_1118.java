package suhang;
import java.util.Scanner;
public class Currency_1118 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�ݾ��� �Է��Ͻÿ� >> ");
		int money = sc.nextInt();
		int m50000, m10000, m5000, m1000, m500, m100, m50, m10, m5, m1;
		m50000 = money / 50000;
		m10000 = ((money % 50000) / 10000);
		m5000 = (((money % 50000) % 10000) / 5000);
		m1000 = ((((money % 50000) % 10000) % 5000) / 1000);
		m500 = (((((money % 50000) % 10000) % 5000) % 1000) / 500);
		m100 = ((((((money % 50000) % 10000) % 5000) % 1000) % 500) / 100);
		m50 = (((((((money % 50000) % 10000) % 5000) % 1000) % 500) % 100) / 50);
		m10 = ((((((((money % 50000) % 10000) % 5000) % 1000) % 500) % 100) % 50) / 10);
		m5 = (((((((((money % 50000) % 10000) % 5000) % 1000) % 500) % 100) % 50) % 10) / 5);
		m1 = (((((((((money % 50000) % 10000) % 5000) % 1000) % 500) % 100) % 50) % 10) % 5);
		
		System.out.println("��������" + m50000 + "��");
		System.out.println("������" + m10000 + "��");
		System.out.println("��õ����" + m5000 + "��");
		System.out.println("õ����" + m1000 + "��");
		System.out.println("�������" + m500 + "��");
		System.out.println("�����" + m100 + "��");
		System.out.println("���ʿ�" + m50 + "��");
		System.out.println("�ʿ�" + m10 + "��");
		System.out.println("����" + m5 + "��");
		System.out.println("�Ͽ�" + m1 + "��");
		
	}

}
