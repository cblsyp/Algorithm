package charpter_1;

public class FixedCapacityStackOfString {
private String[] a;
private int N;
public FixedCapacityStackOfString(int cap) {
	a=new String[cap];
}
public boolean isEmpty() {
	return N==0;
}
public int size() {
	return N;
}
public void push(String s) {
	//下面这句话的包含的意思是  a[N]=s  然后N=N+1    
	a[N++]=s;	
}
public String pop() {
	return a[--N];
}

}
