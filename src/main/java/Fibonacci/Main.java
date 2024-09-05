package Fibonacci;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Number: ");
        int number = scanner.nextInt();

        System.out.println(Result.isFibonacciNumber(number));

        scanner.close();
    }

}