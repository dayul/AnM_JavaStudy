package suhang;
import java.util.Scanner;
public class Dollar_1118 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		float one, dollar;
		System.out.print("��ȭ�� �Է��ϼ���(����:��): ");
		one = sc.nextInt();
		
		dollar =  one / 1260;
		System.out.printf("%.0f���� $%.2f �Դϴ�." , one, (float)dollar);
		
	}

}
