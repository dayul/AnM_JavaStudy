package suhang;
import java.util.Scanner;
public class Score_1118 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int score, grade;
		
		System.out.print("������ �Է��ϼ���(1~100): ");
		score = sc.nextInt();
		
		System.out.print("�г��� �Է��ϼ���(1~3): ");
		grade = sc.nextInt();
		
		if (grade == 3 && score < 70)
			System.out.println("���հ�");
		else if (score >= 60)
			System.out.println("�հ�");
		else
			System.out.println("���հ�");
		
	}

}
