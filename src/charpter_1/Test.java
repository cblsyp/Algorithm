package charpter_1;

public class Test {
public static void main(String[] args) {
	//构造器中的数值是否一样并不影响对象的创建  即使构造器中的数据是一样的   即初始化两个相同的对象 放在两个不同的地址
	Counter t=new Counter(15);
	Counter s=new Counter(15);
	
	t.increment();
	t.increment();
	
	System.out.println("整个技术器增加的次数："+t.tally()+"最后的数值："+t.toString());
	System.out.println("整个技术器增加的次数："+s.tally()+"最后的数值："+s.toString());
}
}
