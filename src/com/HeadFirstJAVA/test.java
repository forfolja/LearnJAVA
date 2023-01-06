package com.HeadFirstJAVA;

import javax.sound.midi.SysexMessage;

public class test {
    /* public static void main(String[] args) {
        int randomNum = (int) (Math.random()*5);
        System.out.println(randomNum);
    } */
   /* public static void main(String[] args) {
        for (int i = 0;i < 10;i++){
            System.out.println(i);
    }
   System.out.println("done");
    } */
  /*  public static void main(String[] args) {
        int i = 0;
        while (i < 9) {
            System.out.println(i);
            i++;
        }
    }
    int [] a = new int [8];
     */
    Integer i = 1;
    int j = 2;

    public static void main(String[] args) {
        test t = new test();
        t.go();

    }
    public void go(){
        j = i;
        System.out.println(j);
        System.out.println(i);
    }
}