package stockmanagement;

import java.util.Scanner;

public class StockAccountManagement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of stocks: ");
        int n = scanner.nextInt();

        StockPortfolio portfolio = new StockPortfolio();

        for (int i = 1; i <= n; i++) {
            System.out.println("Enter the details of Stock " + i + ":");
            System.out.print("Name: ");
            String name = scanner.next();
            System.out.print("Number of shares: ");
            int numOfShares = scanner.nextInt();
            System.out.print("Price per share: ");
            double price = scanner.nextDouble();

            Stock stock = new Stock(name, numOfShares, price);
            portfolio.addStock(stock);
        }

        portfolio.printStockReport();
    }
}
