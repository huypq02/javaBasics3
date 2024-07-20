package vn.edu.cybersoft.buoi5;

public class bai2 {
    final static int MAX_CONDITION = 10_000;
    public static void main(String[] args) {
        // tim so nguyen duong nho nhat sao cho : 1 + 2 + ... + n > 10000
        System.out.printf("So nguyen n nho nhat thoa dieu kien la %d\n", findNum());
    }

    private static int findNum(){
        int sum = 0;
        for (int i = 1; true; i++){
            sum += i;
            if (sum > MAX_CONDITION){
                return i;
            }
        }
    }
}
