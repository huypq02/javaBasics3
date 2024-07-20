package vn.edu.cybersoft.buoi5;

import java.util.Scanner;

public class bai5 {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            // so tien anh X gui (fund)
            System.out.println("Nhap so tien (VND):");
            int deposit = sc.nextInt();
            // so tien mong muon tuong lai (expectedFund)
            System.out.println("Nhap so tien mong muon co trong tuong lai (VND):");
            int saving = sc.nextInt();

            // tien lai tiet kiem (interestSaving)
            System.out.println("Nhap tien lai tiet kiem (%/year)");
            double interest = sc.nextDouble();

            // tien mua o to (target)

        } catch (Exception e){
            System.out.println("Something wrong!");
        }
    }
}
