package vn.edu.cybersoft.buoi5_2;

import vn.edu.cybersoft.pkg.utils;

public class bai3 {
    final static int MAX_NUM = 1000;
    final static int DIVIDEND = 3;
    public static void main(String[] args) {
        try {
            // co bao nhieu so chia het cho 3 tu 0 den 1000?
            //
            System.out.printf("Result is %d\n", numberOfNumbersIsDivisible());

        } catch (Exception e){
            System.out.println("Something went wrong!");
        }
    }
    //
    private static int numberOfNumbersIsDivisible(){
        int sum = 0;
        for (int i = 0; i <= MAX_NUM; i++){
            if (utils.isDivisible(i, DIVIDEND)) sum++;
        }
        return sum;
    }
}
