package chap02;

public class Q5 {
	static void rcopy(int[] a, int[] b) {
		for(int i=0; i<b.length; i++) {
			a[i] = b[b.length-i-1];
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = new int[5];
		int[] b = {1,3,5,7,9};
		rcopy(a, b);
		for(int i=0; i<a.length; i++) {
			System.out.println(a[i]);
		}
	}

}
