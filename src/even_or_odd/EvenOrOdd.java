package even_or_odd;

import java.util.Scanner;

public class EvenOrOdd {
    public static boolean isEven(int num) {
        if (num % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to check if it's even or not");
        int number = sc.nextInt();
        System.out.println("Is number even : " + isEven(number));
    }
}
