package vn.edu.cybersoft.buoi5_2;

import vn.edu.cybersoft.pkg.utils;

import java.util.Scanner;

public class bai3 {
    final static int MAX_NUM = 1000;
    final static int DIVIDEND = 3;
    public static void main(String[] args) {
        try {
            // co bao nhieu so chia het cho 3 tu 0 den 1000?
            //
            System.out.printf("Result is %d\n", totalNumberIsDivisible(MAX_NUM));

        } catch (Exception e){
            System.out.println("Something went wrong!");
        }
    }

    private static int totalNumberIsDivisible(int n){
        int sum = 0;
        for (int i = 0; i <= n; i++){
            if (utils.isDivisible(i, DIVIDEND)) sum++;
        }
        return sum;
    }
}
