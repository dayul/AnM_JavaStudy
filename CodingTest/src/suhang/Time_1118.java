package suhang;
import java.util.Scanner;
public class Time_1118 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("정수(초)를 입력하세요 : ");
		int time = sc.nextInt();
		int hour, minute, second;
		hour = time / 3600;
		minute = (time % 3600) / 60;
		second = (time % 3600) % 60;
		
		System.out.println(time + "초는 " + hour + "시간 " + minute + "분 " + second + "초 입니다. ");
	}

}
