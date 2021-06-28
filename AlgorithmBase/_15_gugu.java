import java.util.Scanner;

public class _15_gugu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("시작 단을 입력하세요>");
		int input1 = sc.nextInt();
		System.out.print("종료 단을 입력하세요>");
		int input2 = sc.nextInt();
		
		for(int i=1; i<=9; i++) {
			for(int j=input1; j<=input2; j++) {
				System.out.printf("%d*%d=%d ", j, i, i*j);
			}
			System.out.println();
		}
	}
	
}
