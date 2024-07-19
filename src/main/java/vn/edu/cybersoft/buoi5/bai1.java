package vn.edu.cybersoft.buoi5;

import java.util.Random;
import java.util.Scanner;

public class bai1 {
    public static void main(String[] args) {
        int humanPoints = 0;
        int machinePoints = 0;
        int result = 0;
        while (true) {
            // HUMAN
            Scanner sc = new Scanner(System.in);
            System.out.println("Oan tu ti! Ra cai gi? (0 - Stop, 1 - Keo, 2 - bua, 3 - bao)");
            // define (0 - Keo, 1 - bua, 2 - bao)
            int decision = sc.nextInt();
            if (!validator(decision)){
                System.out.println("err: your choice does not include 0, 1, 2, or 3");
                return;
            }
            // your choice
            if (decision == 0) {
                break;
            } else {
                result = playGame(decision);
            }
            // points
            if (result == 1){
                humanPoints++;
            }
            if (result == 2){
                machinePoints++;
            }
        }

        System.out.println("Points of Machine : " + machinePoints);
        System.out.println("Points of Human : " + humanPoints);
        if (machinePoints > humanPoints){
            System.out.println("Point of Machine is the highest");
            return;
        }
        if (machinePoints < humanPoints){
            System.out.println("Point of Human is the highest");
            return;
        }
        System.out.println("Draw!!!");
    }

    private static int playGame(int decision){
        // MACHINE
        // create instance of Random class
        Random rand = new Random();
        // Generate random integers in range 0 to 999
        int rand_num = rand.nextInt(1,3);

        System.out.println("Ra cai nay!");
        // note: keo < bua < bao < keo ... => how to: 1 < 2 < 3 < 1 ...
        System.out.println("Machine : " + rand_num);
        System.out.println("Human : " + decision);

        if (decision == rand_num) {
            System.out.println("Draw!");
            return 0;
        }
        if (result(decision, rand_num)){
            System.out.println("You win!");
            return 1;
        }
        System.out.println("You lose!");
        return 2;
    }

    private static boolean result(int human, int machine){
        if ((human-machine) == 1){
            return true;
        }
        if ((human-machine) == 2){
            return false;
        }
        return (human - machine) != -1;
    }

    private static boolean validator(int choice){
        return choice == 1 || choice == 2 || choice == 3 || choice == 0;
    }
}
