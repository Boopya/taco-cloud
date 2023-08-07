package com.example.tacocloud.data;

import org.springframework.data.repository.CrudRepository;

import com.example.tacocloud.Ingredient;

// JPA
public interface IngredientRepository extends CrudRepository<Ingredient, String> {
    
    // Iterable<Ingredient> findAll();

    // Ingredient findById(String id);

    // Ingredient save(Ingredient ingredient);
}
