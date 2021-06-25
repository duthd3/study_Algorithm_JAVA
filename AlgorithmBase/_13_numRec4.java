
public class _13_numRec4 {

	public static void main(String[] args) {
		int n = 4;
		int[][] arr = new int[n][n];
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				arr[j][i]=(j+1)*(i+1);
			}
		}
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				System.out.printf("%3d", arr[j][i]);
			}
			System.out.println();
		}
	}

}
