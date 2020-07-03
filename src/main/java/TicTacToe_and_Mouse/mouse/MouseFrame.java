package TicTacToe_and_Mouse.mouse;
import javax.swing.*;
/**
 * Ramka zawierająca okienko do testowania myszy
 */
public class MouseFrame extends JFrame
{
    public MouseFrame()
    {
        add(new MouseComponent());
        pack();
    }

    public static void main(String[] args)
    {
        JFrame window = new MouseFrame();
        window.setTitle("Square fun?");
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setBounds(300,200,300,300);
        window.setVisible(true);
    }
}