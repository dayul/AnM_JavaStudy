package suhang;
import java.util.Scanner;
public class Date_1118 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("년도를 입력하세요: ");
		int year = sc.nextInt();
		System.out.print("월을 입력하세요: ");
		int month = sc.nextInt();
		System.out.print("일을 입력하세요: ");
		int date = sc.nextInt();
		
		System.out.println(year + "." + month + "." + date);

	}

}
