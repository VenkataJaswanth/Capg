package com.capgemini.Assignment.Controller;

import com.capgemini.Assignment.Service.ProductService;
import com.capgemini.Assignment.bean.Product;
import com.capgemini.Assignment.bean.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {
    @Autowired
    ProductService productService;

    @GetMapping("/getallproducts")
    List<Product> getAllProd()
    {
        System.out.println("From Getallproducts Method.");
        List<Product> productList=productService.getAllProducts();
        return productList;
    }

    @GetMapping("/getproduct/{prodid}")
    Product getprod(@PathVariable("prodid") int prodId)
    {
        System.out.println("From Get Product Method.");
        return productService.getProd(prodId);
    }

    @PostMapping("/addproduct")
    Product addProd(@RequestBody Product product)
    {
        System.out.println("From Add Product Method.");
        return productService.addProd(product);
    }

    @PutMapping("/updateproduct")
    Product updateProd(@RequestBody Product product)
    {
        System.out.println("From Update Product Method.");
        return productService.updateProd(product);
    }

    @DeleteMapping("/deleteproduct/{prodid}")
    void deleteProd(@PathVariable("prodid") int prodId)
    {
        System.out.println("From Delete Product Method.");
        productService.deleteProd(prodId);
    }
}
