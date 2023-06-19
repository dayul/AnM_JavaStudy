package suhang;
import java.util.Scanner;
public class Dollar_1118 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		float one, dollar;
		System.out.print("원화를 입력하세요(단위:원): ");
		one = sc.nextInt();
		
		dollar =  one / 1260;
		System.out.printf("%.0f원은 $%.2f 입니다." , one, (float)dollar);
		
	}

}
