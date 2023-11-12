package com.priyadarshi.product.ecom.service;

import com.priyadarshi.product.ecom.Repositry.ProductRepositry;
import com.priyadarshi.product.ecom.dto.ProductRequest;
import com.priyadarshi.product.ecom.dto.ProductResponse;
import com.priyadarshi.product.ecom.model.Product;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor //at the compile time it will create constructor (coming from lombook
@Slf4j //for logs (coming from lombook)
public class ProductService {

    private final ProductRepositry productRepositry;
    public void createProduct(ProductRequest productRequest){
        Product product =Product.builder()
                .name(productRequest.getName())
                .description(productRequest.getDescription())
                .price(String.valueOf(productRequest.getPrice()))
                .build();

        productRepositry.save(product); //this will save the data in database
        log.info("Product {} is saved",product.getId());
    }

    public List <ProductResponse> getAllProducts() {
        List<Product> products = productRepositry.findAll();
        return products.stream().map(product -> mapToProductResponse( product )).toList();
    }

    private ProductResponse mapToProductResponse(Product product) {
        return ProductResponse.builder()
                .id(product.getId())
                .name(product.getName())
                .description(product.getDescription())
                .price(product.getPrice())
                .build();

    }
}
