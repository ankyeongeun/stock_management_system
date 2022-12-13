package com.example.stock.domain;

import javax.persistence.Entity;

@Entity
public class Stock {

    private Long id;

    private Long productId;

    private Long quantity;

    public Stock() {

    }

}
