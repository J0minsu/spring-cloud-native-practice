package com.elevenst.controller.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/products")
public class ProductController {

    @GetMapping("/{productId}")
    public String getProduct(@PathVariable int productId) {

        return "[product id = " + productId + " at " + System.currentTimeMillis() + "]";
    }
}
