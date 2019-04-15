import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
import java.util.*;
import java.util.Timer;
import javax.swing.JFrame;
import javax.swing.ImageIcon;

class Fps extends TimerTask{

  public void run(){
//    if(Bootinfo.fpscount >= 100){
      System.out.println(Bootinfo.fpscount);
      Bootinfo.fpscount = 0;
      Bootinfo.fpstimercount++;
//    }
//    System.out.println("１秒経ちました。");
  }

}
