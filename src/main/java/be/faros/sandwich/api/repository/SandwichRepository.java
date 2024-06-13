package be.faros.sandwich.api.repository;

import be.faros.sandwich.api.entity.Sandwich;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SandwichRepository extends JpaRepository<Sandwich, Integer> {

}
