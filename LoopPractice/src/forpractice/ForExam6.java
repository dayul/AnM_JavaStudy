package forpractice;

public class ForExam6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i = 1; i <= 5; i++) {
			for(int j = 4; j >= i ; j--) {
				System.out.print("* ");
			}
			for(int a = 1; a <= i; a++) {
				System.out.print(a + " ");
			}
			System.out.println();
		}
	}

}
