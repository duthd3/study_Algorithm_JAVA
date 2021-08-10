package chap02;

public class Q4 {

	static void copy(int[] a, int[] b) {
		for(int i=0; i<b.length; i++) {
			a[i] = b[i];
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = new int[5];
		int[] b = new int[5];
		for(int i=0; i<b.length; i++) {
			b[i] = i+1;
		}
		copy(a, b);
		for(int i=0; i<a.length; i++) {
			System.out.println(a[i]);
		}
	}

}
