import javax.swing.*;
import java.awt.*;

public class CustomPanel extends JPanel {

  private Bst tree;

    public CustomPanel(Bst tree) {
    this.tree=tree;

    //  setBackground(new Color(0, 0, 0, 0));
    }

  @Override
  protected void paintComponent(Graphics g) {
    super.paintComponent(g);

    drawTree(g,tree.getRoot(),getWidth()/2,50,getWidth()/8);
  }



  private void drawTree(Graphics g,Node node , int x , int y,int gap ){
    // logic to draw the tree
    if (node == null) {
      return;
    }

    g.setColor(Color.BLACK);
    g.fillOval(x - 15, y-15, 30, 30);
    g.setColor(Color.GREEN);
    g.drawString(String.valueOf(node.getData()), x - 5, y + 5);
    g.setColor(Color.red);


    if (node.getLeft() != null) {
      g.drawLine(x, y, x - gap, y + 50);
      drawTree(g, node.getLeft(), x - gap, y + 50, gap / 2);
    }


    if (node.getRight() != null) {
      g.drawLine(x, y, x + gap, y + 50);
      drawTree(g, node.getRight(), x + gap, y + 50, gap / 2);
    }



  }
}
