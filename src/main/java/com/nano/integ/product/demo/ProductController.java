package com.nano.integ.product.demo;

import org.springframework.web.bind.annotation.GetMapping; 
import org.springframework.web.bind.annotation.RestController;
import com.nano.integ.product.demo.ProductRepository;
import org.springframework.web.bind.annotation.CrossOrigin;
import java.util.Collection;
import java.util.stream.Collectors;

@RestController
class ProductController {
    private ProductRepository repository;

    public ProductController(ProductRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/checking-accounts")
    @CrossOrigin(origins = "http://localhost:4200")
    public Collection<Product> checkingAccounts() {
        return repository.findAll().stream()
                .filter(this::isChecking)
                .collect(Collectors.toList ());
    }

    @GetMapping("/saving-accounts")
    @CrossOrigin(origins = "http://localhost:4200")
    public Collection<Product> savingAccounts() {
        return repository.findAll().stream()
                .filter(this::isSaving)
                .collect(Collectors.toList());
    }

    private boolean isChecking(Product product) {
        return product.getName().contains("Checking");
    }

    private boolean isSaving(Product product) {
        return product.getName().contains("Saving");
    }
}