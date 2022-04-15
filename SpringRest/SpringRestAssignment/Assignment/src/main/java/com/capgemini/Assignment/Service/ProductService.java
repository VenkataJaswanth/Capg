package com.capgemini.Assignment.Service;

import com.capgemini.Assignment.Repository.ProductRepository;
import com.capgemini.Assignment.bean.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductService {
    @Autowired
    ProductRepository repository;

    public List<Product> getAllProducts(){
        List<Product> prodList = new ArrayList<>();
        repository.findAll().forEach(x -> prodList.add(x));
        return prodList;
    }

    public Product getProd(int prodid)
    {
        List<Product> prodList = new ArrayList<>();
        Product product=new Product();
        repository.findById(prodid).get();
        return repository.findById(prodid).get();
    }

    public Product addProd(Product product){
        Product p1 = repository.save(product);
        return p1;
    }

    public Product updateProd(Product product){
        Product p2= repository.save(product);
        return p2;
    }

    public void deleteProd(int prodid)
    {
        repository.deleteById(prodid);
    }
}
