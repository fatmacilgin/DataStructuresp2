/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package binarysearchtreeproject;

public class BinarySearchTree {

    private Node root;

    private Node addNode(Node node, String word) {
        if (node == null) {
            return new Node(word);
        }

        int compare = word.compareTo(node.word);
        if (compare < 0) {
            node.left = addNode(node.left, word);
        } else if (compare > 0) {
            node.right = addNode(node.right, word);
        } else {
            node.count++;
        }

        return node;
    }

    public void addWord(String word) {
        root = addNode(root, word);
    }

    // Kelime arama işlevi
    public int searchNode(Node node, String word) {
        if (node == null) {
            return 0;
        }

        int compare = word.compareTo(node.word);
        if (compare < 0) {
            return searchNode(node.left, word);
        } else if (compare > 0) {
            return searchNode(node.right, word);
        } else {
            return node.count;
        }
    }

    public int search(String word) {
        return searchNode(root, word);
    }

    public void clear() {
        root = null;
    }

    // In-order traversal
    public String inorderTraversal(Node node) {
        StringBuilder result = new StringBuilder(); // Dizini toplamak için bir StringBuilder kullanılır

        if (node != null) {
            // Sol alt ağacı inorderTraversal çağır ve sonucu dizeye ekle
            result.append(inorderTraversal(node.left));
            // Düğümün kelime ve sayısını dizeye ekle
            result.append(node.word)
                  .append(",").append(node.count).append("\n");
            // Sağ alt ağacı inorderTraversal çağır ve sonucu dizeye ekle
            result.append(inorderTraversal(node.right));
        }

        return result.toString(); // Oluşturulan dizeyi döndür
    }

    public String inorderTraversal() {
        return inorderTraversal(root);
    }

    
    
    
    
    
    
    
    
    // Pre-order traversal
    public String preorderTraversal(Node node) {
        StringBuilder result = new StringBuilder(); // Dizini toplamak için bir StringBuilder kullanılır

        if (node != null) {
            // Düğümün kelime ve sayısını dizeye ekle
            result.append(node.word)
                  .append(",").append(node.count).append("\n");
            // Sol alt ağacı preorderTraversal çağır ve sonucu dizeye ekle
            result.append(preorderTraversal(node.left));
            // Sağ alt ağacı preorderTraversal çağır ve sonucu dizeye ekle
            result.append(preorderTraversal(node.right));
        }

        return result.toString(); // Oluşturulan dizeyi döndür
    }

    public String preorderTraversal() {
        return preorderTraversal(root); // Kök düğümle başlayarak preorderTraversal çağır
    }

    
    
    
    
    // Post-order traversal
    public String postorderTraversal(Node node) {
        StringBuilder result = new StringBuilder(); 
    // Dizini toplamak için bir StringBuilder kullanılır

        if (node != null) {
            // Sol alt ağacı postorderTraversal çağır ve sonucu dizeye ekle
            result.append(postorderTraversal(node.left));
            // Sağ alt ağacı postorderTraversal çağır ve sonucu dizeye ekle
            result.append(postorderTraversal(node.right));
            // Düğümün kelime ve sayısını dizeye ekle
            result.append(node.word).
                   append(",").append(node.count).append("\n");
        }

        return result.toString(); // Oluşturulan dizeyi döndür
    }

    public String postorderTraversal() {
        return postorderTraversal(root);
    }

}