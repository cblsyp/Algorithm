package charpter_1;

public class FixedCapacityStackOfStrings {
	private String[] a; // stack entries
	private int N; // size

	public FixedCapacityStackOfStrings(int cap) {
		a = new String[cap];
	}

	// this will be custome deal code
	public boolean isEmpty() {
		return N == 0;
	}

	public int size() {
		return N;
	}

	public void push(String item) {
		a[N++] = item;
	}

	public String pop() {
		return a[--N];
	}

}
