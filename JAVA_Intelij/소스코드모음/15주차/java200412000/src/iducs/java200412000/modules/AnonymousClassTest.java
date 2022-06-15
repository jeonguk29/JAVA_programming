package iducs.java200412000.modules;

import java.awt.event.*;
import javax.swing.*;

public class AnonymousClassTest extends JFrame
{
    private int X=0;
    private int Y=0;
    static JLabel jlbl = new JLabel("coordinate : ");
    public AnonymousClassTest () {
        setBounds(60, 60, 400, 400);
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);    //An Exit Listener
            }
        });
        //Print (X,Y) coordinates on Mouse Click
        addMouseListener(new MouseAdapter() { //
            public void mousePressed(MouseEvent e) {
                X = e.getX();
                Y = e.getY();
                AnonymousClassTest.jlbl.setText("coordinate : " + "[" + X + "," + Y + "]");
            }
        });
        add(jlbl);
        setVisible(true);
    }
    public static void main(String[] args){
        new AnonymousClassTest ();
    }
}
