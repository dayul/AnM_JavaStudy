package suhang;
import java.util.Scanner;
public class Time_1118 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("����(��)�� �Է��ϼ��� : ");
		int time = sc.nextInt();
		int hour, minute, second;
		hour = time / 3600;
		minute = (time % 3600) / 60;
		second = (time % 3600) % 60;
		
		System.out.println(time + "�ʴ� " + hour + "�ð� " + minute + "�� " + second + "�� �Դϴ�. ");
	}

}
