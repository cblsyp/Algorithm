package charpter_1;

import java.util.Iterator;;

/**
 * 相比与前一个类 这个类增加了范型的支持
 * 
 * @author shuiyanping
 *
 * @param <Item>
 */
public class FixedCapacityStack<Item> {
	private Item[] a; // stack entries
	private int N; // size

	public FixedCapacityStack(int cap) {
		a = (Item[]) new Object[cap]; // 类型转换

	}

	public boolean isEmpty() {
		return N == 0;
	}

	public int size() {
		return N;
	}

	/**
	 * 这个方法是最基本的方法 没有考虑到数组容量不足的问题
	 * 
	 * @return
	 */
	// public void push(Item i) {
	// a[N++]=i;
	// }

	/**
	 * 最基本的出栈的方法 没有考虑 当我们原来的数组的实际的储存的元素太少的情况
	 * 
	 * @return
	 */
	// public Item pop() {
	// return a[--N];
	// }
	/**
	 * 这项操作的耗时和栈的大小成正比
	 * 
	 * @param max
	 */
	private void resize(int max) {
		// 将大小为N<=max 的栈移动到大小为Max的数组中
		Item[] temp = (Item[]) new Object[max];
		for (int i = 0; i < N; i++) {
			temp[i] = a[i];
		}
		a = temp;
	}

	public void push(Item item) {
		if (N == a.length) {
			resize(2 * a.length);
			a[N++] = item;

		}
	}

	public Item pop() {
		Item item = a[--N];
		a[N] = null;// 避免对象游离

		if (N > 0 && N == a.length / 4) {
			resize(a.length / 2);
		}

		return item;
	}

	private class ReverseArrayiterator implements Iterator<Item> {
		private int i = N;

		@Override
		public boolean hasNext() {
			// TODO Auto-generated method stub
			return i > 0;
		}

		@Override
		public Item next() {
			// TODO Auto-generated method stub
			return a[--i];
		}

	}

}
