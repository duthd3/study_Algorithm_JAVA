package chap02;
import java.util.Scanner;


public class Q2 {
	static void swap(int[] a, int idx1, int idx2) {
		int t=a[idx1];
		a[idx1]=a[idx2];
		a[idx2]=t;
		System.out.printf("a[%d]와 a[%d]를 교환합니다.", idx1, idx2);
		System.out.println();
		for(int i=0; i<a.length; i++) {
			System.out.print(a[i]+" ");
		}
		
		System.out.println();
	}
	static void reverse(int[] a) {
		for(int i=0; i<a.length/2; i++) {
			swap(a, i, a.length-i-1);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("요솟수:");
		int num = stdIn.nextInt();
		
		int[] x = new int[num];
		
		for(int i=0; i<num; i++) {
			System.out.print("x[" + i + "]:");
			x[i]=stdIn.nextInt();
		}
		for(int i=0; i<num; i++) {
			System.out.print(x[i]);
		}
		System.out.println();
		
		reverse(x);
		System.out.println("요소를 역순으로 정렬했습니다.");
		for(int i=0; i<num; i++) {
			System.out.println("x[" + i + "]=" + x[i]);
		}
	}

}
