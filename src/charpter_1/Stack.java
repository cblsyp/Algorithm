package charpter_1;

import java.util.Iterator;

/**
 * 这里的迭代的实现可能有问题 需要好好想想
 * 问题  这个用例的第一次测试的时候  出现了不能打印最先进栈的一个Item  
 * @author shuiyanping
 *
 * @param <Item>
 */
public class Stack<Item> implements Iterable<Item> {

	private Node first;

	private int N;

	private class Node {
		// 定义了节点的嵌套类
		Item item;
		Node next;
	}

	public boolean isEmpty() {
		return first == null;
	}

	public int size() {
		return N;
	}

	public void push(Item item) {
		// 向栈顶添加元素
		Node oldfirst = first;
		first = new Node();
		first.item = item;
		first.next = oldfirst;
		N++;
	}

	public Item pop() {
		Item item = first.item;
		first = first.next;
		N--;
		return item;
	}

	public Iterator<Item> iterator() {
		return new ReverseArrayIterator();
	}

	private class ReverseArrayIterator implements Iterator<Item> {
		private Node node = first;

		// 这里还需要验算 或者说我还没有看懂
		@Override
		public boolean hasNext() {
			// TODO Auto-generated method stub
			return !(node.next == null);
		}

		@Override
		public Item next() {
			// TODO Auto-generated method stub
			// 应该没有问题 我们返回的数据没有问题
			Item item = node.item;
			node = node.next;
			return item;
		}
	}

}
