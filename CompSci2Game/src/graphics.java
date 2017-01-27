package game;

import java.awt.FlowLayout;
import javax.swing.*;

public class graphics extends JFrame {



    private JLabel item1;
    private JLabel imageJLabel;


    public graphics(){
        super("KEEEP THE BALLOON UUPPPPP");
        setLayout(new FlowLayout());

        item1 = new JLabel("DONT LET THE BALOON FALL!");
        item1.setToolTipText("this is a major teest");
        add(item1);

        ImageIcon image = new ImageIcon("C:\\Users\\227385\\Pictures\\whyzay\\dogekappa10.png");
        JLabel imageLabel = new JLabel(image);
        imageLabel.setBounds(100,100,32,32);
        imageLabel.setVisible(true);


        add(imageLabel);


    }


}