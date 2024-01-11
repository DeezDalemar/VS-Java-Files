import java.util.Scanner;

public class ticketCounter {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        System.out.println("How many tickets do you have kid");
        int userTickets = userInput.nextInt();

        if (userTickets > 100) {
            System.out.println("GET OUTTA HERE, SCRAM");
        } else if (userTickets > 20) {
            System.out.println("Your pretty good, you can get one of the big prizes");
        } else if (userTickets > 10) {
            System.out.println("Not bad, pick a prize");
        } else if (userTickets < 10) {
            System.out.println("Sorry kid, I cant give credit. Come back when your a little more, em, richer.");
        } else {
            System.out.println("Th..Thats.. Thats not even something I can work with. Just get out.");
        }
    }
}
