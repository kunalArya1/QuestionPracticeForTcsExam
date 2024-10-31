package OopsRevision;

import java.net.URLEncoder;

class  Rectangle {
  private int length;
  private int breadth;

  public int getLength(){
      if(length < 0){
          length = 1;
      }
      return length;
  }
  public int getBreadth(){
      return breadth;
  }
  public void setLength(int len){
      length = len;
  }
  public void setBreadth(int bre){
      breadth = bre;
  }
  public int area(){
      return  length* breadth;
  }
}
public class Encapusation {
    public static void main(String[] args) {
        Rectangle r = new Rectangle();
        r.setLength(10);
        r.setBreadth(12);
        System.out.println(r.area());
    }
}
