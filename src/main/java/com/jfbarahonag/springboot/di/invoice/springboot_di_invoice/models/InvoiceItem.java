package com.jfbarahonag.springboot.di.invoice.springboot_di_invoice.models;

public class InvoiceItem {
  
  private Product product;
  
  private Integer quantity;

  public InvoiceItem() {
  }
  
  public InvoiceItem(Product product, Integer quantity) {
    this.product = product;
    this.quantity = quantity;
  }

  public Product getProduct() {
    return product;
  }

  public void setProduct(Product product) {
    this.product = product;
  }

  public Integer getQuantity() {
    return quantity;
  }

  public void setQuantity(Integer quantity) {
    this.quantity = quantity;
  }

  public Long getAmount() {
    return product.getPrice() * quantity;
  }
}
