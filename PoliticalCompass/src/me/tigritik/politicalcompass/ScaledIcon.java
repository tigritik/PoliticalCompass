package me.tigritik.politicalcompass;

import me.tigritik.politicalcompass.images.ImageLoader;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class ScaledIcon implements Icon {

    private final Image img;
    private final int width;
    private final int height;

    public ScaledIcon(String imgName) {
        this(imgName, 50, 50);
    }

    public ScaledIcon(String imgName, int width, int height) {
        img = ImageLoader.loadImage(imgName);
        this.width = width;
        this.height = height;
    }

    @Override
    public void paintIcon(Component c, Graphics g, int x, int y) {
        g.drawImage(img, 0, 0, width, height, null);
    }

    @Override
    public int getIconWidth() {
        return width;
    }

    @Override
    public int getIconHeight() {
        return height;
    }
}
