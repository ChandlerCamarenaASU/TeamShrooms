
import javax.swing.JPanel;

import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.*;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
//import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import java.io.FileInputStream; 
import java.io.FileNotFoundException; 

public class HomePanel extends JPanel {
    private JButton OrderButton;
    private JLabel title, pic, logo_name;
    private JTextArea PizzaArea;
    private ImageIcon logo;
    private JPanel panel;

    public HomePanel(JFrame frame) {
    	
    	panel = new JPanel();
    	panel.setPreferredSize(new Dimension(1080, 720));
    	// bg color
    	float hue = 7;
    	float saturation = (float) 0.48;
    	float balance = (float) 0.57;

    	panel.setBackground(Color.getHSBColor(hue, saturation, balance));

    	// title text
    	title = new JLabel("SUNDEVIL Pizza          ");
    	title.setFont(new Font("Impact", Font.PLAIN, 40));
    	
    	// button
    	OrderButton = new JButton(" Make an order! ");
    	OrderButton.setPreferredSize(new Dimension(300, 100));
    	OrderButton.setFont(new Font("Arial", Font.PLAIN, 30));
    	OrderButton.addActionListener(new ButtonListener(frame));
		OrderButton.setLocation(500, 250);
    	title = new JLabel("Welcome to the Pizza Ordering Application :D");
		title.setFont(new Font("Arial", Font.PLAIN, 30));
    	title.setLocation(500, 100);
    	
    	// logo
    	logo = new ImageIcon("res/ASUlogo.png");
    	logo_name = new JLabel( logo , 0);
    	
    	//frame.add(logo_name);
    	panel.add(title);
    	panel.add(OrderButton);
        add(panel);
        
    }

    public class ButtonListener implements ActionListener {
    	private JFrame frame;
    	public ButtonListener(JFrame frame) {
    		this.frame = frame;
    	}

        @Override
        public void actionPerformed(ActionEvent event) {
        	// removing the elements
            remove(logo_name);
        	remove(OrderButton);
        	remove(title);

        	remove(logo_name);

        	remove(panel);

        	// transition to order screen
        	MainGui.showOrderPanel(frame);

        }
    }

}
