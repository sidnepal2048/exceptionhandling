package com.exception.handling.in.java.exceptionhandling.model;

import lombok.Data;

@Data
public class Product {
    private Long id;
    private String productName;
    private int quantity;
    private double pricePerUnit;
}
