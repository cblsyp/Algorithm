package charpter_1;

public class Test_1 {
public static void main(String[] args) {
	
	Object j=new Object();
	int[] a= {2,9,3,88,554,98,3,5};
	StaticSETofInts s=new StaticSETofInts(a);
	boolean sure=s.contains(2);
	System.out.println(sure);
	
	
}
}
