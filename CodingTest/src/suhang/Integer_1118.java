package suhang;
import java.util.Scanner;
public class Integer_1118 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a, b, c;
		int sum = 0;
		float average = 0;
		System.out.print("���� 3�� �Է�: ");
		
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		sum = a + b + c;
		average = (a + b + c) / 3;
		System.out.println("��: " + sum);
		System.out.println("��� : " + String.format("%.2f", average));
				//String.format() : �ݿø� �ϴ�.. (�ȿ� ����� ��)
	}

}
