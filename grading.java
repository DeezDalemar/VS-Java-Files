import java.util.Scanner;

public class grading {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        System.out.println("What is your Name?: ");
        String newUsername = userInput.nextLine().toLowerCase().substring(0, 3) + "_YearUp";
        System.out.println("Your new username is " + newUsername);

        System.out.println("Give me a number from 1-100?");
        int userGivenNumber = userInput.nextInt();

        if (userGivenNumber > 100 || userGivenNumber < 1) {
            System.out.println("I know all, and thats not what I asked for!");
        } else if (userGivenNumber % 2 == 0) {
            System.out.println("Your number: " + userGivenNumber + " is even!");
        } else if (userGivenNumber % 2 != 0) {
            System.out.println("Your number: " + userGivenNumber + " is odd!");
        }

        System.out.println("Now turn in your grade, in number form.");
        int userGrade = userInput.nextInt();

        if (userGrade > 100) {
            System.out.println("Your either Eninstien or you cheated, Im betting the latter");
        } else if (userGrade <= 100 && userGrade >= 90) {
            System.out.println("Nice job you get a A");
        } else if (userGrade <= 89 && userGrade >= 80) {
            System.out.println("Ok, you B");
        } else if (userGrade <= 79 && userGrade >= 70) {
            System.out.println("Meh, you got a C");
        } else if (userGrade <= 69 && userGrade >= 60) {
            System.out.println("Heres a D, do better next time.");
        } else if (userGrade <= 59 && userGrade >= 0) {
            System.out.println("Get a F, for FAIRIES");
        } else if (userGrade < 0) {
            System.out.println("Get, get out, just get out.");
        }

        userInput.close();
    }
}
