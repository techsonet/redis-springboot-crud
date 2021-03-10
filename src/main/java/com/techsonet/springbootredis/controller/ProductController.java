package com.techsonet.springbootredis.controller;

import com.techsonet.springbootredis.entity.Product;
import com.techsonet.springbootredis.repository.ProductDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/product")
public class ProductController {

    @Autowired
    ProductDao productDao;

    @PostMapping
    public Product save(@RequestBody Product product){
       return productDao.save(product);
    }

    @GetMapping
    public List<Product> getAllProduct(){
     return productDao.findAll();
    }

    @GetMapping("/{id}")
    public Product getById(@PathVariable int id){
        return productDao.findById(id);
    }

    @DeleteMapping("/{id}")
    public String remove(@PathVariable int id){
        return productDao.deleteProduct(id);
    }


}
