public class BinaryTree {
    public static void main(String[] args) {
        BinarySearchTree bst = new BinarySearchTree();
        // Add 7 elements;
        bst.insert(20);
        bst.insert(30);
        bst.insert(40);
        bst.insert(10);
        bst.insert(5);
        bst.insert(60);
        bst.insert(12);

        // Search elements
        System.out.println(bst.search(20));
    }
}

class TreeNode {
    int val;
    private TreeNode left;
    private TreeNode right;

    public TreeNode(int val){
        this.val = val;
    }

    public int getVal() {
        return val;
    }

    public void setLeft(TreeNode node) {
        left = node;
    }

    public TreeNode getLeft() {
        return left;
    }

    public void setRight(TreeNode node) {
        right = node;
    }

    public TreeNode getRight() {
        return right;
    }
}

class BinarySearchTree {
    private TreeNode root;
    public BinarySearchTree() {
        root = null;
    }

    public void insert(int data) {
        root = insertRecursive(root, data);
    }

    private TreeNode insertRecursive(TreeNode root, int data) {
        if (root == null) {
            root = new TreeNode(data);
            return root;
        }

        if (data < root.getVal())
            root.setLeft(insertRecursive(root.getLeft(), data));
        else if (data >= root.getVal())
            root.setRight(insertRecursive(root.getRight(), data));

        return root;
    }

    public boolean search(int data) {
        return searchRecursive(root, data);
    }

    public boolean searchRecursive(TreeNode current, int data) {
        if (current == null || current.getVal() == data) {
            return current != null;
        } else {
            if (data <  current.getVal()) {
                return searchRecursive(current.getLeft(), data);
            } else {
                return searchRecursive(current.getRight(), data);
            }
        }
    }

    // Prints are done using traversals


}
