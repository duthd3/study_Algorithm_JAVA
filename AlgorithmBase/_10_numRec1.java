import java.util.Scanner;

public class _10_numRec1_ {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 System.out.println("숫자를 입력하세요>");
		 int num = sc.nextInt();
		 
		 for(int i=0; i<num; i++){			         
		  	for(int j=1; j<=num; j++){
			 System.out.printf("%3d", j+num*i);
			}
		 System.out.println();
	 }
		
	}

}
