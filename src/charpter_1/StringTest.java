package charpter_1;
/**
 *  以下是典型的字符串的处理方式   
 * @author shuiyanping
 *
 */
public class StringTest {
public static void main(String[] args) {
//	boolean is=isPalindrome("Ivo iovI");
//	System.out.println("is:"+is);
	///////////////////////以下是测试substring（）方法的部分///////////
//	String s="index.txt";
//	System.out.println("点出现的位置："+s.indexOf("."));
//	System.out.println(s.substring(0, 5));
//	System.out.println(s.substring(6, 9));
	
	toarray("i like you");
	
}
/**
 * 检查一个字符串数组中的元素是否已按照字母表顺序排序  
 * @param a
 * @return
 */
public static boolean isSorted(String[] a) {
	for(int i=1;i<a.length;i++) {
		if(a[i-1].compareTo(a[i])>0) {
			return false;
		}
	}
	return true;
}

/**
 * 判断一个字符串是否是回文数字
 * @param s
 * @return
 */
public static boolean isPalindrome(String s) {
	int N=s.length();
	System.out.println("字符串的长度为："+N);
	for(int i=0;i<N/2;i++) {
		if(s.charAt(i)!=s.charAt(N-1-i)) {
			return false;
		}
		//return true;  这里是错误的   只进行了一次循环  
	}
	
	return true;
}
/**
 * 以空格字符分割一串字符串   重要的空格字符串的表现形式   
 * @param s
 */
public static void toarray(String s) {
	String[] words=s.split("\\s+");
	for(int i=0;i<words.length;i++) {
	System.out.println(words[i]);
	}
}


 public static void tiqu(String[] args) {
	 String s=args[0];
	 int dot=s.indexOf(".");
	 String base=s.substring(0, dot);
	 String extendsion=s.substring(dot+1,s.length());
 }


}
