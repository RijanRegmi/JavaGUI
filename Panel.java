import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Panel {
    public static void main(String[] args) {

        JFrame frame = new JFrame();
        frame.setSize(500, 530);
        frame.setTitle("FristGUI");
        frame.setResizable(false);

        ImageIcon img = new ImageIcon("img/RJNnobg.png");
        frame.setIconImage(img.getImage());

        JLabel label = new JLabel();
        label.setText("Hello");

        JPanel redpanel = new JPanel();
        redpanel.setBackground(Color.red);
        redpanel.setBounds(0, 0, 250, 250);

        JPanel greenpanel = new JPanel();
        greenpanel.setBackground(Color.green);
        greenpanel.setBounds(250, 0, 250, 250);

        JPanel bluepanel = new JPanel();
        bluepanel.setBackground(Color.blue);
        bluepanel.setBounds(0, 250, 250, 250);

        JPanel yellowpanel = new JPanel();
        yellowpanel.setBackground(Color.yellow);
        yellowpanel.setBounds(250, 250, 250, 250);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.add(redpanel);
        frame.add(greenpanel);
        frame.add(bluepanel);
        frame.add(yellowpanel);

    }
}
