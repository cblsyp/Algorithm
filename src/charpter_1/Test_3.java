package charpter_1;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class Test_3 {
	public static void main(String[] args) {
		FixedCapacityStackOfString s;
		s = new FixedCapacityStackOfString(100);

		
		for(int i=0;i<args.length;i++) {
			System.out.println(args[i]);
		}
		
		
		while (!StdIn.isEmpty()) {
			StdOut.print("in is not null");
			System.out.println("in is not null");
			String item = StdIn.readString();
			if (!item.equals("-")) {
				s.push(item);
			} else if (!s.isEmpty()) {
				StdOut.print(s.pop() + "");
			}
		}
		
		StdOut.print("("+s.size()+"left on stack");
		
		
		System.out.println("It is over");
	}
}
