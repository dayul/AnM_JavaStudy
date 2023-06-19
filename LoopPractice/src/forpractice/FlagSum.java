package forpractice;
import java.util.Scanner;
public class FlagSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		int sign = 1;
		int n = sc.nextInt(); 
		
		for(int i=1; i<=n; i++) {
			sum += i*sign;
			sign = sign * -1;
		}
		System.out.print(sum);
		
	}

}
