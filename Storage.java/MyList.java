
public interface MyList<E> {
	public boolean add(E e);
	public void add(int index,E e);
	public void addLast(E e);
	public void addFirst(E e);
	public void clear();
	public E remove(int index);
	public E getFirst();
	public E remove();
	public E removeLast();
	public E removeFirst();
	public int size();
}
