package com.nano.integ.product.demo;

import lombok.*;

import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.Entity;

@Entity
@Data
@NoArgsConstructor
public class Product {
    @Id @GeneratedValue
    private Long id;
    private @NonNull String name;

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }
    
    public String toString(){
        return this.name;
    }
}