package com.capgemini.Assignment;

import com.capgemini.Assignment.Repository.ProductRepository;
import com.capgemini.Assignment.bean.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootAssignmentApplication1 implements CommandLineRunner {
    @Autowired
    private ProductRepository productRepository;

    public static void main(String[] args) {

        SpringApplication.run(SpringBootAssignmentApplication1.class, args);
    }

    @Override
    public void run(String... args) throws Exception
    {
        productRepository.save(new Product("Apple",10,150));
        productRepository.save(new Product("OnePlus9T",2,30000));
        productRepository.save(new Product("SamsungLED",1,40000));
        productRepository.save(new Product("Sony Ericsson",1,50000));

        System.out.println("\n========findall()========");
        productRepository.findAll().forEach(p-> System.out.println(p));

        System.out.println("\n========findbyid(1L)========");
        productRepository.findById(1).ifPresent(p-> System.out.println(p));

        System.out.println("\n========findbyname('SamsungLED')");
        productRepository.findByName("SamsungLED").forEach(p-> System.out.println(p));
    }

}
