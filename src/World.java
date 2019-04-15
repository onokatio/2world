import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
import java.util.*;
import java.util.Timer;
import javax.swing.JFrame;
import javax.swing.ImageIcon;


public class World{

  static JFrame mainframe;
  static char keycode;
//  static Robot robot;

  public static void main(String[] args) {


    JFrame infof = new JFrame();

    infof.setSize(Bootinfo.x, Bootinfo.y);
    infof.setTitle("2world 0.0.0");
    infof.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    infof.setVisible(true);

    Bootinfo.arg(args);//引数処理

    mainframe = new JFrame();

    mainframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    D3Paint mainpaint = new D3Paint();
    mainframe.getContentPane().add(BorderLayout.CENTER, mainpaint);

    infof.setSize(Bootinfo.x, Bootinfo.y);
    infof.setTitle("2world 0.0.0");
    ImageIcon icon = new ImageIcon("./icon.png");
    mainframe.setIconImage(icon.getImage());
//    Scanner key = new Scanner(System.in);
    mainframe.setLocationRelativeTo(null);
    mainframe.addKeyListener(new Key());

    Mouse mouse = new Mouse();
    mainframe.addMouseListener(mouse);
    mainframe.addMouseMotionListener(mouse);
    mainframe.addMouseWheelListener(mouse);

    Timer fpstimer = new Timer();
    fpstimer.schedule(new Fps(),0,1000);

    infof.setVisible(false);
    mainframe.setVisible(true);


    for (;;){
      //メインループ
      mainpaint.repaint();
      Bootinfo.fpscount++;
      try {
        Thread.sleep(10);
      } catch (Exception ex) {}
    }

  }

}

class D3Paint extends JPanel {
  public void paintComponent(Graphics g) {
//    if (Player.x > 100) Player.x = 1;
//    if (Player.y > 100) Player.y = 1;
      Bootinfo.player.repaint(g);
//    System.out.println("fps"+Integer.toString(Bootinfo.fpscount));
  }
}
