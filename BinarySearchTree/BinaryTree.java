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
	//�־����ڵ�
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
	//���� ����
	
	public boolean isBST() {
		if (this.right == null && this.left == null) return true;
		//���ʰ� �������� ����
		if (this.right ==null && this.left.isBST()) return true;
		if (this.left == null && this.right.isBST()) return true;
		//���ʰ� �������� �������θ� �����µ� �������� bst�ΰ��
		if (!(this.root instanceof Comparable)) return false;
		if (!(this.left.root instanceof Comparable)) return false;
		if (!(this.right.root instanceof Comparable)) return false;
		//�񱳰���
		Comparable thisRoot = (Comparable)this.root;
		Comparable leftRoot = (Comparable)left.root;
		Comparable rightRoot = (Comparable)right.root;
		//����
		if (thisRoot.compareTo(leftRoot) < 0) return false;
		if (thisRoot.compareTo(rightRoot) > 0) return false;
		//bst����
		return left.isBST() && right.isBST();
	    //���
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
		//bst�� �ǵ��� ����
		else {
			if(getLeft() == null)
				left = new BinaryTree(data);
			else
				left.insertKey( data);
		}
		//���� �������� �ݴ�U����
		
	}

}
