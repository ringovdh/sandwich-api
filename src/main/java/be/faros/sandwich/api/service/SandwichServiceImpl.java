package be.faros.sandwich.api.service;

import be.faros.sandwich.api.dto.SandwichDTO;
import be.faros.sandwich.api.mapper.SandwichMapper;
import be.faros.sandwich.api.repository.SandwichRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SandwichServiceImpl implements SandwichService {

    private final SandwichRepository sandwichRepository;

    @Autowired
    public SandwichServiceImpl(SandwichRepository sandwichRepository) {
        this.sandwichRepository = sandwichRepository;
    }

    @Override
    public List<SandwichDTO> getSandwiches() {
        return sandwichRepository.findAll().stream()
                .map(SandwichMapper::mapSandwichToDTO).toList();
    }

}
