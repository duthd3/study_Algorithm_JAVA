import java.util.Scanner;

public class _19_base {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int input1;
		int input2;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자를 두개 입력하세요.>");
		input1 = sc.nextInt();
		input2 = sc.nextInt();
		int temp=1;
		
		for(int i=0; i<input2; i++) {
			temp*=input1;
		}
		
		System.out.printf("%d", temp);
	}

}
