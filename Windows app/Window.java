import java.awt.*;
import java.awt.event.*;

public class Window
{
    public static void main(String[]args)
    {
        WindowState frame = new WindowState();

        int left = 100;
        int top = 100;
        int width = 300;
        int height = 200;

        Rectangle bounds = new Rectangle(left, top, width, height);
        frame.setBounds(bounds);
        frame.setVisible(true);
        frame.deiconify();

        frame.addWindowListener
        (
            new WindowAdapter()
            {
                public void windowClosing(WindowEvent evt)
                {
                    Frame frame2 = (Frame)evt.getSource();
                    frame2.setVisible(false);
                    frame2.dispose();
                }
            }
        );
    }
}