package be.faros.sandwich.api.mapper;

import be.faros.sandwich.api.dto.SandwichDTO;
import be.faros.sandwich.api.entity.Sandwich;

public class SandwichMapper {


    public static SandwichDTO mapSandwichToDTO(Sandwich sandwich) {
        return new SandwichDTO(
                sandwich.getId(),
                sandwich.getName(),
                sandwich.getProductRef(),
                sandwich.getIngredients().stream()
                        .map(IngredientMapper::mapIngredientToDTO).toList(),
                sandwich.getPrice());
    }
}
