package be.faros.sandwich.api.dto;

import java.util.List;

public record SandwichDTO(
        int id,
        String name,
        List<IngredientDTO> ingredients,
        double price) { }
