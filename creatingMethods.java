import java.util.Scanner;

public class creatingMethods {
    public static void main(String[] args) {
        introduction();
        addingGame();
        squares();
    }
    
    public static void introduction() {
        System.out.println(
                "Welcome to a labyrinth of sounds and smells, misdirection and misfortune. A labyrinth with no exit, a maze with no prize.");
    }
    
    public static void addingGame() {
        Scanner userInput = new Scanner(System.in);

        System.out.println("Do you wanna play a game Y/N");
        String userAnswer = userInput.nextLine();

        while (!userAnswer.equalsIgnoreCase("Y") && !userAnswer.equalsIgnoreCase("N")) {
            System.out.println("That is not the answer I am looking for.");
            System.out.println("Do you wanna play a game Y/N");
            userAnswer = userInput.nextLine();
        }

        if (userAnswer.equalsIgnoreCase("Y")) {
            int numberRange = 20;

            while (userAnswer.equalsIgnoreCase("Y")) {
                double randomNumber1 = Math.random() * numberRange;
                randomNumber1 = (int) randomNumber1;

                double randomNumber2 = Math.random() * numberRange;
                randomNumber2 = (int) randomNumber2;

                double correctAnswer = randomNumber1 + randomNumber2;

                System.out.println(randomNumber1 + " + " + randomNumber2 + "= ");
                double gameAnswer = userInput.nextDouble();
                userInput.nextLine();

                if (correctAnswer == gameAnswer) {
                    System.out.println("Correct");
                } else {
                    System.out.println("Incorrect");
                }

                System.out.println("Do you want to play again? Y/N");
                userAnswer = userInput.nextLine();
            }
            System.out.println("Then lets move on!");

        } else if (userAnswer.equalsIgnoreCase("N")) {
            System.out.println("Alright then.");
        }

        userInput.close();
    }
    
    public static void squares() {
        for (int i = 1; i < 25; i++) {
            if (i % 2 == 0) {
                System.out.println(i + " squared is " + (i * i));
            }
        }
    }
}
