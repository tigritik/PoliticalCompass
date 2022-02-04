package me.tigritik.politicalcompass;

import me.tigritik.politicalcompass.images.ImageLoader;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;

public class BasedFrame extends JFrame {

    private final JTabbedPane sections = new JTabbedPane();

    private final JPanel preview = new JPanel();

    private final JPanel authleft = new JPanel();
    private final JTextArea alText = new JTextArea("add text", 50, 20);

    private final JPanel authright = new JPanel();

    private final JPanel libleft = new JPanel();

    private final JPanel libright = new JPanel();

    private final BufferedImage img = (BufferedImage) ImageLoader.loadImage("scaled.png");
    private final Graphics2D g = (Graphics2D) img.getGraphics();


    public BasedFrame(Image icon) {
        super("Political Compass");
        setIconImage(icon);
        preview.add(new JLabel(new ImageIcon(img)));
        sections.addTab("Preview", new ScaledIcon("compass.png", 25, 25), preview);
        alText.addKeyListener(new TextBoxListener(g, 100, 100));
        authleft.add(alText);
        sections.addTab("Auth-Left", authleft);
        sections.addTab("Auth-Right", authright);
        sections.addTab("Lib-Left", libleft);
        sections.addTab("Lib-Right", libright);

        g.setColor(Color.BLACK);
        g.fillRect(200, 200, 100, 100);
        g.drawImage(img, 250, 250, 100, 100, null);
        g.drawString("Test", 100, 100);

        Timer timer = new Timer(30, e -> repaint());
        timer.start();

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new Dimension(600, 400));
        add(sections);
        setVisible(true);
        requestFocus();
    }

    @Override
    public void paint(Graphics G) {
        super.paint(G);
    }
}
