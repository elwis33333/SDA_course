package SomeOfMyTests;

import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;
import javax.swing.Timer;
// Powyższy import ma na celu zapobiec konfliktowi z klasą java.util.Timer.
public class Costam
{
    public static void main(String[] args)
    {
        ActionListener listener = new TimePrinter();
// Konstrukcja zegara wywołującego obiekt nasłuchujący
// co dziesięć sekund.
        Timer t = new Timer(5000, listener);
        t.start();
        JOptionPane.showMessageDialog(null, "Zamknąć program?");
        System.exit(0);
    }
}
class TimePrinter implements ActionListener
{
    public void actionPerformed(ActionEvent event)
    {
        Date now = new Date();
        System.out.println("Kiedy usłyszysz dźwięk, będzie godzina " + now);
        Toolkit.getDefaultToolkit().beep();
    }
}