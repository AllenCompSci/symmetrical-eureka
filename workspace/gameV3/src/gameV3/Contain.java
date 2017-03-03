package gameV3;

/**
 * Created by 226784/Ammar on 1/25/2017.
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.geom.Ellipse2D;

import javax.swing.*;

public class Contain {

    public static void main(String [] args){


    /*  Move s = new Move();
       JFrame f = new JFrame();
       f.add(s);
       f.setVisible(true);
       f.setSize(600,400);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setTitle("fdsafgdsaf");
           */

              /*  Move s = new Move();
                s.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                s.setVisible(true);
                s.setSize(500,500);
                s.pack();
*/
    		



        JFrame frame = new JFrame();
       
        ImageIcon image = new ImageIcon("C:\\Users\\227385\\Pictures\\charcoal.fw.png");
        JLabel imageLabel = new JLabel(image); 
        add(imageLabel);


        Move kk = new Move();
        frame.getContentPane().add(kk);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1920, 1080);
        frame.setVisible(true);
        
        






      /*  graphics lol = new graphics();
        lol.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        lol.setSize(1000,750);
        lol.setLocationRelativeTo(null);
        lol.setVisible(true);
*/

        //Main.screen lol = new Main.screen();
       // lol.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);*/
    }

	private static void add(JLabel imageLabel) {
		// TODO Auto-generated method stub
		
	}
}