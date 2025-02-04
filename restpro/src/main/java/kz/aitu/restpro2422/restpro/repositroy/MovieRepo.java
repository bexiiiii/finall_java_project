package kz.aitu.restpro2422.restpro.repositroy;

import kz.aitu.restpro2422.restpro.entities.Movie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MovieRepo extends JpaRepository<Movie, Integer> {
}