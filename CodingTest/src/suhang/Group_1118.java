package suhang;
import java.util.Scanner;
public class Group_1118 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
			int input;
			String result;
			System.out.print("숫자 입력: ");
			input = sc.nextInt();
			
			if (input > 0) {
				System.out.println("plus");
			}
			else {
				System.out.println("minus");
			}
			if (input % 2 == 0) {
				System.out.println("even");
			}
			else {
				System.out.println("odd");
			}
	}

}
