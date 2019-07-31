package nl.spijkerman.paynpils.client.view;

import javax.swing.*;

public class MenuBar extends JMenuBar {

    public MenuBar(Frame frame) {
        frame.setJMenuBar(this);
        Menu menu = new Menu(this, "Pay'n'pils");
        this.add(menu);
    }


}
