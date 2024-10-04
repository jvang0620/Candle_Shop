# Candle Shop Application

This Java project is a basic simulation of a Candle Shop. The program allows the shopkeeper to input different types of candles, specify their properties, and then calculate various metrics based on customer purchases. The program also calculates discounts based on the total price of the candles purchased and outputs a summary of the purchase.

## Table of Contents

- [Features](#features)
- [Classes](#classes)
  - [Candle](#candle-class)
  - [CandleShop](#candleshop-class)
- [How to Run the Program](#how-to-run-the-program)
- [Example Usage](#example-usage)
- [Discount Scheme](#discount-scheme)
- [Future Enhancements](#future-enhancements)

## Features

- Create and store details of different candle types.
- Calculate the total price of multiple candles.
- Apply discounts based on the total price.
- Compute total burn time and cost-per-minute of all candles purchased.
- Display the purchase details with itemized descriptions of each candle type.

## Classes

### `Candle` Class

The `Candle` class models the attributes and behaviors of a candle in the shop. It has the following properties and methods:

#### Properties

- `String name`: The name of the candle, e.g., "Taper", "Pillar", "Tea Light", etc.
- `int type`: The type of candle (1, 2, or 3).
- `double cost`: The cost of the candle.
- `int burnTime`: The burn time of the candle in minutes.

#### Methods

- `getName()`, `setName(String)`: Getter and Setter for the candle's name.
- `getType()`, `setType(int)`: Getter and Setter for the candle's type.
- `getCost()`, `setCost(double)`: Getter and Setter for the candle's cost.
- `getTime()`, `setTime(int)`: Getter and Setter for the candle's burn time.
- `toString()`: Returns a string representation of the candle's attributes.

### `CandleShop` Class

The `CandleShop` class contains the `main` method, which acts as the entry point for the application. It performs the following steps:

1. Prompts the user to enter details for three different candle types, such as name, type, price, and burn time.
2. Creates three `Candle` objects based on user input.
3. Asks the user how many of each candle type they want to buy.
4. Calculates the total price and applies any applicable discounts.
5. Computes the total burn time and cost-per-minute for the entire purchase.
6. Displays the purchase summary, including total price and details of each candle type.

## How to Run the Program

1. Clone the repository to your local machine.
2. Navigate to the project directory.
3. Compile the Java files:
   ```bash
   javac src/*.java
   ```
4. Run the `CandleShop` class

   ```bash
   java src/CandleShop
   ```

   ### Example Usage

   ```bash
   Please enter the name for type 1 candle: Taper
   Please enter the type for type 1 candle: 1
   Please enter the price for type 1 candle: 5.0
   Please enter the burn time for type 1 candle: 180

   Please enter the name for type 2 candle: Pillar
   Please enter the type for type 2 candle: 2
   Please enter the price for type 2 candle: 12.0
   Please enter the burn time for type 2 candle: 240

   Please enter the name for type 3 candle: Tea Light
   Please enter the type for type 3 candle: 3
   Please enter the price for type 3 candle: 1.5
   Please enter the burn time for type 3 candle: 30

   How many type 1 candles do you want to buy? 3
   How many type 2 candles do you want to buy? 2
   How many type 3 candles do you want to buy? 10

   The purchase is the following:

   3 Taper candle(s) of type 1 that cost $5.0 each and will burn for 180 minutes.
   2 Pillar candle(s) of type 2 that cost $12.0 each and will burn for 240 minutes.
   10 Tea Light candle(s) of type 3 that cost $1.5 each and will burn for 30 minutes.

   The total price of the candle(s) before the discount is $70.5.
   The total price with applicable discount is $63.45.
   The total burn time of all candles is 810 minutes.
   The total cost per minute is $51394.5.
   ```

## Discount Scheme

The application offers the following discount structure based on the total price of candles purchased:

- 5% discount for purchases greater than $20 and less than or equal to $35.
- 7% discount for purchases greater than $35 and less than or equal to $55.
- 10% discount for purchases greater than $55 and less than or equal to $100.
- 20% discount for purchases over $100.

## Future Enhancements

- Input Validation: Expand input validation to ensure only valid types and names are accepted.
- Additional Candle Types: Add more candle types with different attributes.
- Graphical User Interface: Develop a GUI for an enhanced user experience.

## License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

## Author

Jai Vang
