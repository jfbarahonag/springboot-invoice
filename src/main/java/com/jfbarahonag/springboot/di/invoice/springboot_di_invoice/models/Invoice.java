package com.jfbarahonag.springboot.di.invoice.springboot_di_invoice.models;

import java.util.List;

public class Invoice {
  private Client client;
  private String description;
  private List<InvoiceItem> items;

  public Client getClient() {
    return client;
  }

  public void setClient(Client client) {
    this.client = client;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public List<InvoiceItem> getItems() {
    return items;
  }

  public void setItems(List<InvoiceItem> items) {
    this.items = items;
  }
}
