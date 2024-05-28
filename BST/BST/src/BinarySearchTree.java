import java.util.ArrayList;
import java.util.List;

public class BinarySearchTree {
	 Node root;

	    BinarySearchTree() {
	        root = null;
	    }

	    void add(int value) {
	        root = addRecursive(root, value);
	    }

	    Node addRecursive(Node current, int value) {
	        if (current == null) {
	            return new Node(value);
	        }

	        if (value < current.value) {
	            current.left = addRecursive(current.left, value);
	        } else if (value > current.value) {
	            current.right = addRecursive(current.right, value);
	        }

	        return current;
	    }

	    int getHeight() {
	        return getHeightRecursive(root);
	    }

	    int getHeightRecursive(Node current) {
	        if (current == null) {
	            return 0;
	        }
	        return Math.max(getHeightRecursive(current.left), getHeightRecursive(current.right)) + 1;
	    }

	    List<Integer> inOrderTraversal() {
	        List<Integer> result = new ArrayList<>();
	        inOrderRecursive(root, result);
	        return result;
	    }

	    void inOrderRecursive(Node node, List<Integer> result) {
	        if (node != null) {
	            inOrderRecursive(node.left, result);
	            result.add(node.value);
	            inOrderRecursive(node.right, result);
	        }
	    }
}
