package ihm;

import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.WindowConstants;

public class Main {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Swing Starter Kit");
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        // create a panel
        JPanel panel = new JPanel();
        panel.setPreferredSize(new Dimension(300, 300));

        // add the panel to the frame
        frame.add(panel);

        RangeSlider slider = new RangeSlider(SwingConstants.HORIZONTAL, 0, 100, 25, 75);

        // add the label to the panel
        panel.add(slider);

        // show the window.
        frame.pack();
        frame.setVisible(true);
    }

}
