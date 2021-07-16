package chap01;

public class Max3m {
	static int max3(int a, int b, int c) {
		int max = a;
		if(b>max) max = b;
		if(c>max) max = c;
		
		return max;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("max(3,2,1) =" + max3(3,2,1));
		System.out.println("max(2,21,31) =" + max3(2,21,31));
		System.out.println("max(13,12,11) =" + max3(13,12,11));
		System.out.println("max(31,21,11) =" + max3(31,21,11));
		System.out.println("max(35,52,51) =" + max3(35,52,51));
		System.out.println("max(36,26,61) =" + max3(36,26,61));
	}

}
