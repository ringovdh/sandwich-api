package be.faros.sandwich.api.dto.response;

import be.faros.sandwich.api.dto.SandwichDTO;

import java.util.List;

public record SandwichResponse(
        List<SandwichDTO> sandwiches) { }
