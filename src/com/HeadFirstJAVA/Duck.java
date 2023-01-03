package com.HeadFirstJAVA;

public class Duck {
    private static int size;
   /* public Duck(){
        System.out.println("Quack");
    }

    public void setSize(int newSize) {
        size = newSize;
    }
   public static void main(String[] args) {
     System.out.println(
             "Size of the duck is "+size
     );
   }*/
   public static void main(String[] args) {
       System.out.println("Size is "+ getSize());
   }

    public static void setSize(int size) {
        Duck.size = size;
    }
    public static int getSize() {
       return size;
   }
}