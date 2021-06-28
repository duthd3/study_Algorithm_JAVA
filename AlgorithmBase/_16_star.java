import java.util.Scanner;

public class _16_star {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("입력>");
		int input1 = sc.nextInt();
		for(int i=0; i<input1; i++) {
			for(int j=0; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}

}
