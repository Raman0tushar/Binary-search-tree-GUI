
import javax.swing.*;
import java.awt.*;

import static java.awt.Transparency.OPAQUE;

public class Main {
    public static void main(String[] args) {


        Bst tree =new Bst();


        tree.insert(2);
        tree.insert(7);
        tree.insert(5);
        tree.insert(4);
        tree.insert(6);
        tree.insert(3);



        JFrame frame = new JFrame("BINARY SEARCH TREE GUI");
       // frame.setUndecorated(true);             // Required for translucency
       // frame.setOpacity(0.85f);
                                  // No window borders
       // frame.setAlwaysOnTop(true);


        JPanel mainPanel = new CustomPanel(tree);
        mainPanel.setOpaque(false);



        //input box
        JTextField inputField = new JTextField(5);

        //input button
        JButton insertButton = new JButton("Insert");

        //delete button
        JButton deleteButton = new JButton("Delete");

        JPanel bottomPanel = new JPanel();
        bottomPanel.setOpaque(false);

        bottomPanel.add(new JLabel(("Enter Number :")));
        bottomPanel.add(inputField);
        bottomPanel.add(insertButton);
        bottomPanel.add(deleteButton);


        inputField.setOpaque(false);
        insertButton.setOpaque(false);
        deleteButton.setOpaque(false);


        insertButton.addActionListener(e -> {
            int value = Integer.parseInt(inputField.getText());
            tree.insert(value);
            mainPanel.repaint();
        });

        deleteButton.addActionListener(e -> {
            int value = Integer.parseInt(inputField.getText());
            tree.delete(value);
            mainPanel.repaint();
        });


        //main frame:

        frame.setLayout(new BorderLayout());
        frame.add(mainPanel, BorderLayout.CENTER);

        frame.add(bottomPanel, BorderLayout.SOUTH);
        frame.setSize(600, 800);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);



        frame.setVisible((true));
        frame.getContentPane().setBackground(Color.CYAN);


     /*(   System.out.println("Inorder traverse");
       tree.inOrder (tree.root);
        System.out.println("Preorder traverse ");
        tree.preOrder(tree.root);
        System.out.println("Postorder travese   ");
        tree.postOrder(tree.root);

        System.out.println("Delete Elememt");
        tree.delete(4);
        System.out.println("Inorder traverse");
        tree.inOrder (tree.root);

        System.out.println("Searched "+tree.search(8));
*/

    }
}