package kz.aitu.restpro2422.restpro.repositroy;

import kz.aitu.restpro2422.restpro.entities.Cinema;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CinemaRepo extends JpaRepository<Cinema, Integer> {
}

