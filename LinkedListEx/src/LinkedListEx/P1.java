package LinkedListEx;

public class P1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		LinkedListEx list = new LinkedListEx();
//		for(int i=0;i<10;i++) {
//			list.add(i);
//		}
//
//		System.out.println(list.extract(1));
//		System.out.println(list.remove(2));
		
		LinkedListEx<Data> list = new LinkedListEx<Data> ();
		
		Data d1 = new Data(10,20);
		
		list.add(d1);
		
		list.add(new Data(20,30));
		
		Data r = list.get(1);
		System.out.println(r.v2);
	}

}

class Data{
	int v1;
	int v2;
	//»ý¼ºÀÚ
	Data(int v1, int v2){
		this.v1 = v1;
		this.v2 = v2;
	}
}







///API//////
class Node<V>{
	V value;
	Node<V> next;	
}

class LinkedListEx<E>{
	Node<E> first = null;
	
	void add(E value) {
		
		Node<E> newNode = new Node<E>();
		newNode.value = value;
		
		if(first == null) {
			first = newNode;
			return;
		}
		
		Node<E> temp = first;
		
		while (true){
			if(temp.next == null) {
				temp.next = newNode;
				break;
			}
			temp = temp.next;
			
		}

	}
	
	E get(int index) {
		Node<E> temp = first;
		for(int i =0; i < index; i++) {
			temp = temp.next;
		}
		return temp.value;
	}
	
	void remove(int index) {
		
		if (index == 0) {
			first = first.next;
		}
		
		Node<E> temp = first;
		
		for(int i=0; i<index-1 ;i++) {
			temp = temp.next;
		}
		temp.next = temp.next.next;
		
	}
	
	
	void add(int index, E value) {
		Node<E> newNode = new Node<E>();
		newNode.value = value; 
		
		if(index == 0) {
			newNode.next = first;
			first = newNode;
		}
		Node<E> temp = first;
		for(int i=0; i< index-1;i++) {
			temp = temp.next;
		}
		
		newNode.next = temp.next;
		temp.next = newNode;
		
	}
}













