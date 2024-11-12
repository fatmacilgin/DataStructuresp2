package binarysearchtreeproject;

import binarysearchtreeproject.MyLinkedList.LLNode;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class IgnoreWordsHandler<T> {

    public MyLinkedList<T> ignoreList;
    public LLNode<T> head;

    public IgnoreWordsHandler() {
        ignoreList = new MyLinkedList<T>();
    }
public static MyLinkedList<String> readLinesFromFile(File file) {
    MyLinkedList<String> lines = new MyLinkedList<>();

    try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
        String line;
        while ((line = reader.readLine()) != null) {
            lines.add(line);
        }
    } catch (IOException e) {
        e.printStackTrace();
    }

    return lines;
}

    public boolean contains(T word) {
        LLNode<T> current = ignoreList.head;
        while (current != null) {
            if (current.data.equals(word)) {
                return true; // Kelimeyi bulduk, true döndür
            }
            current = current.next;
        }
        return false; // Kelimeyi bulamadık, false döndür
    }

 public void addToIgnoreList(MyLinkedList<String> words) {
    LLNode<String> current = words.head;
    while (current != null) {
        ignoreList.add((T) current.data);
        current = current.next;
    }
}

}
