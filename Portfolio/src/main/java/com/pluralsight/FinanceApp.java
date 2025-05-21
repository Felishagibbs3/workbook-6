package com.pluralsight;

import com.pluralsight.finance.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FinanceApp {
    public static void main(String[] args) {
        BankAccount account1 = new BankAccount("Pam", 213, 12500);
        BankAccount account2 = new BankAccount("Gary", 543, 1500);

        account1.deposit(100);
        account2.deposit(500);

        System.out.println("The Value in Account 1 is: " + account1.getValue());
        System.out.println("The Value in Account 2 is: " + account2.getValue());

        Scanner scanner = new Scanner(System.in);
        Portfolio portfolio = new Portfolio("Portfolio", "User", new ArrayList<>());

        System.out.println("Welcome to Your Financial Investments/Portfolio");

        boolean appRunning = true;

        while (appRunning) {
            System.out.println("What type of asset would you like to add?");
            System.out.println("1.Jewelry");
            System.out.println("2. Gold");
            System.out.println("3. House");
            System.out.println("4. Bank Account");
            System.out.println("5. Credit Card");
            System.out.println("6. Show Portfolio");
            System.out.println("7. Exit");

            int userChoice = Integer.parseInt(scanner.nextLine());

            switch (userChoice){
                case 1 -> {
                    System.out.println("What kind of jewelry?");
                    String name = scanner.nextLine();

                    System.out.println("Number of Karats: ");
                    double karat = Double.parseDouble(scanner.nextLine());

                    System.out.println("Market Value:  $");
                    double marketValue = Double.parseDouble(scanner.nextLine());

                    System.out.println("Asset added");

                    portfolio.add(new Jewelry(name, karat, marketValue));

                }

                case 2 -> {
                    System.out.println("What type of Gold: ");
                    String name = scanner.nextLine();

                    System.out.println("Enter the weight in ounces: ");
                    double weight = Double.parseDouble(scanner.nextLine());

                    System.out.println("Enter Market Value");
                    double marketValue = Double.parseDouble(scanner.nextLine());

                    System.out.println("Asset added");
                    portfolio.add(new Gold(name, weight, marketValue));
                }

                case 3 -> {
                    System.out.println("Name on Deed of House: ");
                    String name = scanner.nextLine();

                    System.out.println("Market Value: ");
                    double marketValue = Double.parseDouble(scanner.nextLine());

                    System.out.println("Enter Year of Build: ");
                    int year = Integer.parseInt(scanner.nextLine());

                    System.out.println("How Many Square Feet?: ");
                    int squareFeet = Integer.parseInt(scanner.nextLine());

                    System.out.println("Number of Bedrooms: ");
                    int bedrooms = Integer.parseInt(scanner.nextLine());

                    System.out.println("Asset added");
                    portfolio.add(new House(name, marketValue,year, squareFeet, bedrooms));
                }
                case 4 -> {
                    System.out.println("Name on account: ");
                    String name = scanner.nextLine();

                    System.out.println("Account Number: ");
                    int account = Integer.parseInt(scanner.nextLine());

                    System.out.println("Account Balance: $");
                    double balance = Double.parseDouble(scanner.nextLine());
                    portfolio.add(new BankAccount(name,account,balance));
                }
                case 5 -> {
                    System.out.println("Name on Account: ");
                    String name = scanner.nextLine();

                    System.out.println("Account Number: ");
                    int account = Integer.parseInt(scanner.nextLine());

                    System.out.println("Account Balance: $");
                    double balance = Double.parseDouble(scanner.nextLine());
                    portfolio.add(new CreditCard(name,account, balance));
                }
                case 6 -> {
                    System.out.println("Total Portfolio Value:  $" + portfolio.getValue());
                    System.out.println("Most Valuable Asset: $" + portfolio.getMostValuable());
                    System.out.println("Least Valuable Asset: $" + portfolio.getLeastValuable());
                }
                case 7 -> appRunning = false;
                default -> System.out.println("Invalid Option. Please Try Again");
            }

        }
        scanner.close();
        System.out.println("Thank you. Have a Good Day");


    }
}
