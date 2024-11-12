/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package binarysearchtreeproject;

/**
 *
 * @author FATMA
 */
public class Node<T> {

    
    String word;
    int count;
    Node left, right;
  

    Node(String word) {
    
        this.word = word;
        this.count = 1;
        left = right = null;
    }

 

}
