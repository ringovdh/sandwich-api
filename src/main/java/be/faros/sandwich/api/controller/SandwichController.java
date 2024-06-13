package be.faros.sandwich.api.controller;

import be.faros.sandwich.api.dto.SandwichDTO;
import be.faros.sandwich.api.dto.response.SandwichResponse;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface SandwichController {

    ResponseEntity<List<SandwichDTO>> getSandwiches();
}
