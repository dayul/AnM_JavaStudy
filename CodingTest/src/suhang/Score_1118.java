package suhang;
import java.util.Scanner;
public class Score_1118 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int score, grade;
		
		System.out.print("점수를 입력하세요(1~100): ");
		score = sc.nextInt();
		
		System.out.print("학년을 입력하세요(1~3): ");
		grade = sc.nextInt();
		
		if (grade == 3 && score < 70)
			System.out.println("불합격");
		else if (score >= 60)
			System.out.println("합격");
		else
			System.out.println("불합격");
		
	}

}
