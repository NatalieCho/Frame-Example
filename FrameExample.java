/*
 * FrameExample.java
 */

import java.awt.*;
import java.awt.event.*;

public class FrameExample implements WindowListener, MouseListener{  //implements WindowListener, MouseMotionListener etc

    private Frame f;

    public FrameExample() {
        f = new Frame("MyFrame");
        f.setSize(600,300);
        f.addWindowListener(this); 
        f.addMouseListener(this);
        f.setVisible(true); 
    }

    /**
     * main
     */
    public static void main(String[] args) {
       FrameExample fe = new FrameExample();
    }

public void     windowActivated(WindowEvent e){
if (e.getID() == WindowEvent.WINDOW_ACTIVATED)
            System.out.println("Window activated");
}
          //Invoked when the Window is set to be the active Window.
public void     windowClosed(WindowEvent e){}
          //Invoked when a window has been closed as the result of calling dispose on the window.
public void     windowClosing(WindowEvent e){
        if (e.getID() == WindowEvent.WINDOW_CLOSING)
            System.exit(0);
}
         // Invoked when the user attempts to close the window from the window's system menu.
public void     windowDeactivated(WindowEvent e){
if (e.getID() == WindowEvent.WINDOW_DEACTIVATED)
            System.out.println("Window deactivated");
}
          //Invoked when a Window is no longer the active Window.
public void     windowDeiconified(WindowEvent e){}
          //Invoked when a window is changed from a minimized to a normal state.
public void     windowIconified(WindowEvent e){}
          //Invoked when a window is changed from a normal to a minimized state.
public void     windowOpened(WindowEvent e){
if (e.getID() == WindowEvent.WINDOW_OPENED)
            System.out.println("Hello world");
}
          //Invoked the first time a window is made visible.

public void	mouseClicked(MouseEvent e) {
if (e.getID() == MouseEvent.MOUSE_CLICKED)
    System.out.println("You have just clicked with the mouse");
}
          //Invoked when the mouse button has been clicked (pressed and released) on a component.
public void	mouseEntered(MouseEvent e) {
if (e.getID() == MouseEvent.MOUSE_ENTERED)
    System.out.println("Mouse Entered");
}
          //Invoked when the mouse enters a component.
public void	mouseExited(MouseEvent e) {
if (e.getID() == MouseEvent.MOUSE_EXITED)
    System.out.println("Mouse Exited");
}
          //Invoked when the mouse exits a component.
public void	mousePressed(MouseEvent e) {}
          //Invoked when a mouse button has been pressed on a component.
public void	mouseReleased(MouseEvent e) {}
          //Invoked when a mouse button has been released on a component.
}
