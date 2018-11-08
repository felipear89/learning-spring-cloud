package com.example.customer.controller;

import com.example.customer.CustomerService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@AllArgsConstructor
@RestController
@RequestMapping("/api/customers")
public class CustomerController {

  private final CustomerService customerService;

  @ResponseStatus(code = HttpStatus.OK)
  @PutMapping("/{id}/update")
  public void hello(@PathVariable String id) {
    customerService.updateLastAccess(id);
  }

}
