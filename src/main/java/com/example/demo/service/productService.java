package com.example.demo.service;

import com.example.demo.model.Productos;
import com.example.demo.repository.productRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class productService {
    @Autowired
    private productRepository productrepository;


    public List<Productos> getProduct(){
        return productrepository.findAll();
    }

    public Productos saveProduct(Productos productos){
        return productrepository.save(productos);

    }

    public Productos productosupdate(Productos productos){
       Productos pr=productrepository.findById(productos.getId()).orElse(null);
       pr.setNombre(pr.getNombre());
        pr.setPrecio(pr.getPrecio());
        pr.setCategoria(pr.getCategoria());
return  productrepository.save(productos);
    }

    public String deleteProducts(Integer id){
         productrepository.deleteById(id);
         return "product remove"+id;

    }


}
