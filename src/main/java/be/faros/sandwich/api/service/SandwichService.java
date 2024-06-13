package be.faros.sandwich.api.service;

import be.faros.sandwich.api.dto.SandwichDTO;

import java.util.List;

public interface SandwichService {

    List<SandwichDTO> getSandwiches();
}
