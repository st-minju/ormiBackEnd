package com.barabam.tdd_study;

import lombok.Getter;

@Getter
public class Product {
  private String name;
  private int price;

  public Product(String name, int price) {
    this.name = name;
    this.price = price;
  }
}
