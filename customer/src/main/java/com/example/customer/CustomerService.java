package com.example.customer;

import com.example.customer.domain.Customer;
import com.example.customer.repository.CustomerRepository;
import java.time.LocalDateTime;
import lombok.AllArgsConstructor;
import org.springframework.data.rest.webmvc.ResourceNotFoundException;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class CustomerService {

  private final CustomerRepository customerRepository;

  public void updateLastAccess(String id) {
    Customer customer = customerRepository.findById(id)
        .orElseThrow(() -> new ResourceNotFoundException("Customer " + id + " not found"));
    customer.setLastAccess(LocalDateTime.now());
    customerRepository.save(customer);
  }

}
