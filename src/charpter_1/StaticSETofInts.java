package charpter_1;

import java.util.Arrays;
/**
 * 二分法查找  一个整数   中心思想是  先给一个整数数组排序 然后按照二分法思想找出来
 *
 * @author shuiyanping
 *
 */
public class StaticSETofInts {
	int[] a;

	public StaticSETofInts(int[] arrays) {
		a = new int[arrays.length];
		for (int i = 0; i < arrays.length; i++) {
			a[i] = arrays[i];
		}

		Arrays.sort(a);
		for(int i=0;i<arrays.length;i++) {
			System.out.println(a[i]);
		}
	}
	
	public boolean contains(int key) {
		return rank(key)!=-1;
	}

	private int rank(int key) {
		int ho = 0;
		int hi = a.length - 1;
//		最重要的一点是   key  必然存在于 a[ho...hi]  之中  
		while (ho <= hi) {
			int mid = ho + (hi - ho) / 2;
			if (key < a[mid]) {
				hi = mid - 1;
			} else if (key > a[mid]) {
				ho = mid + 1;
			} else {
				return mid;
			}
		}

		return -1;
	}

}
