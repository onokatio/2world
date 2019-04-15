import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;


public class Mouse implements MouseListener,MouseMotionListener,MouseWheelListener{

  int x;
  int y;

  public void mouseClicked(MouseEvent event){
//   System.out.println("mouseClicked.");
  }
  public void mouseEntered(MouseEvent e){
//    System.out.println("mouseEntered");
//    try{
//      new Robot().mousePress(InputEvent.BUTTON1_MASK);
//    }catch(AWTException roboterror){
//    }
  }
  public void mouseExited(MouseEvent e){
//   System.out.println("mouseExited");
  }
  public void mousePressed(MouseEvent event){
//   System.out.println("mousePressed.");
  }
  public void mouseReleased(MouseEvent event){
//   System.out.println("mouseRelease.");
  }
  public void mouseDragged(MouseEvent event){
//   System.out.println("mouseDragged.");
  }
  public void mouseMoved(MouseEvent event){
//   this.x = event.getX();
//   this.y = event.getY();
//   System.out.println("mouseMoved.");
//   System.out.println(this.x);
//   System.out.println(this.y);
  }
  public void mouseWheelMoved(MouseWheelEvent event){
//   System.out.println("mouseWheelMoved");
  }

}
