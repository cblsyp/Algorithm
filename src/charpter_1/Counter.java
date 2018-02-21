package charpter_1;
// 经过测试  该计数器能够正常使用  
public class Counter {
private int  id;
private int counter=0;
public Counter(int id) {
	this.id=id;
}

public void increment() {
	id++;
	counter++;
}

public int tally() {
	return counter;
}


public String toString() {
	return String.valueOf(id);
}
}
