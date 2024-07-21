package com.jfbarahonag.springboot.di.invoice.springboot_di_invoice.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jfbarahonag.springboot.di.invoice.springboot_di_invoice.models.Client;
import com.jfbarahonag.springboot.di.invoice.springboot_di_invoice.models.Invoice;

@RestController
@RequestMapping("/api/v1/invoices")
public class InvoiceController {

  @Autowired
  private Invoice invoice;
  
  @GetMapping("/single")
  public Invoice getInvoice() {
    
    Client cli = new Client();
    cli.setId(invoice.getClient().getId());
    cli.setDocumentId(invoice.getClient().getDocumentId());
    cli.setFirstName(invoice.getClient().getFirstName());
    cli.setLastName(invoice.getClient().getLastName());
    
    Invoice inv = new Invoice();
    inv.setClient(cli);
    inv.setDescription(invoice.getDescription());
    inv.setItems(invoice.getItems());
    
    return inv;
  }
}
