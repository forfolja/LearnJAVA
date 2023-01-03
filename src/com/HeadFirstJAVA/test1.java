package com.HeadFirstJAVA;
import java.util.Calendar;
public class test1 {

  /*  Integer i;
    int j;

    public static void main(String[] args) {
        test1 t = new test1();
        t.go();
    }
    public void go(){
        j=i;
        System.out.println(j);
        System.out.println(i);
    }

    public static void main(String[] args) {
        String s = String.format("%,.3f",1000000.66666);
        System.out.println(s);
    }
  public static void main(String[] args) {
      Calendar cal = Calendar.getInstance();
      System.out.println(cal);
  }*/
Calendar c = Calendar.getInstance();
c.set (2004,1,7,15,40);
long day1 = c.getTimeInMillis();
day1 += 1000*60*60;

c.getTimeInMillis()
}
