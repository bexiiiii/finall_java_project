package kz.aitu.restpro2422.restpro.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import kz.aitu.restpro2422.restpro.entities.Cinema;
import kz.aitu.restpro2422.restpro.entities.Movie;
import kz.aitu.restpro2422.restpro.entities.Viewer;
import kz.aitu.restpro2422.restpro.repositroy.CinemaRepo;
import kz.aitu.restpro2422.restpro.repositroy.MovieRepo;
import kz.aitu.restpro2422.restpro.repositroy.ViewerRepo;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("/api")
public class MainController {

    private final CinemaRepo cinemaRepo;
    private final MovieRepo movieRepo;
    private final ViewerRepo viewerRepo;
    private final ObjectMapper objectMapper;

    // *** CINEMA ***
    @PostMapping("/cinema/add")
    public String addCinema(@RequestBody Cinema cinema) {
        try {
            cinemaRepo.save(cinema);
            return "Cinema added successfully!";
        } catch (Exception e) {
            return "Error: " + e.getMessage();
        }
    }

    @GetMapping("/cinema/all")
    public List<Cinema> getAllCinemas() {
        return cinemaRepo.findAll();
    }

    @GetMapping("/cinema")
    public Optional<Cinema> getCinema(@RequestParam int id) {
        return cinemaRepo.findById(id);
    }

    @DeleteMapping("/cinema")
    public String deleteCinema(@RequestParam int id) {
        if (cinemaRepo.existsById(id)) {
            cinemaRepo.deleteById(id);
            return "Cinema deleted successfully!";
        }
        return "Cinema not found!";
    }

    @PutMapping("/cinema/update")
    public String updateCinema(@RequestBody Cinema cinema) {
        if (!cinemaRepo.existsById(cinema.getId())) {
            return "Cinema not found!";
        }
        cinemaRepo.save(cinema);
        return "Cinema updated successfully!";
    }

    // *** MOVIE ***
    @PostMapping("/movie/add")
    public String addMovie(@RequestBody Movie movie) {
        try {
            movieRepo.save(movie);
            return "Movie added successfully!";
        } catch (Exception e) {
            return "Error: " + e.getMessage();
        }
    }

    @GetMapping("/movie/all")
    public List<Movie> getAllMovies() {
        return movieRepo.findAll();
    }

    @GetMapping("/movie")
    public Optional<Movie> getMovie(@RequestParam int id) {
        return movieRepo.findById(id);
    }

    @DeleteMapping("/movie")
    public String deleteMovie(@RequestParam int id) {
        if (movieRepo.existsById(id)) {
            movieRepo.deleteById(id);
            return "Movie deleted successfully!";
        }
        return "Movie not found!";
    }

    @PutMapping("/movie/update")
    public String updateMovie(@RequestBody Movie movie) {
        if (!movieRepo.existsById(movie.getId())) {
            return "Movie not found!";
        }
        movieRepo.save(movie);
        return "Movie updated successfully!";
    }

    // *** VIEWER ***
    @PostMapping("/viewer/add")
    public String addViewer(@RequestBody Viewer viewer) {
        try {
            viewerRepo.save(viewer);
            return "Viewer added successfully!";
        } catch (Exception e) {
            return "Error: " + e.getMessage();
        }
    }

    @GetMapping("/viewer/all")
    public List<Viewer> getAllViewers() {
        return viewerRepo.findAll();
    }

    @GetMapping("/viewer")
    public Optional<Viewer> getViewer(@RequestParam int id) {
        return viewerRepo.findById(id);
    }

    @DeleteMapping("/viewer")
    public String deleteViewer(@RequestParam int id) {
        if (viewerRepo.existsById(id)) {
            viewerRepo.deleteById(id);
            return "Viewer deleted successfully!";
        }
        return "Viewer not found!";
    }

    @PutMapping("/viewer/update")
    public String updateViewer(@RequestBody Viewer viewer) {
        if (!viewerRepo.existsById(viewer.getId())) {
            return "Viewer not found!";
        }
        viewerRepo.save(viewer);
        return "Viewer updated successfully!";
    }


}
