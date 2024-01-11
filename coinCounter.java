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

    
    public static void main(String[] args) {double storedCoinAmount = 0;
        BigDecimal dollarsTotal;
        BigDecimal coinsTotal;

        Scanner userInput = new Scanner(System.in);

        System.out.println("Hello and welcome to WorldStar CoinStar");

        System.out.println("How many Quarters are you inputting?");
        int quarterOutput = userInput.nextInt();
        storedCoinAmount += quarterOutput * 0.25;

        System.out.println("How many Dimes are you inputting?");
        int dimeOutput = userInput.nextInt();
        storedCoinAmount += dimeOutput * 0.10;

        System.out.println("How many Nickels are you inputting?");
        int nickelOutput = userInput.nextInt();
        storedCoinAmount += nickelOutput * 0.05;

        System.out.println("How many Pennies are you inputting?");
        int penniesOutput = userInput.nextInt();
        storedCoinAmount += penniesOutput * 0.01;

        dollarsTotal = BigDecimal.valueOf(storedCoinAmount).setScale(0, RoundingMode.DOWN);
        coinsTotal = BigDecimal.valueOf(storedCoinAmount).subtract(dollarsTotal);

        userInput.close();

        System.out.println("You have inputted: ");
        System.out.println(quarterOutput + " Quarters");
        System.out.println(dimeOutput + " Dimes");
        System.out.println(nickelOutput + " Nickels");
        System.out.println(penniesOutput + " Pennies");
        System.out.println("Your total is: " + dollarsTotal + " dollars and " + coinsTotal.setScale(2, RoundingMode.HALF_UP) + " cents");
    }
}
