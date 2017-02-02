package game;

import java.awt.FlowLayout;
import javax.swing.*;

public class graphics extends JFrame {

	private JLabel window;
    public graphics(){
        super("Keep the Balloon Up! :D");
        setLayout(new FlowLayout());
    
        window = new JLabel("DONT LET THE BALLOON FALL!");
        window.setToolTipText("this is a major teest");
        ImageIcon winIcon = new ImageIcon("C:\\Users\\227385\\Pictures\\whyzay\\dogekappa10.png");
        this.setIconImage(winIcon.getImage());
        add(window); 
       
        //window.setText("Keep the Balloon Up!");
        	
        ImageIcon wallpaper = new ImageIcon("C:\\Users\\227385\\Pictures\\charcoal.png");
        JLabel imageLabel = new JLabel(wallpaper);
        imageLabel.setBounds(100,100,32,32);
        imageLabel.setVisible(true);
        
        ImageIcon balloon = new ImageIcon("C:\\Users\\227385\\Pictures\\whyzay\\dogekappa10.png");
        JLabel imageLabel1 = new JLabel(balloon);
        imageLabel1.setBounds(100,100,32,32);
        imageLabel1.setVisible(true);


        add(imageLabel1);
        add(imageLabel);


    }


}