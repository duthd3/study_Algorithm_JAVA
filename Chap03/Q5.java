package chap03;

import java.util.Scanner;

public class Q5 {
	static int binSearchX(int[] a, int n, int key) {
		int pl = 0;
		int pr = n-1;
		do {
			int pc = (pl+pr) / 2;  //center 찾기
			if(a[pc] == key) {
				while(a[pc] == key) {
					pc--;	//key값이랑 같은 인덱스 중 가장 왼쪽에 있는거 찾을때 까지 
				}
				return pc+1;
			}				
				
			else if( a[pc] < key)
				pl = pc + 1;
			else
				pr = pc - 1;
		}while(pl <= pr);
		return -1;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int[] arr = {1,3,5,7,7,7,7,8,8,9,9};
		
		System.out.print("key값 입력:");
		int ky = sc.nextInt();		
		
		int result = binSearchX(arr, 11, ky);
		System.out.println(result);
	}

}
