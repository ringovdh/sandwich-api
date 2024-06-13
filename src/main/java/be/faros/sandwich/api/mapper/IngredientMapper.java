package be.faros.sandwich.api.mapper;

import be.faros.sandwich.api.dto.IngredientDTO;
import be.faros.sandwich.api.entity.Ingredient;

public class IngredientMapper {

    public static IngredientDTO mapIngredientToDTO(Ingredient ingredient) {
        return new IngredientDTO(
                ingredient.getId(),
                ingredient.getName()
        );
    }
}
