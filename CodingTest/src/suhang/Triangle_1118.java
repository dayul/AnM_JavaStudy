package suhang;
import java.util.Scanner;
public class Triangle_1118 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("���� 3���� �Է��Ͻÿ� >> ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		if (a+b > c || a+c > b || b+c > a) {
			System.out.println("�ﰢ���� �˴ϴ�.");
		}
		
		
	}

}
