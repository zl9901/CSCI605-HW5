
public class MyLinkedList<E> extends MyAbstractClass<E> {
	public Node<E> head,tail = null;
	
	public MyLinkedList(){
		
	}
	public void addFirst(E e) {
		Node<E> newNode=new Node<E>(e);
		newNode.next=head;
		head=newNode;
		size++;
		if(tail==null) {
			tail=head;
		}
	}
	
	public void addLast(E e) {
		Node<E> newNode=new Node<E>(e);
		if(tail==null) {
			head=tail=newNode;
		}else {
			tail.next=newNode;
			tail=tail.next;
		}
		size++;
	}
	
	public void add(int index,E e) {
		if(index==0) addFirst(e);
		else if (index>=size) addLast(e);
		else {
			Node<E>current=head;
			for(int i=1;i<index;i++) 
				current=current.next;
			Node<E> temp=current.next;
			current.next=new Node<E>(e);
			(current.next).next=temp;
			size++;
		}
	}
	
	public E removeFirst() {
		if(size==0) return null;
		else if(size==1) {
			Node<E>temp=head;
			head=tail=null;
			size=0;
			return temp.element;
		}else {
			Node<E>temp=head;
			head=head.next;
			size--;
			return temp.element;
		}
	}
	
	public E removeLast() {
		if(size==0) return null;
		else if(size==1) {
			Node<E>temp=head;
			head=tail=null;
			size=0;
			return temp.element;
		}else {
			Node<E>current=head;
			for(int i=0;i<size-2;i++) {
				current=current.next;
			}
			Node<E>temp=tail;
			tail=current;
			tail.next=null;
			size--;
			return temp.element;
		}
	}
	
	public E remove(int index) {
		if(index<0||index>=size) return null;
		else if(index==0) return removeFirst();
		else if(index==size-1) return removeLast();
		else {
			Node<E>previous=head;
			for(int i=1;i<index;i++) {
				previous=previous.next;
			}
			Node<E>current=previous.next;
			previous.next=current.next;
			size--;
			return current.element;
		}
	}
	
	public void clear() {
//		for(int i=0;i<size;i++) {
//			remove(i);
//		}
		head=tail=null;
		size=0;
	}
	
	public int size() {
		return size;
	}
	
	public E getFirst() {
		if(size==0) {
			return null;
		}else {
			return head.element;
		}
	}
	
}
