package com.priyadarshi.product.ecom.controller;

import com.priyadarshi.product.ecom.dto.ProductRequest;
import com.priyadarshi.product.ecom.dto.ProductResponse;
import com.priyadarshi.product.ecom.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/product")
@RequiredArgsConstructor //it will create construtor at runtime
public class ProductController {

    private final ProductService productService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void createProduct(@RequestBody ProductRequest productRequest){
        productService.createProduct(productRequest);

    }

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List <ProductResponse> getAllProducts() {
      return productService.getAllProducts();
    }


}
