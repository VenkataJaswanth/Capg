package com.capgemini.Assignment.Repository;

import com.capgemini.Assignment.bean.Product;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ProductRepository extends CrudRepository<Product,Integer>
{
        List<Product> findByName(String name);
}
