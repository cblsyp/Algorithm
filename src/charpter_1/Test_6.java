package charpter_1;

import edu.princeton.cs.algs4.Stack;
import edu.princeton.cs.algs4.StdOut;

public class Test_6 {
public static void main(String[] args) {
	Stack<String> collection=new Stack<String>();
	
	collection.push("我的第一个数据");
	collection.push("我的第二个数据");
	collection.push("我的第三个数据");
	collection.push("我的第四个数据");
	
	
	for(String s:collection) {
		StdOut.println(s);
	}
	
}
}
