package src;

/**
 * ITSC 1212 Candle class for Project 3
 */
import java.util.*;

public class CandleShop {

    public static void main(String[] args) {
        // Step 1
        Scanner input = new Scanner(System.in); // scan for user's input

        // Prompt User (The shopkeeper) to enter the name, type, price, and burn time
        // for type 1 candle.
        System.out.print("Please enter the name for type 1 candle: "); // prompt user for name
        String name1 = input.nextLine(); // record user's input into 'name1'

        System.out.print("Please enter the type for type 1 candle: "); // prompt user for type
        int type1 = input.nextInt(); // record user's input into 'type1'

        System.out.print("Please enter the price for type 1 candle: "); // prompt user for price
        double price1 = input.nextDouble(); // record user's input into 'price1'

        while (price1 <= 0.0) // BONUS: user will have to put input greater than 0
        {
            System.out.println("Invalid input. Please enter another number. Thanky you.");
            price1 = input.nextDouble();
        }

        System.out.print("Please enter the burn time for type 1 candle: "); // prompt user for burn time
        int time1 = input.nextInt(); // record user's input into 'time1'

        while (time1 <= 0) // BONUS: user will have to put input greater than 0
        {
            System.out.println("Invalid input. Please enter another number. Thanky you.");
            time1 = input.nextInt();
        }

        input.nextLine(); // to skip the newline left-over

        // Prompt User (The shopkeeper) to enter the name, type, price, and burn time
        // for type 2 candle.
        System.out.print("Please enter the name for type 2 candle: "); // prompt user for name

        String name2 = input.nextLine(); // record user's input into 'name1'

        System.out.print("Please enter the type for type 2 candle: "); // prompt user for type
        int type2 = input.nextInt(); // record user's input into 'type1'

        System.out.print("Please enter the price for type 2 candle: "); // prompt user for price
        double price2 = input.nextDouble(); // record user's input into 'price1'

        while (price2 <= 0.0) // BONUS: user will have to put input greater than 0
        {
            System.out.println("Invalid input. Please enter another number. Thank you.");
            price2 = input.nextDouble();
        }

        System.out.print("Please enter the burn time for type 2 candle: "); // prompt user for burn time
        int time2 = input.nextInt(); // record user's input into 'time1'

        while (time2 <= 0) // BONUS: user will have to put input greater than 0
        {
            System.out.println("Invalid input. Please enter another number. Thank you.");
            time2 = input.nextInt();
        }

        input.nextLine(); // to skip the newline left-over

        // Prompt User (The shopkeeper) to enter the name, type, price, and burn time
        // for type 3 candle.
        System.out.print("Please enter the name for type 3 candle: "); // prompt user for name

        String name3 = input.nextLine(); // record user's input into 'name1'

        System.out.print("Please enter the type for type 3 candle: "); // prompt user for type
        int type3 = input.nextInt(); // record user's input into 'type1'

        System.out.print("Please enter the price for type 3 candle: "); // prompt user for price
        double price3 = input.nextDouble(); // record user's input into 'price1'

        while (price3 <= 0.0) // BONUS: user will have to put input greater than 0
        {
            System.out.println("Invalid input. Please enter another number. Thank you.");
            price3 = input.nextDouble();
        }

        System.out.print("Please enter the burn time for type 3 candle: "); // prompt user for burn time
        int time3 = input.nextInt(); // record user's input into 'time1'

        while (time3 <= 0) // BONUS: user will have to put input greater than 0
        {
            System.out.println("Invalid input. Please enter another number. Thank you.");
            time3 = input.nextInt();
        }

        input.nextLine(); // to skip the newline left-over

        // Instantiate three candle objects
        Candle candle1 = new Candle(name1, type1, price1, time1);
        Candle candle2 = new Candle(name2, type2, price2, time2);
        Candle candle3 = new Candle(name3, type3, price3, time3);

        // Step 2
        System.out.print("How many type 1 candles do you want to buy? "); // promp user
        int numCandle1 = input.nextInt(); // record user's input

        System.out.print("How many type 2 candles do you want to buy? "); // promp user
        int numCandle2 = input.nextInt(); // record user's input

        System.out.print("How many type 3 candles do you want to buy? "); // promp user
        int numCandle3 = input.nextInt(); // record user's input

        System.out.println();

        // Step 3
        double totalPriceCandle1 = candle1.getCost() * numCandle1; // calculate the total price of candles using
                                                                   // infomration from step 1 and by calling getter
        double totalPriceCandle2 = candle2.getCost() * numCandle2; // calculate the total price of candles using
                                                                   // infomration from step 1 and by calling getter
        double totalPriceCandle3 = candle3.getCost() * numCandle3; // calculate the total price of candles using
                                                                   // infomration from step 1 and by calling getter

        double totalPriceOfAllCandle = totalPriceCandle1 + totalPriceCandle2 + totalPriceCandle3; // add all prices of
                                                                                                  // candles

        // Step 4 : Deduct discount from purchase price

        double totalPriceWithDiscount = 0; // setting variable to zero

        if (totalPriceOfAllCandle > 20 && totalPriceOfAllCandle <= 35) // if total is greater than $20 and less/equal to
                                                                       // $35)
        {
            totalPriceWithDiscount = ((totalPriceOfAllCandle) - (totalPriceOfAllCandle * .05)); // The total price with
                                                                                                // discount is equal to:
                                                                                                // ((Total price) -
                                                                                                // (Total price multiply
                                                                                                // by %5))
        }
        if (totalPriceOfAllCandle > 35 && totalPriceOfAllCandle <= 55) // if total is greater than $35 and less/equal to
                                                                       // $55)
        {
            totalPriceWithDiscount = ((totalPriceOfAllCandle) - (totalPriceOfAllCandle * .07)); // The total price with
                                                                                                // discount is equal to:
                                                                                                // ((Total price) -
                                                                                                // (Total price multiply
                                                                                                // by %7))
        }
        if (totalPriceOfAllCandle > 55 && totalPriceOfAllCandle <= 100) // if total is greater than $55 and less/equal
                                                                        // to $100)
        {
            totalPriceWithDiscount = ((totalPriceOfAllCandle) - (totalPriceOfAllCandle * .10)); // The total price with
                                                                                                // discount is equal to:
                                                                                                // ((Total price) -
                                                                                                // (Total price multiply
                                                                                                // by %10))
        }
        if (totalPriceOfAllCandle > 100) // if total is greater than $100
        {
            totalPriceWithDiscount = ((totalPriceOfAllCandle) - (totalPriceOfAllCandle * .20)); // The total price with
                                                                                                // discount is equal to:
                                                                                                // (()Total price) -
                                                                                                // (Total price multiply
                                                                                                // by %20))
        }

        // Step 5 Calculate total burn time of all candles using getter of the Candle
        // class

        int totalBurnTimeCandle1 = candle1.getTime(); // Setting candle 1 burn time into variable total burn time candle
                                                      // 1
        int totalBurnTimeCandle2 = candle2.getTime(); // Setting candle 1 burn time into variable total burn time candle
                                                      // 2
        int totalBurnTimeCandle3 = candle3.getTime(); // Setting candle 1 burn time into variable total burn time candle
                                                      // 3

        int totalBurnTimeOfAllCandles = totalBurnTimeCandle1 + totalBurnTimeCandle2 + totalBurnTimeCandle3;

        // Step 6 Calculate the total cost-per-mintue for that purchase using the
        // discount purchase price and the toal burn time.

        double totalCostPerMintue = totalPriceWithDiscount * totalBurnTimeOfAllCandles;

        // Step 7 Output some kind of meaningful display
        // BONUS-BONUS-BONUS (loyalty pionts)towards the bottom

        System.out.println(); // extra line

        System.out.println("The purchase is the following: "); // print

        System.out.println(); // extra line

        System.out.println(+numCandle1 + " " + candle1.getName() + " candle(s) of type "
                + candle1.getType() + " that cost $" + candle1.getCost() + " each and will burn for "
                + candle1.getTime() + " minutes."); // Displaying candle's information

        System.out.println(+numCandle2 + " " + candle2.getName() + " candle(s) of type "
                + candle2.getType() + " that cost $" + candle2.getCost() + " each and will burn for "
                + candle2.getTime() + " minutes."); // Displaying candle's information

        System.out.println(+numCandle3 + " " + candle3.getName() + " candle(s) of type "
                + candle3.getType() + " that cost $" + candle3.getCost() + " each and will burn for "
                + candle3.getTime() + " minutes."); // Displaying candle's information

        System.out.println("The total price of the candle(s) before the discount was $" + totalPriceOfAllCandle + "."); // total
                                                                                                                        // price
                                                                                                                        // of
                                                                                                                        // candle(s)
                                                                                                                        // before
                                                                                                                        // discount
        System.out.println("However, after the discount, the total price of the candle(s) drop to $"
                + totalPriceWithDiscount + "."); // total price after discount
        System.out.println("The total burn time of all candles purchase is " + totalBurnTimeOfAllCandles + " minutes."); // total
                                                                                                                         // burn
                                                                                                                         // time
        System.out.println(
                "The total cost-per-mintue to burn all the candles all the way down is $" + totalCostPerMintue + "."); // total
                                                                                                                       // cost-per-mintue

        System.out.println(); // extra line

        // BONUS-BONUS-BONUS (loyalty pionts)

        int totalNumCandleSold = numCandle1 + numCandle2 + numCandle3; // add up the number of canlde 1, 2, and 3
                                                                       // purchase and stored into a variable
        int loyaltyPionts = totalNumCandleSold / 10; // calcuates loyalty pionts by diving the total number of candle
                                                     // sold and divid by 10

        System.out.println("The total loyalty pionts you earned with this purchase is: " + loyaltyPionts); // print out

        System.out.println(); // extra line

        // Part C (WITH IMPLEMENATION OF BONUS-BONUS & @ $)
        // histogram
        // Step 1

        System.out.print("Name of candle and stars: " + candle1.getName() + " "); // print candle's name

        for (int i = 0; i < numCandle1; i++) // for loop.
        {
            System.out.print("%"); // print number of % base on number of candle 1 was purchased.
        }

        System.out.println("");

        System.out.print("Name of candle and stars: " + candle2.getName() + " "); // print candle's name

        for (int i = 0; i < numCandle2; i++) // for loop.
        {
            System.out.print("@"); // print number of @ base on number of candle 2 was purchased.
        }

        System.out.println("");

        System.out.print("Name of candle and stars: " + candle3.getName() + " "); // print candle's name

        for (int i = 0; i < numCandle3; i++) // for loop.
        {
            System.out.print("$"); // print number of $ base on number of candle 3 was purchased.
        }

        System.out.println("");

        System.out.println();
        System.out.println("Thank you. We appreicate your business. Come again.");

        // close scanner
        input.close();

    }

}
