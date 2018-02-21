package charpter_1;

/**
 * 这里我们将要定义的是 equals（） 方法 必须准手java中的相关规定
 * 
 * @author shuiyanping
 *
 */
public class Date {
	private final int month;
	private final int day;
	private final int year;

	public Date(int m, int d, int y) {
		month = m;
		day = d;
		year = y;
	}

	public int month() {
		return month;
	}

	public int day() {
		return day;
	}

	public int year() {
		return year;
	}

	public String toString() {

		return month() + "/" + day() + "/" + year();
	}

	public boolean equals(Object x) {
		//引用相等  则必定相等 因为是同一个东西   
		if (this == x) {
			return true;
		}
//		约定  如果需要比较的对象为空 则必定为空  这个是约定的东西
		if (x == null) {
			return false;
		}
//  类不同 则必不相同   
		if (this.getClass() != x.getClass()) {
			return false;
		}
		Date that = (Date) x;
		if (this.day != that.day) {
			return false;
		}
		if (this.month != that.month) {
			return false;
		}
		if (this.year != that.year) {
			return false;
		}

		return true;
	}

}
