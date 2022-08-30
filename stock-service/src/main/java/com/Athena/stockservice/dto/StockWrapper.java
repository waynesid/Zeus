package com.Athena.stockservice.dto;

import yahoofinance.Stock;

import java.time.LocalDateTime;

/**
 * @author Wayne Sidney
 * Created on {18/08/2022}
 */
public class StockWrapper {
    private final Stock stock;
    private final LocalDateTime currentTime;

    public StockWrapper(Stock stock) {
        this.stock = stock;
        this.currentTime = LocalDateTime.now();
    }

    public Stock getStock() {
        return stock;
    }

    public LocalDateTime getCurrentTime() {
        return currentTime;
    }
}
