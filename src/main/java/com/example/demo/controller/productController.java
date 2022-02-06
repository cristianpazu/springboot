package com.example.demo.controller;

import com.example.demo.model.Productos;
import com.example.demo.service.productService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class productController {

    @Autowired
    private productService productService;

    @GetMapping("/get")
    public List<Productos> findAll(){
        return productService.getProduct();
    }

    @PostMapping("/addproduct")
    public Productos addpro(@RequestBody Productos productos){
        return  productService.saveProduct(productos);

    }

    @DeleteMapping("/delete/{id}")
    public String deleteProduct(@PathVariable Integer id){
   return productService.deleteProducts(id);
    }
    @PutMapping
    public Productos updateProductos(@RequestBody Productos productos){
        return productService.saveProduct(productos);
    }

}
