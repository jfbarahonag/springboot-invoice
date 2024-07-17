package com.jfbarahonag.springboot.di.invoice.springboot_di_invoice;

import java.util.Arrays;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import com.jfbarahonag.springboot.di.invoice.springboot_di_invoice.models.InvoiceItem;
import com.jfbarahonag.springboot.di.invoice.springboot_di_invoice.models.Product;

@Configuration
@PropertySource("classpath:data.properties")
public class AppConfig {

  @Bean
  List<InvoiceItem> invoiceItems() {

    Product p1 = new Product("Camera", "AK1234", 2500L);
    Product p2 = new Product("Headset", "ER2921", 500L);

    return Arrays.asList(
        new InvoiceItem(p1, 2),
        new InvoiceItem(p2, 3));
  }
}
