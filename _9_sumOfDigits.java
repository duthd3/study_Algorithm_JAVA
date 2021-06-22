import java.util.Scanner;

public class _9_sumOfDigits {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력하세요>");
		
		int input = sc.nextInt();
		
		
		int result=0;
		
		while(input>0){
			result += input%10;
			input/=10;
		}
		System.out.println("각 자릿수 합=" + result);
		
	}

}
