import java.util.Scanner;

public class _8_Factorial {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자를 입력하세요>");
		
		int input = sc.nextInt();
		int fac=1;
		
		System.out.print(input + "! = ");
		
		for(int i=input; input>=1; input--) {
			fac*=input;
		}
		
		System.out.println(fac);
	}

}
