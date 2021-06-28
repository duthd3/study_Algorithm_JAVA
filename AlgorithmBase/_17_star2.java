import java.util.Scanner;

public class _17_star2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("입력>");
		int input = sc.nextInt();
		int i,j,k;
		
		for(i=0; i<input; i++) {
			for(j=0; j<i; j++) {
				System.out.print(" ");				
			}		
			for(k=0; k<input-j; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		
	}

}
