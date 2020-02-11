package monopoly;
import javax.swing.*;  
import java.awt.*;  
public class LayeredPaneExample extends JFrame {  
  public LayeredPaneExample() {  
    super("Monopoly");  
    setSize(800, 820);  
    JLayeredPane pane = getLayeredPane();  
    
    ImageIcon image = new ImageIcon("Monopoly_Board_Image.jpg");
    JLabel imageLabel = new JLabel(image); 
    imageLabel.setBounds(0, 0, 800, 800);
    
    Piece p1 = new Piece(1, 50, 50);
    
    pane.add(imageLabel, new Integer(0));
    pane.add(p1.getImageLabel(), new Integer(1));
    
  
    
   
  }  
 
}  