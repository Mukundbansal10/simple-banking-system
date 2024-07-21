# Simple Banking System

## Overview

The Simple Banking System is a Java-based application that allows users to perform basic banking operations such as creating accounts, depositing money, withdrawing money, and checking account balances. This console-based application is designed to provide a simple yet effective way to manage bank transactions.

## Features

- **Account Creation**: Allows new customers to create a bank account by entering their name.
- **Deposit Money**: Existing customers can deposit money into their account.
- **Withdraw Money**: Existing customers can withdraw money from their account, with a check to ensure sufficient balance.
- **Check Balance**: Existing customers can check their current account balance.
- **Exception Handling**: Manages invalid inputs gracefully, ensuring a smooth user experience.

## Project Structure

- `Main.java`: The entry point of the application. It handles user interactions and navigation through different banking operations.
- `BankAccount.java`: Manages the verification of existing customer details and initiates banking operations.
- `NewCustomer.java`: Handles the creation of new customer accounts and stores account details.
- `BankOperations.java`: Provides methods for deposit, withdrawal, and balance inquiry operations.

## How to Run

1. Ensure you have Java installed on your system.
2. Clone this repository or download the source code.
3. Compile the Java files:
   ```bash
   javac Main.java BankAccount.java BankOperations.java
   ```
4. Run the application:
   ```bash
   java Main
   ```
5. Follow the on-screen prompts to perform various banking operations.

## Usage

- When prompted, press `1` to login as an existing customer, `2` to create a new account, or `3` to exit the application.
- For existing customers, enter your account number and name to proceed with deposits, withdrawals, or balance checks.
- For new customers, enter your name to create a new account and perform banking operations.

## Contributing

Contributions are welcome! If you have any suggestions or improvements, please create a pull request or open an issue.
