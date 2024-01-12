import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Scanner;

public class gradebook {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        for (int i = 10; i > 0; i--) {
            BigDecimal squareRoot = BigDecimal.valueOf(Math.sqrt(i));
            squareRoot = squareRoot.setScale(2, RoundingMode.HALF_UP);
            System.out.println("The square root of " + i + " is " + squareRoot);
        }

        System.out.println("Would you like to continue onto grading? Y/N");
        String yesOrNoAnswer = userInput.nextLine();

        if (yesOrNoAnswer.equalsIgnoreCase("Y")) {
            System.out.println("Student Name: ");
            String studentName = userInput.nextLine();

            System.out.println("Course Name: ");
            String courseName = userInput.nextLine();

            double midTermGrade;
            do {
                System.out.println("What is your Midterm Grade?: ");
                while (!userInput.hasNextDouble()) {
                    System.out.println("Invalid input. Please enter a valid number.");
                    userInput.next(); // Consume the invalid input
                }
                midTermGrade = userInput.nextDouble();
            } while (midTermGrade < 1 || midTermGrade > 100);

            double finalGrade;
            do {
                System.out.println("What is your Final Exam Grade?: ");
                while (!userInput.hasNextDouble()) {
                    System.out.println("Invalid input. Please enter a valid number.");
                    userInput.next(); // Consume the invalid input
                }
                finalGrade = userInput.nextDouble();
            } while (finalGrade < 1 || finalGrade > 100);

            double projectGrade;
            do {
                System.out.println("What is your Project Grade?: ");
                while (!userInput.hasNextDouble()) {
                    System.out.println("Invalid input. Please enter a valid number.");
                    userInput.next(); // Consume the invalid input
                }
                projectGrade = userInput.nextDouble();
            } while (projectGrade < 1 || projectGrade > 100);

            userInput.close();

            double averageGrade = (midTermGrade + finalGrade + projectGrade) / 3.0;

            DecimalFormat decimalFormat = new DecimalFormat("#.##");
            decimalFormat.setRoundingMode(RoundingMode.HALF_UP);

            String formattedAverageGrade = decimalFormat.format(averageGrade);

            String feedback;
            if (averageGrade > 100) {
                feedback = "You either are Einstein or you cheated, I'm betting the latter";
            } else if (averageGrade >= 90) {
                feedback = "Nice job, you get an A";
            } else if (averageGrade >= 80) {
                feedback = "Ok, you get a B";
            } else if (averageGrade >= 70) {
                feedback = "Meh, you got a C";
            } else if (averageGrade >= 60) {
                feedback = "Here's a D, do better next time.";
            } else if (averageGrade >= 0) {
                feedback = "Get an F, for FAIRIES";
            } else {
                feedback = "Get, get out, just get out.";
            }

            System.out.println("-----RESULTS-----");
            System.out.println("Student Name: " + studentName);
            System.out.println("Course Name: " + courseName);
            System.out.println("Midterm Exam Grade: " + midTermGrade);
            System.out.println("Final Exam Grade: " + finalGrade);
            System.out.println("Project Grade: " + projectGrade);
            System.out.println("Student Average Grade: " + formattedAverageGrade);
            System.out.println("Feedback: " + feedback);
        } else {
            System.out.println("Thanks for coming!");
        }
    }
}