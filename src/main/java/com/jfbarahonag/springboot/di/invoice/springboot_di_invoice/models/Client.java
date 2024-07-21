package com.jfbarahonag.springboot.di.invoice.springboot_di_invoice.models;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.RequestScope;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Component
@RequestScope 
@JsonIgnoreProperties({"targetSource", "advisors"})
public class Client {
  @Value("${client.id}")
  private Long id;
  
  @Value("${client.firstname}")
  private String firstName;
  
  @Value("${client.lastname}")
  private String lastName;
  
  @Value("${client.documentid}")
  private String documentId;

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public String getDocumentId() {
    return documentId;
  }

  public void setDocumentId(String documentId) {
    this.documentId = documentId;
  }
}
