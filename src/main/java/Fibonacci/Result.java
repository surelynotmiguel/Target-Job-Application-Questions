package Fibonacci;

public class Result {

    public static String isFibonacciNumber(int number) {
        int fNumber = 0;
        int sNumber = 1;
        int current = fNumber + sNumber;

        boolean isInSequence = false;

        for(int i = 2; i < number; i++) {
            if (current == number) {
                isInSequence = true;
                break;
            }

            fNumber = sNumber;
            sNumber = current;
            current = fNumber + sNumber;
        }

        return (isInSequence ? "Number " + number + " is in sequence" : "Number " + number + " is not in sequence");
    }
}
