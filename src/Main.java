import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        ifCondition();
        System.out.println("End of Program");
    }

    public static void ifCondition() {
        System.out.print("Please enter your score: ");
        int userScore = new Scanner(System.in).nextInt();

        while (userScore < 0 || userScore > 100) {
            System.out.println("You entered incorrect data. Try again");
            System.out.print("Please enter your score: ");
            userScore = new Scanner(System.in).nextInt();
        }
        if (userScore >= 90) {
            System.out.println("Your grade is A!");
        } else if (userScore >= 80) {
            System.out.println("Your grade is B!");
        } else if (userScore >= 70) {
            System.out.println("Your grade is C!");
        } else if (userScore >= 60) {
            System.out.println("Your grade is D!");
        } else if (userScore >= 50) {
            System.out.println("Your grade is E!");
        } else {
            System.out.println("Your grade is F!");
        }
    }
}