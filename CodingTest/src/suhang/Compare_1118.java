package suhang;
import java.util.Scanner;
public class Compare_1118 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("a�� ���� �Է��ϼ���: ");
		int a = sc.nextInt();	
		System.out.print("b�� ���� �Է��ϼ���: ");
		int b = sc.nextInt();
		
		if (a > b)
			System.out.println("1");
		if (a < b)
			System.out.println("0");
		if (a == b)
			System.out.println("a == b");
	}

}
