package HomeWork2.Cicles;

import java.util.Scanner;

public class Cycles3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        double number = sc.nextDouble();
        System.out.println("Enter elevate");
        int elevate = sc.nextInt();
        System.out.println(Cycles3.pow(number, elevate));
    }

    public static double pow(double value, int powValue) {
        double result = 1;
        for (int i = 1; i <= powValue; i++) {
            result = result * value;
        }
        return result;
    }

}
