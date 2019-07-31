package nl.spijkerman.paynpils.client.view;

import javax.swing.*;
import java.awt.*;

public class Frame extends JFrame {

    public Frame() {
        super();
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        int x = dim.width;
        int y = dim.height;
        this.setSize(x, y);
        this.setVisible(true);

        setJMenuBar(new MenuBar(this));
        validate();
        repaint();

    }
}
