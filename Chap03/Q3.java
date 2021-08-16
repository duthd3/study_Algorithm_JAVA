package chap03;

import java.util.Scanner;

public class Q3 {
	static int searchIdx(int[] a, int n, int key, int[] idx) {
		int count = 0;
		int idx2 = 0;
		for(int i=0; i<a.length; i++) {
			if(a[i] == key) {
				idx[idx2] = i; 
				idx2++;
				count++;
			}
				
		}
		return count;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("요솟수:");
		int n = sc.nextInt();
		int[] a = new int[n];
		int[] idx = new int[n];
		
		for(int i=0; i<a.length; i++) {
			a[i] = sc.nextInt();
		}
		
		System.out.print("key 값:");
		int key = sc.nextInt();
		int result = searchIdx(a, n, key, idx);
		System.out.print("배열:");
		
		for(int i=0; i<result; i++) {
			System.out.print(idx[i] + " ");
		}
		System.out.printf("요솟수: %d", result);
		
	}

}
