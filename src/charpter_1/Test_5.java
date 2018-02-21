package charpter_1;
/**
 * 经过测试 我们发现这里的最开始支持的String的类 和范型的类都能成功的经过测试
 * @author shuiyanping
 *
 */
public class Test_5 {
public static void main(String[] args) {
	FixedCapacityStack<String> s=new FixedCapacityStack<String>(100);
	s.push("100");
	s.push("我的另一半");
	s.push("我的狗狗");
	s.push("翻垃圾桶");
	
	
	for(int i=0;i<2;i++) {
		System.out.println(s.size());
		System.out.println(s.pop()+"========="+s.size());
	}
	
}
}
