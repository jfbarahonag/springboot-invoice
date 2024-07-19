package com.jfbarahonag.springboot.di.invoice.springboot_di_invoice.models;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Invoice {

  @Autowired
  private Client client;

  @Value("${invoice.description.market}")
  private String description;

  @Autowired
  @Qualifier("itemsMarket")
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

  public Long getTotal() {
    return items.stream()
        .mapToLong(InvoiceItem::getAmount)
        .sum();
  }
}
