package chap05;

import java.util.Scanner;

public class Q1{
	static int factorial(int n) {
		int x = 1;
		for(int i=1; i<=n; i++)
			x*=i;
		return x;
			
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수를 입력하세요:");
		int x = sc.nextInt();
		
		System.out.println(x + "의 팩토리얼은 " + factorial(x) + "입니다.");
	}

}
