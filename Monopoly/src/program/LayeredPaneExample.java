package program;
import javax.swing.*;

import objects.Piece;

import java.awt.*;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;  
public class LayeredPaneExample extends JFrame {  
  public LayeredPaneExample() {  
    super("Monopoly");  
    setSize(800, 820);  
    JLayeredPane pane = getLayeredPane();  
    ImageIcon image = new ImageIcon("Monopoly_Board_Image.jpg");
    JLabel imageLabel = new JLabel(image); 
    imageLabel.setBounds(0, 0, 800, 800);    
    Piece p1 = new Piece(1, 0, 0);
    Piece p2 = new Piece(2, 50, 50);
    pane.add(imageLabel, new Integer(0));
    pane.add(p1.getImageLabel(), new Integer(1));
    pane.setVisible(true);
pane.add(p2.getImageLabel(), new Integer(1));
pane.setVisible(true);

  }  
 
}  