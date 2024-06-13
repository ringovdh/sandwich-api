package be.faros.sandwich.api.controller;

import be.faros.sandwich.api.dto.SandwichDTO;
import be.faros.sandwich.api.service.SandwichService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/sandwiches")
public class SandwichControllerImpl implements SandwichController {

    private final SandwichService sandwichService;

    @Autowired
    public SandwichControllerImpl(SandwichService sandwichService) {
        this.sandwichService = sandwichService;
    }


    @Override
    @GetMapping()
    public ResponseEntity<List<SandwichDTO>> getSandwiches() {
        return ResponseEntity.ok(sandwichService.getSandwiches());
    }
}
