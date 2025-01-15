package com.example.ecommerce.controller;


import com.example.ecommerce.converter.GenericConverter;
import com.example.ecommerce.dto.ProductDto;
import com.example.ecommerce.entity.Product;
import com.example.ecommerce.product.ProductService;
import com.example.ecommerce.response.ApiResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
//@RequiredArgsConstructor
@RequestMapping("${api.prefix}/products")
public class ProductController {
    private final ProductService productService;
    private final GenericConverter genericConverter;

    public ProductController(ProductService productService, GenericConverter genericConverter) {
        this.productService = productService;
        this.genericConverter = genericConverter;
    }

    @GetMapping
    public ResponseEntity<ApiResponse> getAllProducts() {
        List<Product> allProducts = productService.getAllProducts();
        List<ProductDto> productDtos = genericConverter.convertToDtoList(allProducts, ProductDto.class);
//        return  ResponseEntity.ok(new ApiResponse("success", productDtos));
        return null;
    }

}
