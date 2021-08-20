package chap05;

import java.util.Scanner;

public class Q3 {
	static int gcd(int x, int y) {
		if(y==0)
			return x;
		else
			return gcd(y, x%y);
	}
	static int gcdArray(int[] a, int start, int no) {
		if(no == 1)
			return a[start];
		else if(no==2)
			return gcd(a[start], a[start + 1]);
		else
			return gcd(a[start], gcdArray(a, start + 1, no -1));
			
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 몇 개의 최대 공약수를 구할까요? ");
		int num;
		do {
			num = sc.nextInt();
			
		}while(num<=1);
		int[] x = new int[num];
		
		for(int i=0; i<num; i++) {
			System.out.print("x[" + i + "]:");
			x[i] = sc.nextInt();
		}
		System.out.println("최대 공약수는 " + gcdArray(x, 0, num) + "입니다.");
	}

}
