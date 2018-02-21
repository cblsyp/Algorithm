package charpter_1;
/**
 *  这个测试用例是用来测试 在该包下下的Stack API用例
 * @author shuiyanping
 *
 */
public class Test_7 {
public static void main(String[] args) {
	Stack<String> stack=new Stack<String>();
	stack.push("String");
	stack.push("wode");
	stack.push("lingwai");
	// 
	for(String s:stack) {
		System.out.println(s);
	}
	
}
}
