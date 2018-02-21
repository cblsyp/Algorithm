package charpter_1;

import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 * 需要注意的一点是 整个类实现的是Iterable 而我们的内部类实现的是Iterator 这一点是有区别的
 * 
 * @author shuiyanping
 *
 * @param <Item>
 */
public class Bag<Item> implements Iterable<Item> {
	private Node first;// beginning of bag

	private int n;// number of elements in bag

	private static class Node<Item> {
		private Item item;
		private Node<Item> next;
	}

	// Initializes an empty bag
	public Bag() {
		first = null;
		n = 0;
	}

	public boolean isEmpty() {
		return first == null;
	}

	public int size() {
		return n;
	}

	/**
	 * Adds the item to add to this bag every time the add has been work,the
	 * first.next is null
	 * 
	 * @param item
	 *            the them to add to this bag
	 */
	public void add(Item item) {
		Node<Item> oldfirst = first;
		first = new Node<Item>();
		first.item = item;
		first.next = oldfirst;
		n++;
	}

	public class ListIterator<item> implements Iterator<Item> {
		private Node<Item> current;
		public ListIterator(Node<Item> item) {
			current = item;
		}
		@Override
		public boolean hasNext() {
			// TODO Auto-generated method stub
			return current!=null;
		}
		@Override
		public Item next() {
			// TODO Auto-generated method stub
			if (!hasNext()) throw new NoSuchElementException();
			Item item=current.item;
			current=current.next;
			return item;
		}

	}

	@Override
	public Iterator iterator() {
		// TODO Auto-generated method stub
		return null;
	}

}
