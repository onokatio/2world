import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
import java.util.*;
import java.util.Timer;
import javax.swing.JFrame;
import javax.swing.ImageIcon;


public class U{
  int x;//x座標
  int y;//y座標
  int z;//z座標
  int push = 0;//粘度
  int n = 1;//質量
  int drop = 0;//摩擦力
  Color color;//色
  boolean inv;//あたり判定

  U(int x,int y,int z){
    this.x = x;
    this.y = y;
    this.z = z;
  }
  void move(int x,int y,int z){
    this.x = x;
    this.y = y;
    this.z = z;
  }

}
