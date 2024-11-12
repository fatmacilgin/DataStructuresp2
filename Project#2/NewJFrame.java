/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package binarysearchtreeproject;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.JFileChooser;

/**
 *
 * @author FATMA
 */
public class NewJFrame extends javax.swing.JFrame {
  private BinarySearchTree bst;
    final IgnoreWordsHandler ignoreHandler;

    public NewJFrame() {
        initComponents();
        setTitle("Mini Desktop Search Engine");
        bst = new BinarySearchTree();
        ignoreHandler = new IgnoreWordsHandler();
        FileChooser.setMultiSelectionEnabled(true);
        btn_search.setEnabled(false);
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btn_search = new javax.swing.JButton();
        cmbx = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        txt_search = new javax.swing.JTextArea();
        FileChooser = new javax.swing.JFileChooser();
        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 32767));
        jScrollPane2 = new javax.swing.JScrollPane();
        txt_sonuc = new javax.swing.JTextArea();
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txt_ignore = new javax.swing.JTextField();
        btn_add = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btn_search.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        btn_search.setText("SEARCH");
        btn_search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_searchActionPerformed(evt);
            }
        });

        cmbx.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        cmbx.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "PreOrder", "PostOrder", "InOrder" }));

        txt_search.setEditable(false);
        txt_search.setColumns(20);
        txt_search.setRows(5);
        jScrollPane1.setViewportView(txt_search);

        FileChooser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FileChooserActionPerformed(evt);
            }
        });

        txt_sonuc.setEditable(false);
        txt_sonuc.setColumns(20);
        txt_sonuc.setRows(5);
        jScrollPane2.setViewportView(txt_sonuc);

        jButton1.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        jButton1.setText("SEARCH");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jTextArea1.setEditable(false);
        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane3.setViewportView(jTextArea1);

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        jLabel1.setText("enter the word you want to search:");

        jLabel2.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        jLabel2.setText("Content of the input file:");

        jLabel3.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        jLabel3.setText("Binary Search Tree:");

        btn_add.setText("ADD");
        btn_add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_addActionPerformed(evt);
            }
        });

        jLabel4.setText("İgnore edilicek kelime");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(FileChooser, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txt_ignore, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn_add, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(cmbx, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(117, 117, 117))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btn_search, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 263, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(filler1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane2)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton1))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 324, Short.MAX_VALUE))
                            .addComponent(jScrollPane1)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(FileChooser, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_ignore, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_add))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_search)
                    .addComponent(cmbx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addComponent(filler1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_searchActionPerformed
        // TODO add your handling code here:
     // TODO add your handling code here:
        bst.clear();
        //String desktopPath = "C:\\Users\\Ebrar Yıldız\\OneDrive\\Masaüstü\\docm";
        JFileChooser fileChooser = new JFileChooser();
        int returnValue = fileChooser.showOpenDialog(null);
        File file = new File(fileChooser.getSelectedFile().getPath());
        IgnoreWordsHandler<String> ignoreHandler = new IgnoreWordsHandler<>();
        MyLinkedList<String> ignoreWords = IgnoreWordsHandler.readLinesFromFile(file);
        ignoreHandler.addToIgnoreList(ignoreWords);
        String selectedTraversal = cmbx.getSelectedItem().toString();
        String content = txt_search.getText(); // Sadece harfleri ve boşlukları al
        String[] words = content.split("\\s+"); // Boşluklara göre ayır
        for (String word : words) {
            word = word.toLowerCase(); // Sadece harfleri al
            if (!ignoreHandler.contains(word) && !word.contains("<") && !word.contains(".") && !word.contains(",")) {
                bst.addWord(word);
            }
        }

    switch (selectedTraversal) {
        case "PreOrder":
            String preorderResult = bst.preorderTraversal();
            txt_sonuc.setText("PreOrder traversel:\n" + preorderResult);
            break;
        case "PostOrder":
            String postOrder = bst.postorderTraversal();
            txt_sonuc.setText("PostOrder traversel:\n" + postOrder);
            break;
        case "InOrder":
            String inOrder = bst.inorderTraversal();
            txt_sonuc.setText("InOrder traversel:\n" + inOrder);
            break;
        default:
            System.out.println("Invalid traversal type");
            break;
    }

    }//GEN-LAST:event_btn_searchActionPerformed

    private void FileChooserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FileChooserActionPerformed
        // TODO add your handling code here:
        // TODO add your handling code here:
        if (evt.getActionCommand().equals(JFileChooser.APPROVE_SELECTION)) {
            File[] selectedFiles = FileChooser.getSelectedFiles(); // Birden fazla dosyayı seçmek için getSelectedFiles kullandık
            StringBuilder allText = new StringBuilder(); // Tüm dosyaların içeriğini birleştirmek için StringBuilder oluşturduk
            for (File selectedFile : selectedFiles) {
                try {
                    BufferedReader reader = new BufferedReader(new FileReader(selectedFile));
                    StringBuilder text = new StringBuilder();
                    String line;
                    while ((line = reader.readLine()) != null) {
                        allText.append(line).append("\n");
                    }
                    reader.close();
                    txt_search.setText(text.toString()); // Dosya içeriğini metin alanına yapıştırma               
                } catch (IOException ex) {

                }
            }
            // Tüm dosyaların içeriğini birleştirerek metin alanını güncelledik
            txt_search.setText(allText.toString());
        }
        btn_search.setEnabled(true);


    }//GEN-LAST:event_FileChooserActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    String wordToSearch = jTextField1.getText(); // Get the word from the JTextField
    if (!wordToSearch.isEmpty()) { // Proceed if the entered word is not empty
        StringBuilder result = new StringBuilder(); // StringBuilder to store the search results
        File[] selectedFiles = FileChooser.getSelectedFiles(); // Get the selected files from the FileChooser
        for (File file : selectedFiles) { // Iterate over the selected files
            if (file.isFile() && file.getName().endsWith(".html")) { // Proceed if the file is a HTML file
                try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
                    String line;
                    bst = new BinarySearchTree(); // Create a new Binary Search Tree for each file
                    while ((line = reader.readLine()) != null) {
                        String[] words = line.split("\\s+"); // Split the line into words
                        for (String word : words) {
                            word = word.toLowerCase(); // Convert the word to lowercase
                            if (word.equals(wordToSearch)) {
                                bst.addWord(word); // Add the word to the Binary Search Tree
                            }
                        }
                    }
                    int occurrencesInFile = bst.search(wordToSearch); // Search for occurrences of the word
                    result.append("File: ").append(file.getName())
                            .append(", Occurrences: ").append(occurrencesInFile).append("\n"); // Append the result
                } catch (IOException ex) {
                    ex.printStackTrace(); // Handle IOException
                }
            }
        }
        jTextArea1.setText("THE WORD : " + wordToSearch + "\n" + result.toString()); // Display the search results in the JTextArea
    }

    }//GEN-LAST:event_jButton1ActionPerformed

    private void btn_addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_addActionPerformed
        // TODO add your handling code here:
        String wordToAdd = txt_ignore.getText().trim();

        if (!wordToAdd.isEmpty()) {
            // ignoreHandler.addIgnoreWord(wordToAdd);
            txt_ignore.setText(""); // temizle

        }
/*jButton1ActionPerformed(evt):
This method is called when the "SEARCH" button is clicked.
It counts how many times the word specified by the user appears in which HTML file in the binary search tree.
Writes the found results to the JTextArea component named jTextArea1.*/
    }//GEN-LAST:event_btn_addActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JFileChooser FileChooser;
    private javax.swing.JButton btn_add;
    private javax.swing.JButton btn_search;
    private javax.swing.JComboBox<String> cmbx;
    private javax.swing.Box.Filler filler1;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField txt_ignore;
    private javax.swing.JTextArea txt_search;
    private javax.swing.JTextArea txt_sonuc;
    // End of variables declaration//GEN-END:variables

}
