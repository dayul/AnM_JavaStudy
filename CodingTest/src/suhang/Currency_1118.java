package suhang;
import java.util.Scanner;
public class Currency_1118 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("금액을 입력하시오 >> ");
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
		
		System.out.println("오만원권" + m50000 + "매");
		System.out.println("만원권" + m10000 + "매");
		System.out.println("오천원권" + m5000 + "매");
		System.out.println("천원권" + m1000 + "매");
		System.out.println("오백원권" + m500 + "매");
		System.out.println("백원권" + m100 + "매");
		System.out.println("오십원" + m50 + "매");
		System.out.println("십원" + m10 + "매");
		System.out.println("오원" + m5 + "매");
		System.out.println("일원" + m1 + "매");
		
	}

}
