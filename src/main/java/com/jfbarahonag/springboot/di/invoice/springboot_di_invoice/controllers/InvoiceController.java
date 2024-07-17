package com.jfbarahonag.springboot.di.invoice.springboot_di_invoice.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jfbarahonag.springboot.di.invoice.springboot_di_invoice.models.Invoice;

@RestController
@RequestMapping("/api/v1/invoices")
public class InvoiceController {

  @Autowired
  private Invoice invoice;
  
  @GetMapping("/single")
  public Invoice getInvoice() {
    return invoice;
  }
}
