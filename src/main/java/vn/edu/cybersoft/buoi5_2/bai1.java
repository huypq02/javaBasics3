package vn.edu.cybersoft.buoi5_2;

import vn.edu.cybersoft.pkg.utils;

public class bai1 {
    final static int MAX_NUM = 100;
    public static void main(String[] args) {
        try {
            // so nguyen duong la so lon hon 0
            //
            System.out.println("In tat ca so nguyen duong le nho hon " +  MAX_NUM);
            printOddsNum(MAX_NUM);
            // newline
            System.out.println();
            //
            System.out.println("In tat ca so nguyen duong chan nho hon " +  MAX_NUM);
            printEvenNum(MAX_NUM);

        } catch (Exception e){
            System.out.println("Something went wrong!");
        }
    }

    private static void printEvenNum(int num){
        for (int i = 1; i < num; i++){
            if (utils.isEven(i)){
                System.out.print(i + " ");
            }
        }
    }

    private static void printOddsNum(int num){
        for (int i = 1; i < num; i++){
            if (!utils.isEven(i)){
                System.out.print(i + " ");
            }
        }
    }
}
