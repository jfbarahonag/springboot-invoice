package com.jfbarahonag.springboot.di.invoice.springboot_di_invoice.models;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;

@Component
public class Invoice {

  @Autowired
  private Client client;

  @Value("${invoice.description.market}")
  private String description;

  @Autowired
  @Qualifier("itemsMarket")
  private List<InvoiceItem> items;

  public Invoice() {
    System.out.println("[Constructor] Creating the invoice component");
    System.out.println("[Constructor]" + " " + client);
    System.out.println("[Constructor]" + " " + description);
  }
  
  @PostConstruct
  public void init() {
    System.out.println("[PostConstruct] Creating the invoice component");
    System.out.println("[PostConstruct]" + " " + client);
    System.out.println("[PostConstruct]" + " " + description);
  }

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
