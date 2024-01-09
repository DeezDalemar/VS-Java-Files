//Example of a input out put system in Java

/*  
System.out.println("Time for a test rq");
Scanner testInput = new Scanner(System.in);
String output = testInput.nextLine();
System.out.println(output + " it worked");
*/

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner; 

public class coinCounter {

    
    public static void main(String[] args) {
        int amountOfQuarters;
        int amountOfDimes;
        int amountOfNickels;
        int amountOfPennies;

        double storedCoinAmount = 0;
        double dollarsTotal;
        double coinsTotal;

        Scanner userInput = new Scanner(System.in);

        System.out.println("Hello and welcome to WorldStar CoinStar");

        System.out.println("How many Quarters are you inputing?");
        Integer quarterOutput = userInput.nextInt();
        userInput.nextLine();
        amountOfQuarters = quarterOutput;
        storedCoinAmount += amountOfQuarters * 0.25;

        System.out.println("How many Dimes are you inputing?");
        Integer dimeOutput = userInput.nextInt();
        userInput.nextLine();
        amountOfDimes = dimeOutput;
        storedCoinAmount += amountOfDimes * 0.10;

        System.out.println("How many Nickles are you inputing?");
        Integer nickleOutput = userInput.nextInt();
        userInput.nextLine();
        amountOfNickels = nickleOutput;
        storedCoinAmount += nickleOutput * 0.05;

        System.out.println("How many Pennnies are you inputing?");
        Integer penniesOutput = userInput.nextInt();
        userInput.nextLine();
        amountOfPennies = penniesOutput;
        storedCoinAmount += penniesOutput * 0.01;

        dollarsTotal = ((int) storedCoinAmount);
        coinsTotal = storedCoinAmount % dollarsTotal;
        BigDecimal numberBigDecimal = new BigDecimal(coinsTotal);

        System.out.println("You have inputed: ");
        System.out.println(amountOfQuarters + " Quarters");
        System.out.println(amountOfDimes + " Dimes");
        System.out.println(amountOfNickels + " Nickels");
        System.out.println(amountOfPennies + " Pennies");
        System.out.println("Your total is: " + dollarsTotal + " dollars and " + numberBigDecimal.setScale(2, RoundingMode.HALF_UP) + " cents");
    }
}
