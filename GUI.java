import javax.swing.ImageIcon;
import javax.swing.JFrame;
import java.awt.Color;

public class GUI extends JFrame {
    public static void main(String[] args) {

        JFrame frame = new JFrame(); // create a frame
        frame.setSize(420, 420); // this sets the x-dimension, and y-dimension
        frame.setTitle("FristGUI");
        frame.setResizable(false); // prevent frame from being resized

        ImageIcon img = new ImageIcon("img/RJNnobg.png"); // create an Image Icon
        frame.setIconImage(img.getImage()); // change icone of frame
        frame.getContentPane().setBackground(new Color(225, 225, 225)); // change color of back ground

        /*
         * frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE); // Do nothing if
         * you try to close
         */
        /*
         * frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE); // Only hides window
         * its is defult
         */
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // exit out of application
        frame.setVisible(true); // make frame visible

        // For Copy Paste

        /*
         * JFrame frame = new JFrame();
         * frame.setSize(420, 420);
         * frame.setTitle("FristGUI");
         * frame.setResizable(false);
         * 
         * ImageIcon img = new ImageIcon("img/RJNnobg.png");
         * frame.setIconImage(img.getImage());
         * 
         * 
         * frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         * frame.setVisible(true);
         */

    }

}