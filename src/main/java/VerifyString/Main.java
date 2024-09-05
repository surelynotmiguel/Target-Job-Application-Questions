import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your text:");
        String text = scanner.nextLine();

        Result.verifyCharPresenceAndOccurrence(text);
    }

}