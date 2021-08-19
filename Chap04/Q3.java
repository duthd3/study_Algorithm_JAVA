package chap04;

public class Q3 {
	private int max; //스택의 용량(A,B의 합계)
	private int ptrA;
	private int ptrB;
	private int[] stk;
	
	public enum AorB{
		StackA, StackB
	};
	
	public class EmptyIntStackX2Exception extends RuntimeException {
		public EmptyIntStackX2Exception() {
		}
	}
			
	public class OverflowIntStackX2Exception extends RuntimeException {
		public OverflowIntStackX2Exception() {
		}
	}
	
	public Q3(int capacity) {
		ptrA = 0;
		ptrB = capacity - 1;
		max = capacity;
		try {
			stk = new int[max]; // 스택 본체용 배열을 생성
		} catch (OutOfMemoryError e) { // 생성할 수 없습니다.
			max = 0;
		}
	}
	
	public int push(AorB sw, int x) throws OverflowIntStackX2Exception{
		if(ptrA >= ptrB + 1)
			throw new OverflowIntStackX2Exception();
		switch(sw) {
		case StackA:
			stk[ptrA++] = x;
			break;
		case StackB:
			stk[ptrB++] = x;
			break;
		}
		return x;
	}
	
	public int pop(AorB sw) throws EmptyIntStackX2Exception{
		int x = 0;
		switch(sw) {
		case StackA:
			if(ptrA <= 0)
				throw new EmptyIntStackX2Exception();
			x = stk[--ptrA];
			break;
		case StackB:
			if(ptrB >= max -1)
				throw new EmptyIntStackX2Exception();
			x = stk[++ptrB];
			break;
		}
		return x;
	}
	
	public int peek(AorB sw) throws EmptyIntStackX2Exception{
		int x = 0;
		switch(sw) {
		case StackA:
			if(ptrA <= 0)
				throw new EmptyIntStackX2Exception();
			x = stk[ptrA-1];
			break;
			
		case StackB:
			if(ptrB >= max-1)
				throw new EmptyIntStackX2Exception();
			x = stk[ptrB+1];
		}
		return x;
	}
	//스택에서 x를 검색하여 index(찾지 못하면 -1)를 반환
	public int indexOf(AorB sw, int x) {
		switch(sw) {
		case StackA:
			for(int i=ptrA-1; i>=0; i--) {
				if(stk[i] == x)
					return i;
			}
			break;
		
		case StackB:
			for(int i=ptrB+1; i<=max; i++)
				if(stk[i] == x)
					return i;
			break;
		}
		return -1;
	}
	
	//스택을 비움
	public void clear(AorB sw) {
		switch(sw) {
		case StackA:
			ptrA = 0;
			break;
		case StackB:
			ptrB = max-1;
			break;
		}
		
	}
	//스택의 용량을 반환(A와 B의 합계)
	public int capacity() {
		return max;
	}
	//스택에 쌓여있는 데이터 수를반환
	public int size(AorB sw) {
		switch(sw) {
		case StackA:
			return ptrA;
		case StackB:
			return max-ptrB-1;
		}
		return 0;
	}
	//스택이 비어있는가?
	public boolean isEmpty(AorB sw) {
		switch(sw) {
		case StackA:
			return ptrA<=0;
		case StackB:
			return ptrB>=max-1;
		}
		return true;
	}
	//스택이 가득 찼는가?
	public boolean isFull() {
		return ptrA>=ptrB + 1;
	}
	//스택 안의 데이터를 바닥 -> 꼭대기의 차례로 나타냄
	public void dump(AorB sw) {
		switch(sw) {
		case StackA:
			if(ptrA<=0)
				System.out.println("스택이 비었습니다.");
			else {
				for(int i=0; i<ptrA; i++) {
					System.out.print(stk[i] + " ");
				}
				System.out.println();
			}
			break;
		case StackB:
			if(ptrB>=max-1)
				System.out.println("스택이 비었습니다.");
			else {
				for(int i=max-1; i>ptrB; i--)
					System.out.println(stk[i] + " ");
				System.out.println();
			}
			break;
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
