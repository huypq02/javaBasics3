package vn.edu.cybersoft.buoi5_2;

import vn.edu.cybersoft.pkg.utils;

import java.util.Scanner;

public class bai2 {
    public static void main(String[] args) {
        try {
            // theo de bai n chac chan la so nguyen lon hon 0
            //
            System.out.println("Nhap n");
            Scanner sc = new Scanner(System.in);
            int num = sc.nextInt();
            if (!utils.isPositive(num)){
                System.out.println("n should be greater than 0");
            }
            System.out.printf("Tong cac so chan tu 1 den %d la %d\n", num, sumEvenNum(num));

        } catch (Exception e){
            System.out.println("Something went wrong!");
        }
    }

    private static int sumEvenNum(int n){
        int sum = 0;
        for (int i = 1; i <= n; i++){
            if (i%2 == 0) sum += i;
        }
        return sum;
    }
}
