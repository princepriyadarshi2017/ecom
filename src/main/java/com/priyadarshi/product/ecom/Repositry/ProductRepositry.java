package com.priyadarshi.product.ecom.Repositry;

import com.priyadarshi.product.ecom.model.Product;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductRepositry extends MongoRepository<Product,String> {

}
