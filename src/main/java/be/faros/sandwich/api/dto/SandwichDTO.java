package be.faros.sandwich.api.dto;

import java.util.List;

public record SandwichDTO(
        int id,
        String name,
        String productRef,
        List<IngredientDTO> ingredients,
        double price) { }
