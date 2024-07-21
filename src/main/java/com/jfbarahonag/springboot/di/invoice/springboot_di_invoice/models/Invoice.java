package com.jfbarahonag.springboot.di.invoice.springboot_di_invoice.models;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.RequestScope;

// import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

@Component
@RequestScope
// @JsonIgnoreProperties({"targetSource", "advisors"}) //proxy attributes
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
    client.setFirstName("First name: ".concat(client.getFirstName().toUpperCase()));
    System.out.println("[PostConstruct] Creating the invoice component");
    System.out.println("[PostConstruct]" + " " + client.getFirstName());
    System.out.println("[PostConstruct]" + " " + description);
  }

  @PreDestroy
  public void finish() {
    System.out.println("[PreDestroy] Destroying Invoice component");
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
