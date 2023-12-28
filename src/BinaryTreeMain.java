public class BinaryTreeMain {
    public static void main(String[] args) {
        MyBinarySearchTree<Integer> binarySearchTree = new MyBinarySearchTree<>();

        // binarySearchTree.add(56);
        // binarySearchTree.add(30);//uc1
        // binarySearchTree.add(70);
        
        binarySearchTree.add(56);
        binarySearchTree.add(30);
        binarySearchTree.add(70);
        binarySearchTree.add(22); 
        binarySearchTree.add(40);
        binarySearchTree.add(60);
        binarySearchTree.add(95);
        binarySearchTree.add(11);
        binarySearchTree.add(65);
        binarySearchTree.add(3);
        binarySearchTree.add(16);
        binarySearchTree.add(63);
        binarySearchTree.add(67);

       
        int size = size(binarySearchTree.root);
        System.out.println("Size of the binary tree: " + size);

        boolean found = search(binarySearchTree.root, 63);
        if (found) {
            System.out.println("Key 63 is found in the binary tree.");
        } else {
            System.out.println("Key 63 is not found in the binary tree.");
        }

    }

    private static <K extends Comparable<K>> int size(MyBinaryNode<K> root) {
        if (root == null) {
            return 0;
        }
        return 1 + size(root.left) + size(root.right);
    }


    private static <K extends Comparable<K>> boolean search(MyBinaryNode<K> root, K key) {
        if (root == null) {
            return false;
        }

        if (key.compareTo(root.key) == 0) {
            return true;
        } else if (key.compareTo(root.key) < 0) {
            return search(root.left, key);
        } else {
            return search(root.right, key);
        }
    }






}
