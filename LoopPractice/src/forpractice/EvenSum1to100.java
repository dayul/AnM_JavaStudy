package forpractice;

public class EvenSum1to100 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0;
		for(int i=0; i<=100; i++) {
			if(i%2==0)
				sum+=i;
		}
		System.out.print(sum);

	}

}
