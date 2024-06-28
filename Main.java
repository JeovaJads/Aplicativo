package jogo;

import javax.swing.*;
import java.io.*;
import javax.sound.sampled.*;

public class Main extends JFrame {


    public Main() {
        JFrame frame = new JFrame();
        frame.add(new MyPanel());
        frame.setTitle("Java Fighter");
        frame.setSize(800, 635);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
        frame.setResizable(false); 

    }

    public static void main(String[] args) throws UnsupportedAudioFileException, IOException, LineUnavailableException {
        new Main();;
         
    }
}