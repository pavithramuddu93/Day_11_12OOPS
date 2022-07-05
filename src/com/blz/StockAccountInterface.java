package com.blz;

public class StockAccountInterface {
    double valueOf();

    void buy(int amount, String symbol);

    void sell(int amount, String symbol);

    void printReport();

}
