package com.springboot.jpa.data.dao.impl;

import com.springboot.jpa.data.dao.ProductDAO;
import com.springboot.jpa.data.entity.Product;
import com.springboot.jpa.data.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class ProductDAOImpl implements ProductDAO {

    //DI
    private final ProductRepository productRepository;

    //Product : Create
    @Override
    public Product insertProduct(Product product) {
        Product savedProduct = productRepository.save(product);
        return savedProduct;
    }

    //Product : Read
    @Override
    public Product selectProduct(Long number) {
        Product selectedProduct = productRepository.findById(number).get();

        return selectedProduct;
    }

    //Product : Update
    @Override
    public Product updateProductName(Long number, String name) throws Exception {

        Product foundedProduct = productRepository.findById(number).get();
        foundedProduct.setName(name);

        Product updatedProduct = productRepository.save(foundedProduct);

        return updatedProduct;
    }

    //Product : Delete
    @Override
    public void deleteProduct(Long number) throws Exception {

        productRepository.deleteById(number);

    }
}
