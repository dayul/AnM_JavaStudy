package suhang;
import java.util.Scanner;
public class Tri_1118 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a, b, c;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�� ���� �Է��ϼ���(�����̽� ����): ");
		a = sc.nextInt();
		b = sc.nextInt();
		
		c = (a > b)? a : b;  
				
		System.out.println("ū ��: " + c);
		
		

	}

}
