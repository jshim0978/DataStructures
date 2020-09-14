package BinarySearchTree;


public class BinaryTree{
	private Object root;

	private BinaryTree left, right;
	

	
	public BinaryTree(Object root){
		this.root = root;
		this.left = null;
		this.right = null;
		
	}

	public String toString() {
		StringBuffer buf = new StringBuffer("[");
		if(left!= null) buf.append(left + ",");
		buf.append(root);
		if(right!=null) buf.append("," + right);
		return buf + "]";
	}
	//주어진코드
	public Object getRoot() {
		return this.root;
	}
	public BinaryTree getLeft() {
		return this.left;
		
	}
	public BinaryTree getRight() {
		return this.right;
	}
	public Object setRoot(Object object) {
		Object oldRoot = this.root;
		this.root = object;
		return oldRoot;
	}
	public BinaryTree setLeft(BinaryTree tree) {
		BinaryTree oldLeft = this.left;
		this.left = tree;
		return oldLeft;
	}
	public BinaryTree setRight(BinaryTree tree) {
		BinaryTree oldRight = this.right;
		this.right = tree;
		return oldRight;
	}
	//게터 세터
	
	public boolean isBST() {
		if (this.right == null && this.left == null) return true;
		//왼쪽과 오른쪽이 빈경우
		if (this.right ==null && this.left.isBST()) return true;
		if (this.left == null && this.right.isBST()) return true;
		//왼쪽과 오른쪽중 한쪽으로만 뻗었는데 그한쪽이 bst인경우
		if (!(this.root instanceof Comparable)) return false;
		if (!(this.left.root instanceof Comparable)) return false;
		if (!(this.right.root instanceof Comparable)) return false;
		//비교가능
		Comparable thisRoot = (Comparable)this.root;
		Comparable leftRoot = (Comparable)left.root;
		Comparable rightRoot = (Comparable)right.root;
		//선언
		if (thisRoot.compareTo(leftRoot) < 0) return false;
		if (thisRoot.compareTo(rightRoot) > 0) return false;
		//bst조건
		return left.isBST() && right.isBST();
	    //재귀
	}
	
	public void insertKey(Object data)
	{
		Comparable key = (Comparable)root;
	
		

		int result = ((Comparable)data).compareTo(key);
	  
		if(result > 0) {
			if(getRight() == null)
				right = new BinaryTree(data);
			else
				right.insertKey( data);
		}
		//bst가 되도록 삽입
		else {
			if(getLeft() == null)
				left = new BinaryTree(data);
			else
				left.insertKey( data);
		}
		//위와 마찬가지 반대쪾으로
		
	}

}
