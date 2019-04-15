import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;


public class Key implements KeyListener{

  static int KeyCode;
  static int k;

  public void keyPressed(KeyEvent event){
    //キーコード取得
    KeyCode = event.getKeyCode();

    //画面に表示
    if(KeyCode == 37){
      Bootinfo.player.x--;
    }else if(KeyCode == 38){
      Bootinfo.player.y--;
    }else if(KeyCode == 39){
      Bootinfo.player.x++;
    }else if(KeyCode == 40){
      Bootinfo.player.y++;
    }
    System.out.println("keyCode:"+KeyCode);
  }

  public void keyReleased(KeyEvent event){
  }

  public void keyTyped(KeyEvent event){
  }

}
