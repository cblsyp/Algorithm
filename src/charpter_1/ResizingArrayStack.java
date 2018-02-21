package charpter_1;

import java.util.Iterator;
/**
 * 首先这个数据结构是一个栈  （能够动态的调数组大小的实现）
 * @author shuiyanping
 *
 * @param <Item>
 */
public class ResizingArrayStack<Item> implements Iterable<Item> {

	private Item[] a = (Item[]) new Object[1]; // 栈元素

	private int N = 0; // 元素数量

	private boolean isEmpty() {
		return N == 0;
	}

	public int size() {
		return N;
	}

	private void resize(int max) {
		// 将栈移动到一个大小为max 的新数组
		Item[] temp = (Item[]) new Object[max];
		for (int i = 0; i < N; i++) {
			temp[i] = a[i];
		}
		a = temp;
	}

	public void push(Item i) {
		// 将元素添加到栈顶
		if (N == a.length) {
			resize(2 * a.length);
		}
		a[N++] = i;
	}

	public Item pop() {
		// 从栈顶删除元素
		Item item = a[--N];  //次数被弹出的元素仍然在数组中   
		a[N] = null;//避免对象游离
		if (N > 0 && N == a.length / 4) {
			resize(a.length / 2);
		}
		return item;
	}
	
	public Iterator<Item> iterator(){
		return new ReverseArrayIterator();
	}
	
	private class ReverseArrayIterator implements Iterator<Item>{
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
