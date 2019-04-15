import javax.swing.*;
import java.awt.*;

import javax.swing.JFrame;
import javax.swing.ImageIcon;

public class Bootinfo
{
  public static int x ;
  public static int y ;
  public static int fpscount = 0;
  public static int fpstimercount = 0;
  public static Player player = new Player("a");
//  public static Fps fps = new Fps();

  public static void arg(String args2[]) {
    for (int i=0; i<args2.length; ++i) {
      if (args2[i].indexOf("-x") != -1) {
        x = Integer.parseInt(args2[i+1]);
      }//if終わり
      if (args2[i].indexOf("-y") != -1) {
        y = Integer.parseInt(args2[i+1]);
      }//if終わり
    }//for終わり
    if (x <= 1){
      x = 100;
    }
    if (y <= 1){
      y = 100;
    }

  }//メソッド終わり
}//クラス終わり
