package me.tigritik.politicalcompass;

import me.tigritik.politicalcompass.images.ImageLoader;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        JFrame frame = new BasedFrame(ImageLoader.loadImage("compass.png"));
    }
}
