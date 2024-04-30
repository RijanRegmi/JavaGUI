import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.Border;
import javax.swing.BorderFactory;
import java.awt.Color;
import java.awt.Font;

// import GUI;
public class Labels extends JFrame {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setSize(500, 550);
        frame.setTitle("FristGUI");
        frame.setResizable(true);

        ImageIcon img = new ImageIcon("img/RJNnobg.png");
        frame.setIconImage(img.getImage());
        frame.getContentPane().setBackground(new Color(225, 225, 225));
        Border border = BorderFactory.createLineBorder(Color.green, 3);

        JLabel label = new JLabel();
        label.setText("Rijan Regmi");
        label.setIcon(img);
        label.setHorizontalTextPosition(JLabel.CENTER); // set text left center or right of image icon
        label.setVerticalTextPosition(JLabel.TOP); // set text top center of Bottom of image icone
        label.setForeground(Color.green); // sent font color of text
        label.setFont(new Font("MV Boli", Font.PLAIN, 20)); // sent font of text
        label.setIconTextGap(20); // set gap of text to image
        label.setBackground(Color.black); // set background color
        label.setOpaque(true); // display background color
        label.setBorder(border);
        label.setVerticalAlignment(JLabel.CENTER); // set vertical position of icon+text with label
        label.setHorizontalAlignment(JLabel.CENTER); // set horizontal position of icon+text with label
        // label.setBounds(20, 20, 500, 500); //set x,y position within frame as well as
        // dimensions

        frame.add(label);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // frame.setLayout(null);
        frame.pack();
        frame.setVisible(true);
    }

}
