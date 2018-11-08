package com.example.customer.domain;

import java.time.LocalDateTime;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.rest.core.annotation.RestResource;

@Document
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Customer {

  @Id
  public ObjectId id;
  private String name;
  private LocalDateTime lastAccess;

  @DBRef
  @RestResource(path = "customerAccesses", rel="accesses")
  private List<Access> accesses;

}
