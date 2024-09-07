package Fibonacci;

public class Result {

    public static String isFibonacciNumber(int number) {
        int fNumber = 0;
        int sNumber = 1;
        int current = fNumber + sNumber;

        while(current < number) {
            fNumber = sNumber;
            sNumber = current;
            current = fNumber + sNumber;
        }

        return (current == number ? "Number " + number + " is in sequence" : "Number " + number + " is not in sequence");
    }
}
