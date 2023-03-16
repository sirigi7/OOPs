package stockmanagement;


import java.util.ArrayList;
import java.util.Scanner;

public class Stock {
    private String name;
    private int numOfShares;
    private double price;

    public Stock(String name, int numOfShares, double price) {
        this.name = name;
        this.numOfShares = numOfShares;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getNumOfShares() {
        return numOfShares;
    }

    public double getPrice() {
        return price;
    }

    public double getValue() {
        return numOfShares * price;
    }

    @Override
    public String toString() {
        return name + ": " + numOfShares + " shares at $" + price + " per share";
    }
}

class StockPortfolio {
    private ArrayList<Stock> stocks;

    public StockPortfolio() {
        stocks = new ArrayList<>();
    }

    public void addStock(Stock stock) {
        stocks.add(stock);
    }

    public double getTotalValue() {
        double totalValue = 0.0;

        for (Stock stock : stocks) {
            totalValue += stock.getValue();
        }

        return totalValue;
    }

    public void printStockReport() {
        System.out.println("STOCK REPORT");
        System.out.println("--------------------------------------------------");

        for (Stock stock : stocks) {
            double value = stock.getValue();
            System.out.printf("%-20s $%.2f%n", stock, value);
        }

        System.out.println("--------------------------------------------------");

        double totalValue = getTotalValue();
        System.out.printf("%-20s $%.2f%n", "Total Value", totalValue);
    }
}

