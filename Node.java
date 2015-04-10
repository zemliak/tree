package tree;

public class Node {
	Integer x;
	Node child1;
	Node child2;
	public Node(Integer x, Node child1, Node child2){
		this.x = x;
		this.child1 = child1;
		this.child2 = child2;
	}
	public Node(Integer x, Node child1){
		this(x, child1, null);
	}
	public Node(Integer x){
		this(x, null, null);
	}
}
