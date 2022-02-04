package me.tigritik.politicalcompass;

import javafx.scene.input.KeyCode;

import javax.swing.text.JTextComponent;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class TextBoxListener implements KeyListener {

    private final Graphics g;
    private final int x;
    private final int y;

    public TextBoxListener(Graphics g, int x, int y) {
        this.g = g;
        this.x = x;
        this.y = y;
    }

    @Override
    public void keyTyped(KeyEvent e) {
        int i = 0;
        for (String s : ((JTextComponent) e.getComponent()).getText().split("\n")) {
            g.drawString(s, x, y+20*i);
            i++;
        }
    }

    @Override
    public void keyPressed(KeyEvent e) {

    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}
