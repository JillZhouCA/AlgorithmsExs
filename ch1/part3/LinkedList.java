class LinkedList<T>{
	private class Node {
		T item;
		Node next;

		private Node(T item){
			this.item = item;
			this.next = null;
		}
	}

	private Node first;
	private int size;

	public LinkedList(){
		this.first = null;
		this.size = 0;
	}

	public boolean empty(){
		return this.size == 0;
	}

	public int size(){
		return this.size;
	}

	public T peek(){
		Node n = first;
		while(n.next != null){
			n = n.next;
		}
		return n.item;
	}

	public void push(T item){
		size++;
		Node n = new Node(item);
		if(first == null){
			first = n;
		} else{
			Node temp = first;
			while(temp.next != null){
				temp = temp.next;
			}
			temp.next = n;
		}
	}

	public T pop(){
		if(this.first == null)
			return null;
		else{
			size --;
			Node temp = this.first;
			while(temp.next.next != null)
				temp = temp.next;
			T value = temp.next.item;
			temp.next = null;
			return value;
		}
	}

	public boolean find(T item){
		Node temp = first;
		while(temp != null){
			if(temp.item == item)
				return true;
			temp = temp.next;
		}
		return false;
	}

	public boolean delete(int pos){
		if(size < pos - 1)
			return false;
		else{
			size --;
			Node temp = first;
			for(int i = 0; i < pos - 1; i++)
				temp = temp.next;
			temp.next = temp.next.next;
			return true;
		}
	}

	public void printResult(){
		Node n = this.first;
		while(n != null){
			System.out.print(n.item + " ");
			n = n.next;
		}
		System.out.println();
	}

	public void removeAfter(Node n){
		if(n == null || n.next == null || this.first == null || this.first.next == null)
			return;
		else{
			Node temp = this.first;
			while(temp.next.next != null){
				if(temp.item == n.item && temp.next.item == n.next.item){
					temp.next = temp.next.next;
					return;
				}
				temp = temp.next;
			}
			//find out no matched node n
			return;
		}
	}

	public void insertAfter(Node first, Node second){
		if(first == null || second == null || this.first == null)
			return;
		else{
			Node temp = this.first;
			while(temp != null){
				if(temp.item == first.item){
					Node nt = temp.next;
					temp.next = second;
					second.next = nt;
					return;
				}
				temp = temp.next;
			}
			return;
		}
	}

	public void remove(T key){
		Node temp = this.first;
		while(temp != null && temp.item != key && temp.next != null){
			temp = temp.next;
		}
		if(temp != null && temp.item == key)
			temp.next = temp.next.next;
		return;
	}

	// this is question 1.3.27, which assumed the value in linkedlist is integer
	public T max(Node fst){
		if(fst == null)
			return null;
		else{
			T maxKey = fst.item;
			Node temp = fst;
			while(temp != null){
				if((Integer)temp.item > (Integer)maxKey)
					maxKey = temp.item;
				temp = temp.next;
			}
			return maxKey;
		}
	}

	//1.3.28
	public T maxRecursive(Node n, T maxkey){
		if(n == null)
			return maxkey;
		else if((Integer)n.item > (Integer)maxkey)
			return maxRecursive(n.next, n.item);
		else
			return maxRecursive(n.next, maxkey);
	}

	/**
	* All belows are test files
	*/
	public static void main(String args[]){
		LinkedList<Integer> lst = new LinkedList<>();
		for(int i = 0; i < 10; i++){
			lst.push(i);
		}
		lst.printResult();
		lst.pop();
		lst.printResult();
		System.out.println(lst.find(1));
		System.out.println(lst.find(11));
		System.out.println(lst.size());
		lst.delete(1);
		lst.printResult();
		System.out.println(lst.peek());
		System.out.println(lst.maxRecursive(lst.first, lst.first.item));
	}
}