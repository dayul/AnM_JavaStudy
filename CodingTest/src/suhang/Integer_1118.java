package suhang;
import java.util.Scanner;
public class Integer_1118 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a, b, c;
		int sum = 0;
		float average = 0;
		System.out.print("정수 3개 입력: ");
		
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		sum = a + b + c;
		average = (a + b + c) / 3;
		System.out.println("합: " + sum);
		System.out.println("평균 : " + String.format("%.2f", average));
				//String.format() : 반올림 하는.. (안에 출력할 것)
	}

}
