import java.util.Scanner;

public class _11_numRec2 {

	public static void main(String[] args) {
		int n = 4;
		
		
		int arr[][] = new int[n][n];
		
		for(int i=0; i<arr.length; i++) {
			if(i%2==0) {
				for(int j=0; j<arr[i].length; j++) {
					arr[i][j] = 4*i+j+1;
				}
				
			}
			else {
				for(int k=0; k<arr[i].length; k++) {
					arr[i][k]=4*(i+1)-k;
				}
				
			}
				
		}
		
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				System.out.printf("%4d", arr[i][j]);
			}
			System.out.println();
		}
		
		
		
	}

}
