import java.awt.*;
import java.awt.event.*;
import java.util.prefs.BackingStoreException;

import javax.swing.event.MouseInputAdapter;
import javax.swing.plaf.DimensionUIResource;
import java.applet.*;

public class java111 extends Frame
{
    String keymsg = "This is test";
    String mousemsg = "";

    int mouseX = 30, mouseY = 30;
 
    public java111()
    {
        addKeyListener(new MyKeyAdapter(this));
        addMouseListener(new MyMouseAdapter(this));
        addWindowListener(new MyWindowAdapter(this));
    }

    public void paint(Graphics g)
    {
        g.drawString(keymsg,10, 40);
        g.drawString(mousemsg, mouseX, mouseY);
    }

    public static void main(String[]args)
    {
        java111 appwin = new java111();
        appwin.setSize(new Dimension(300, 200));
        appwin.setTitle("An AWT-Based Application");
        appwin.setVisible(true);
    }
}

class MyKeyAdapter extends KeyAdapter
{
    java111 appJava111;
    public MyKeyAdapter(java111 appjJava111){this.appJava111 = appjJava111;}
    public void keyTyped(KeyEvent ke)
    {
        appJava111.keymsg += ke.getKeyChar();
        appJava111.repaint();
    }
}

class MyMouseAdapter extends MouseInputAdapter
{
    java111 appJava111;
    public MyMouseAdapter(java111 appJava111){this.appJava111 = appJava111;}
    public void mousePressed(MouseEvent me)
    {
        appJava111.mouseX = me.getX();
        appJava111.mouseY = me.getY();
        appJava111.mousemsg = "Клавиша мыши нажата в" + appJava111.mouseX + ", " + appJava111.mouseY;
        appJava111.repaint();
    }
}

class MyWindowAdapter extends WindowAdapter 
{
    java111 appJava111;
    public MyWindowAdapter(java111 appJava111){this.appJava111 = appJava111;}
    public void windowClosing(WindowEvent we){System.exit(0);}
}