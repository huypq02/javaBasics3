package vn.edu.cybersoft.buoi5;

import vn.edu.cybersoft.pkg.utils;

import java.util.Scanner;

public class bai4 {
    public static void main(String[] args) {
        try {
            // S(n) = x + x^2 + x^3 + ... + x^n => n la so nguyen duong > 0
            Scanner sc = new Scanner(System.in);
            System.out.println("Nhap n so nguyen duong de thoa de bai S(n) = x + x^2 + x^3 + ... + x^n");
            int n = sc.nextInt();
            if (!utils.isPositive(n)){
                System.out.println("n should be positive");
                return;
            }

            System.out.println("Nhap x");
            double x = sc.nextDouble();

            System.out.printf("Result S(%d) = %2f\n", n, mathSumAndPow(x, n));
        } catch (Exception e){
            System.out.println("Something went wrong.");
        }
    }

    private static double mathSumAndPow(double x, int n){
        double result = 0;
        for (int i = 0; i < n; i++){
            result += Math.pow(x, i+1);
        }
        return result;
    }
}
