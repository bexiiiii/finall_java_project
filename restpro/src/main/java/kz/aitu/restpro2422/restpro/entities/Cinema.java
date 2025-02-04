package kz.aitu.restpro2422.restpro.entities;

import jakarta.persistence.*;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;


@Getter
@Setter
@ToString
@Entity
@Builder
@Table(name = "cinema")
public class Cinema {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", updatable = false, nullable = false)
    private int id;

    @Column(name = "cinema_name", unique = true)
    private String cinemaName;
    private String movies;
    private int tickets;
    private String bookings;

    private Integer version;

    public Cinema(int id, String cinemaName, String movies, int tickets, String bookings, Integer version) {
        this.id = id;
        this.cinemaName = cinemaName;
        this.movies = movies;
        this.tickets = tickets;
        this.bookings = bookings;
        this.version = version;
    }

    public Cinema() {
        // Конструктор по умолчанию
    }

    @Override
    public String toString() {
        return "cinema{" + "id=" + id + ", cinemaName='" + cinemaName + '\'' + ", movies='" + movies + '\'' + ", tickets=" + tickets + ", bookings='" + bookings + '\'' + ", version=" + version + '}';
    }
}
