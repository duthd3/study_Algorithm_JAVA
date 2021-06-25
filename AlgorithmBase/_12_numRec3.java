
public class _12_numRec3 {

	public static void main(String[] args) {
		
		int n = 4;
		int num=1;
		
		int[][] arr = new int[n][n];
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				arr[j][i] = num;
				num++;
			}
		}
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				System.out.printf("%3d", arr[i][j]);
			}
			System.out.println();
		}
	}

}
