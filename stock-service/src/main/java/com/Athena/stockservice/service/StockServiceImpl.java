package com.Athena.stockservice.service;

import com.Athena.stockservice.dto.StockWrapper;
import org.springframework.stereotype.Service;
import yahoofinance.YahooFinance;

/**
 * @author Wayne Sidney
 * Created on {18/08/2022}
 */
@Service
public class StockServiceImpl implements StockService{
    @Override
    public StockWrapper findStock(String symbol) {
        try{
            return new StockWrapper(YahooFinance.get(symbol));
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        return null;
    }
}
