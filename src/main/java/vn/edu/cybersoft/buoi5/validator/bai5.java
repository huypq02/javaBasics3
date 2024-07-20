package vn.edu.cybersoft.buoi5.validator;

import vn.edu.cybersoft.pkg.utils;

public class bai5 {
    public static boolean validatorDeposit(int amount){
        if (!utils.isPositive(amount)) {
            System.out.println("Deposit should be positive");
            return false;
        }
        return true;
    }

    public static boolean validatorExpectedSaving(int amount, int expectedAmount){
        if (!utils.isPositive(expectedAmount)) {
            System.out.println("Expected saving should be positive");
            return false;
        }
        if (amount >= expectedAmount) {
            System.out.println("Expected saving should be greater than deposit");
            return false;
        }
        return true;
    }

    public static boolean validatorInterestRate(int rate){
        if (!utils.isPositive(rate)) {
            System.out.println("Interest rate should be positive");
            return false;
        }
        return true;
    }
}
