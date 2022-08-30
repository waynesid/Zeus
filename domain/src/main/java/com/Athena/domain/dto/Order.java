package com.Athena.domain.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Wayne Sidney
 * Created on {19/08/2022}
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Order {
    private String orderId;
    private String name;
    private int quantity;
    private double price;
}
