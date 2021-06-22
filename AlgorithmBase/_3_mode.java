import java.util.Scanner;

public class _3_mode {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[10];
		int[] arr2 = new int[10];
		int max = 0;
		int value = 0;
		
		for(int i=0; i<10; i++) {
			arr[i] = sc.nextInt();
			arr2[arr[i]]++;
			
		}
		for(int j=0; j<10; j++) {
			if(arr2[j]>max) {
				max = arr2[j];
				value = j;
			}
		}
		
		System.out.println("가장많이 나온값: " + value);
		System.out.println("가장많이 나온값의 횟수: " + max + "회");
		
		 
	}

}
