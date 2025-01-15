package com.example.ecommerce.service.product;


import com.example.ecommerce.entity.Product;

import java.util.List;

public interface IProductService {
    Product getProduct(String productId);
    List<Product> getAllProducts();
    Product addProduct(Product product);
    Product updateProduct(Product product);
    void deleteProduct(String productId);
}
