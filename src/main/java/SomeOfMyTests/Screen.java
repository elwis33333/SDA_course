package SomeOfMyTests;

import javax.swing.*;
import java.awt.*;

public class Screen {

    public static void main(String[] args)
    {
        EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {
                JFrame frame = new SizedFrame();
                frame.setTitle("SizedFrame");
                frame.setExtendedState(Frame.MAXIMIZED_BOTH);
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setVisible(true);
                frame.setResizable(false); // nie można zmieniać romiaru ramki

            }
        });
    }
}
class SizedFrame extends JFrame
{
    public SizedFrame()
    {
// Sprawdzenie wymiarów ekranu.
        Toolkit kit = Toolkit.getDefaultToolkit();
        Dimension screenSize = kit.getScreenSize();
        int screenHeight = screenSize.height;
        int screenWidth = screenSize.width;
// Ustawienie szerokości i wysokości ramki oraz polecenie systemowi, aby ustalił jej położenie.
        setSize(screenWidth / 2, screenHeight / 2);
        setLocationByPlatform(true);
// Ustawienie ikony i tytułu.
        Image img = new ImageIcon("icon.gif").getImage();
        setIconImage(img);
    }
}