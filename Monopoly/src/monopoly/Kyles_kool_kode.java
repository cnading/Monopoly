package monopoly;

import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JPanel;

public class Kyles_kool_kode
	{
		private JFrame frame = new JFrame();
	    private JLayeredPane lpane = new JLayeredPane();
	    private JPanel panelBlue = new JPanel();
	    private JPanel panelGreen = new JPanel();
		public void runKylesKoolKode() {
			
			frame.setPreferredSize(new Dimension(600, 400));
	        frame.setLayout(new BorderLayout());
	        frame.add(lpane, BorderLayout.CENTER);
	        lpane.setBounds(0, 0, 600, 400);
	        panelBlue.setBackground(Color.BLUE);
	        panelBlue.setBounds(0, 0, 600, 400);
	        panelBlue.setOpaque(true);
	        panelGreen.setBackground(Color.GREEN);
	        panelGreen.setBounds(200, 100, 100, 100);
	        panelGreen.setOpaque(true);
	        lpane.add(panelBlue, new Integer(0), 0);
	        lpane.add(panelGreen, new Integer(1), 0);
	        frame.pack();
	        frame.setVisible(true);
		}
		
		
		
		
		
		
		
		
		
	}
