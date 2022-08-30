package com.Athena.stockservice.controller;

import com.Athena.stockservice.service.StockService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;

/**
 * @author Wayne Sidney
 * Created on {18/08/2022}
 */
@RestController
public class StockController {

    @Autowired
    private StockService stockService;

    @RequestMapping("/")
    public BigDecimal findStockPrice(){
        return stockService.findStock("GOOG").getStock().getQuote().getPrice();
    }
}
