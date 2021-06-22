import java.util.Scanner;

public class _5_CapToLow {

	public static void main(String[] args) {
		String input = "ABCdef";
		char[] arr;
		arr = input.toCharArray();
		for(int i=0; i<arr.length; i++) {
			if(65<=arr[i]&&arr[i]<=97)
				arr[i]=(char)(arr[i]+32);
			else
				arr[i]=(char)(arr[i]-32);
		}
		
		for(int j=0; j<arr.length; j++) {
			System.out.print(arr[j]);
		}
		
		
	}

}
