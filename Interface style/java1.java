import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class java1 extends JFrame
{
    Container c = getContentPane();

    JPanel pan = new JPanel();

    JButton jButton1 = new JButton("Accept");

    JRadioButton metal = new JRadioButton("Metal");
    JRadioButton motif = new JRadioButton("CDE/Motif");
    JRadioButton windows = new JRadioButton("Windows");

    ButtonGroup javaLF = new ButtonGroup();

    public java1(){super("Interface styles");}

    public static void main(String[]args)
    {
        final java1 myWindow = new java1();

        myWindow.setBounds(100, 200, 250, 100);

        myWindow.javaLF.add(myWindow.metal);
        myWindow.javaLF.add(myWindow.motif);
        myWindow.javaLF.add(myWindow.windows);

        myWindow.pan.add(myWindow.metal);
        myWindow.pan.add(myWindow.motif);
        myWindow.pan.add(myWindow.windows);
        myWindow.pan.add(myWindow.jButton1);

        myWindow.c.add(myWindow.pan);
        
        myWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        myWindow.setVisible(true);

        final ActionListener customEscape = new ActionListener()
        {
            public void actionPerformed(ActionEvent actionEvent)
            {
                String jlfclass = null;

                if(myWindow.javaLF.isSelected(myWindow.metal.getModel()))
                {jlfclass = "javax.swing.plaf.metal.MetalLookAndFeel";}
                else if(myWindow.javaLF.isSelected(myWindow.motif.getModel()))
                {jlfclass = "javax.swing.plaf.motif.MotifLookAndFeel";}
                else if(myWindow.javaLF.isSelected(myWindow.windows.getModel()))
                {jlfclass = "javax.swing.plaf.windows.WindowsLookAndFeel";}

                try
                {
                    UIManager.setLookAndFeel(jlfclass);

                    myWindow.jButton1.updateUI();
                    myWindow.metal.updateUI();
                    myWindow.motif.updateUI();
                    myWindow.windows.updateUI();
                    myWindow.pan.updateUI();
                }
                catch(Exception e){System.out.println("Set style error");}
            }
        };
        myWindow.jButton1.addActionListener(customEscape);
    }
}