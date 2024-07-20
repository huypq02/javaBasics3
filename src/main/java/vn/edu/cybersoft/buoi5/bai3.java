package vn.edu.cybersoft.buoi5;

import java.util.Scanner;

public class bai3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap n");
        double n = 0;
        while (n <= 0){
            n = sc.nextDouble();
            if (n <= 0) {
                System.out.println("Nhap lai n");
            }
        }

        System.out.println("Tong cac so le nguyen duong nho hon n la " + sumOddNumLessThanN(n));
    }

    private static int sumOddNumLessThanN(double n){
        int sum = 0;
        for (int i = 0; true; i++){
            if (i%2 != 0) sum += i;
            if (sum >= n){
                return sum - i;
            }
        }
    }
}
