import java.util.*;


public class ArrayArrayList{
  ArrayList<ArrayList> u;

  ArrayArrayList(){
    this.u = new ArrayList<ArrayList>(1);
    this.u.add(0,new ArrayList<ArrayList>(1));
    this.u.get(0).add(new ArrayList<ArrayList>(1));
    this.u.get(0).get(0).add(0,new U());
  }
  U get(int u1, int u2, int u3){
    if(this.u.size()-1 < u1){//uの要素が存在しなかったら
      return null;//そんな要素はまだない
    }
    U tmp = this.u.get(u1);
    U tmp2 = tmp.get(u2);
    return tmp2.get(u3);
  }
  void add(int u1, int u2, int u3, U date){
    if(this.u.size()-1 < u1){//x座標の要素が存在
      if(this.u.get(u1).size()-1 < u2){//y座標の要素が存在
        if(this.u.get(u1).get(u2).size()-1 < u3){//z座標の要素が存在
          this.u.get(u1).get(u2).add(u3, date);//あったから入れたよー
        }else{//uuuに新しく要素を作る
          this.u.get(u1).get(u2).add(u3,new U());
        }
      }else{//uu
        this.u.get(u1).add(u2, new ArrayList<ArrayList>(1));
        this.u.get(u1).get(u2).add(u3,new U());
      }
    }else{//u
      //まずx座標作る
      this.u.add(u1,new ArrayList<ArrayList>(1));
      //y
      this.u.get(u1).add(u2,new ArrayList<ArrayList>(1));
      //z
      this.u.get(u1).get(u2).add(u3,new U());
    }
    return;//add完了!
  }
  class U{
  }
}
