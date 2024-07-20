package vn.edu.cybersoft.pkg;

public class utils {
    public static boolean isPositive(int num){
        return num > 0;
    }

    public static boolean isEven(int num){
        return (num % 2) == 0;
    }

    public static boolean isDivisible(int divisor, int dividend){
        return divisor%dividend == 0;
    }
}
