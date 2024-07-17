package com.jfbarahonag.springboot.di.invoice.springboot_di_invoice.models;

public class Product {

  public Product() {
  }

  public Product(String name, String sku, Long price) {
    this.name = name;
    this.sku = sku;
    this.price = price;
  }

  private String name;

  private String sku;

  private Long price;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getSku() {
    return sku;
  }

  public void setSku(String sku) {
    this.sku = sku;
  }

  public Long getPrice() {
    return price;
  }

  public void setPrice(Long price) {
    this.price = price;
  }
}
