package tree;

public class Tree {
	Node root;
	int size;
	public Tree(){
		root = new Node(null);
		size = 0;
	}
	public void add (Integer x){
		Node addition = new Node(x);
		if (size == 0){
			root = addition;
			size++;
			return;
		}
		Node cur = root;
		while(cur.child1 != null && cur.child2 != null){
			if (x > cur.x){
				if (cur.child2 != null)
					cur = cur.child2;
				else if (cur.child2 == null){
					cur.child2 = addition;
					size++;
					return;
				}
			}
			else {
				if (cur.child1 != null)
					cur = cur.child1;
				else if (cur.child1 == null){
					cur.child1 = addition;
					size++;
					return;
				}
			}
		}
		if (x > cur.x)
			cur.child2 = addition;
		cur.child1 = addition;
		size++;
	}
	public int getSmallest(){
		Node cur = root;
		while(cur.child1 != null){
			cur = cur.child1;
		}
		return cur.x;
	}
	public int getLargest(){
		Node cur = root;
		while(cur.child2 != null){
			cur = cur.child2;
		}
		return cur.x;
	}
	public void delete(Integer x){
		Node cur = root;
		while(cur.child1.x != x || cur.child2.x != x){
			if(cur.x < x)
				cur = cur.child2;
			cur = cur.child1;
		}// cur.child1 or 2 is the node that has to be deleted right now
		Node 
	}
}
