import javax.swing.*;
import java.awt.*;
import java.util.Scanner;
import javax.swing.JFrame;
import javax.swing.ImageIcon;


public class Player{
  int x = 0;
  int y = 0;
  int z = 0;
  String name;
  Player(String name){
    this.name = name;
  }
  void move(int x,int y){
    this.x = x;
    this.y = y;
  }
  void move(int x,int y,int z){
    this.z = z;
  }
  void repaint(Graphics g){
    g.setColor(Color.black);

    g.drowRect(this.x, this.y, 16, 16);
    g.fillRect(this.x+2, this.y+2, 4, 4);
    g.fillRect(this.x+8, this.y+8, 4, 4);
//    drow.dot(g,Player.x,Player.y);
  }
}
