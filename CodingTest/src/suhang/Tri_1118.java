package suhang;
import java.util.Scanner;
public class Tri_1118 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a, b, c;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("두 수를 입력하세요(스페이스 구분): ");
		a = sc.nextInt();
		b = sc.nextInt();
		
		c = (a > b)? a : b;  
				
		System.out.println("큰 수: " + c);
		
		

	}

}
