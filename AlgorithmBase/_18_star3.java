import java.util.Scanner;

public class _18_star3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("입력>");
		int input = sc.nextInt();
		int i,j,k;
		for(i=0; i<input; i++) {
			for(j=input; j>i+1; j--) {
				System.out.print(" ");
			}
			for(k=0; k<=i; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
