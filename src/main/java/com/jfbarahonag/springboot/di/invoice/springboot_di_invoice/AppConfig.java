package com.jfbarahonag.springboot.di.invoice.springboot_di_invoice;

import java.util.Arrays;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.PropertySource;

import com.jfbarahonag.springboot.di.invoice.springboot_di_invoice.models.InvoiceItem;
import com.jfbarahonag.springboot.di.invoice.springboot_di_invoice.models.Product;

@Configuration
@PropertySource(value = "classpath:data.properties", encoding = "UTF-8")
public class AppConfig {

  @Bean
  List<InvoiceItem> invoiceItems() {

    Product p1 = new Product("Camera", "AK1234", 2500L);
    Product p2 = new Product("Headset", "ER2921", 500L);

    return Arrays.asList(
        new InvoiceItem(p1, 2),
        new InvoiceItem(p2, 3));
  }

  @Bean
  @Primary
  List<InvoiceItem> invoiceItemsMarket() {

    Product p1 = new Product("Rice x50g", "N/A", 5L);
    Product p2 = new Product("Butter", "N/A", 1L);
    Product p3 = new Product("Coffee x1000g", "N/A", 20L);

    return Arrays.asList(
        new InvoiceItem(p1, 5),
        new InvoiceItem(p2, 3),
        new InvoiceItem(p3, 4));
  }
}
