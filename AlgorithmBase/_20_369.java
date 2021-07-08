
public class _20_369 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1; i<=100; i++) {
			String s = String.valueOf(i);
			if(s.contains("3")||s.contains("6")||s.contains("9")) {
				System.out.print("짝 ");
			}
			else {
				System.out.print(i+ " ");
			}
		}
		
	}

}
