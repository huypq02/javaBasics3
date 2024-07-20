package vn.edu.cybersoft.buoi5;

import vn.edu.cybersoft.pkg.utils;

import java.util.Scanner;

import static vn.edu.cybersoft.buoi5.validator.bai5.*;

public class bai5 {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            // so tien anh X gui (fund)
            System.out.println("Nhap so tien gui (VND):");
            int deposit = sc.nextInt();
            if (!validatorDeposit(deposit)){
                return;
            }

            // so tien mong muon tuong lai (expectedFund)
            System.out.println("Nhap so tien mong muon co trong tuong lai (VND):");
            int expectedSaving = sc.nextInt();
            if (!validatorExpectedSaving(deposit, expectedSaving)){
                return;
            }

            // tien lai tiet kiem (interestSaving)
            System.out.println("Nhap tien lai tiet kiem (%/year)");
            double interestRate = sc.nextDouble();
            if (!validatorInterestRate((int)interestRate)){
                return;
            }

            // thoi gian du tien mua o to (timeTarget)
            System.out.println("Du kien so ngay it nhat ma ban phai doi ke tu thoi diem hien tai la");
            double expectedDay = savingsCalculator(deposit, expectedSaving, interestRate);
            System.out.println(expectedDay + " ngay");
            System.out.println("~ " + utils.convertDayToYear(expectedDay) + " nam");
        } catch (Exception e){
            System.out.println("Something wrong!");
        }
    }

    // cong thuc:
    // so tien lai = so tien gui (deposit) * lai suat (interestRate (%/year))
    // * so ngay thuc gui (so x can tim) / 365
    private static double savingsCalculator(int deposit, int expectedSaving, double interestRate){
        //
        double expectedDay = expectedDay(deposit, expectedSaving, interestRate);
        return expectedDay;
    }

    private static double interestOfDay(int deposit, double interestRates){
        // so tien gui (deposit) * lai suat (interestRate (%/year)) / 365
        return deposit*interestRates/100/365;
    }

    private static double expectedInterest(int deposit, int expectedSaving){
        // so tien lai
        return expectedSaving-deposit;
    }

    private static double expectedDay(int deposit, int expectedSaving, double interestRate){
        // so ngay thuc gui (so x can tim)
        return expectedInterest(deposit, expectedSaving) /interestOfDay(deposit, interestRate);
    }
}
