package com.Athena.stockservice.service;

import com.Athena.stockservice.dto.StockWrapper;

/**
 * @author Wayne Sidney
 * Created on {18/08/2022}
 */
public interface StockService {
    public StockWrapper findStock(String symbol);
}
