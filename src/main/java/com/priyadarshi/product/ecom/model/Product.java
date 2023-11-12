package com.priyadarshi.product.ecom.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(value ="product") //this is for MongoDb Document
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class Product {
    @Id //to specify that this is a unique identifier for the product
    private String id;
    private String name;
    private String description;
    private String price;
}
