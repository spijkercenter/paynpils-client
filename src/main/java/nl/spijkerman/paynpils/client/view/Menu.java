package nl.spijkerman.paynpils.client.view;

import javax.swing.*;
import java.awt.*;

public class Menu extends JMenu {
    public Menu(MenuBar menuBar, String name) {
        super(name);
        menuBar.add(this);

        JMenuItem item = new JMenuItem("Close");
        item.addActionListener(e -> {
            Component parent;
            for (parent = this.getParent(); parent != null && !(parent instanceof Frame); parent = parent.getParent())
                ;
            if (parent instanceof Frame)
                ((Frame) parent).dispose();
        });

        this.add(item);
    }
}
