package com.example.ecom.resource;

import java.util.List;

import com.example.ecom.dto.ProductDTO;
import com.example.ecom.service.ProductService;

import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/products")
public class ProductResource {

    private ProductService productService;

    @Inject
    public ProductResource(ProductService productService) {
        this.productService = productService;
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<ProductDTO> getAllProducts() {
        return productService.getAllProducts();
    }
}

