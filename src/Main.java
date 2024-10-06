import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        ifCondition();//Task 1
        whileOperator();//Task 2
        sumOfNumbers();//Task 3
        tvRemoteControl();//Task 4
        ////Сравнение времени выполнения блока кода
        sumOfNumbers1();//Катя
        sumOfNumbers2();//Серый
        sumOfNumbers3();//Элегантный
        sumOfNumbers4();//Лелес
    }

    public static void ifCondition() {
        System.out.print("Please enter your score: ");
        Scanner scanner = new Scanner(System.in);
        int userScore = scanner.nextInt();

        while (userScore < 0 || userScore > 100) {
            System.out.println("You entered incorrect data. Try again");
            System.out.print("Please enter your score: ");
            userScore = scanner.nextInt();
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
        scanner.close();
    }

    public static void whileOperator() {
        System.out.print("Please enter something: ");
        Scanner scanner = new Scanner(System.in);
        String userInput = scanner.nextLine();
        String stopWord = "exit";

        while (!stopWord.equals(userInput)) {
            System.out.println(userInput);
            System.out.print("Please enter something: ");
            userInput = scanner.nextLine();
        }
        System.out.println("Congratulations, you found an exit!");
        scanner.close();
    }

    public static void sumOfNumbers() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter a number: ");

        int userInput = scanner.nextInt();
        System.out.println(userInput);
        int sum = 0;
        if (userInput > 0) {
            for (int i = 0; i <= userInput; i++) {
                sum += i;
            }
        } else {
            for (int i = 0; i >= userInput; i--) {
                sum += i;
            }
        }
        System.out.printf("Sum of numbers from 0 to %d is %d", userInput, sum);
        scanner.close();
    }

    public static void tvRemoteControl() {
        String[] tvChannels = {"Bel-1", "Bel-2", "Bel-3", "Bel-4", "Bel-5", "Bel-6", "Bel-7", "Bel-8", "Bel-9", "Bel-10"};
        Scanner scanner = new Scanner(System.in);
        int choise;
        System.out.printf("Please enter a number of channel from 1 to %d. Press 0 to exit: ", tvChannels.length);
        do {
            choise = scanner.nextInt();
            switch (choise) {
                case 1 -> System.out.println(choise + " " + tvChannels[0]);
                case 2 -> System.out.println(choise + " " + tvChannels[1]);
                case 3 -> System.out.println(choise + " " + tvChannels[2]);
                case 4 -> System.out.println(choise + " " + tvChannels[3]);
                case 5 -> System.out.println(choise + " " + tvChannels[4]);
                case 6 -> System.out.println(choise + " " + tvChannels[5]);
                case 7 -> System.out.println(choise + " " + tvChannels[6]);
                case 8 -> System.out.println(choise + " " + tvChannels[7]);
                case 9 -> System.out.println(choise + " " + tvChannels[8]);
                case 10 -> System.out.println(choise + " " + tvChannels[9]);
                case 0 -> System.out.println(choise + " " + "Exit");
                default -> System.out.println("This channel does not exist. Try again");
            }
        } while (!(choise == 0));

        System.out.println("End of Program");
    }


    public static void sumOfNumbers1() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a number: ");
        int userInput = scanner.nextInt();
        int sum = 0;

        long startTime = System.nanoTime();
        for (int i = 0; i <= Math.abs(userInput); i++) {
            if (userInput < 0) {
                sum -= i;
            } else {
                sum += i;
            }
        }
        long endTime = System.nanoTime();
        long timeElapsed = endTime - startTime;
        System.out.printf("Katya method - Sum of numbers from 0 to %d is %d.\n Execution of the block took: %d\n", userInput, sum, timeElapsed);
    }


    public static void sumOfNumbers2() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a number: ");
        int userInput = scanner.nextInt();
        int sum = 0;
        long startTime = System.nanoTime();
        if (userInput < 0) {
            for (int i = 0; i >= userInput; i--) {
                sum += i;
            }
        } else {
            for (int i = 0; i <= userInput; i++) {
                sum += i;
            }
        }
        long endTime = System.nanoTime();
        long timeElapsed = endTime - startTime;
        System.out.printf("Sery method - Sum of numbers from 0 to %d is %d\n Execution of the block took: %d\n", userInput, sum, timeElapsed);
    }


    public static void sumOfNumbers3() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a number: ");
        int userInput = scanner.nextInt();
        int sum = 0;
        long startTime = System.nanoTime();
        if (userInput < 0) {
            for (int i = userInput; i <= 0; i++) {
                sum += i;
            }
        } else {
            for (int i = 0; i <= userInput; i++) {
                sum += i;
            }
        }
        long endTime = System.nanoTime();
        long timeElapsed = endTime - startTime;
        System.out.printf("Elegance method  - Sum of numbers from 0 to %d is %d\n Execution of the block took: %d\n", userInput, sum, timeElapsed);
    }

    public static void sumOfNumbers4() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a number: ");
        int userInput = scanner.nextInt();
        int sum = 0;
        long startTime = System.nanoTime();
        for (int i =Math.min(userInput, 0); i <= Math.max(userInput, 0); i++){
            sum +=i;
        }
        long endTime = System.nanoTime();
        long timeElapsed = endTime - startTime;
        System.out.printf("Leles/ChatGPT method - Sum of numbers from 0 to %d is %d\n Execution of the block took: %d\n", userInput, sum, timeElapsed);
    }
}