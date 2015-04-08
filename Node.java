package tree;

public class Node {
	Object obj;
	Node child1;
	Node child2;
	public Node(Object obj, Node child1, Node child2){
		this.obj = obj;
		this.child1 = child1;
		this.child2 = child2;
	}
	public Node(Object obj, Node child1){
		this(obj, child1, null);
	}
	public Node(Object obj){
		this(obj, null, null);
	}
}
