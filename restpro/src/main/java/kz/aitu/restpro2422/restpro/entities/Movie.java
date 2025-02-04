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
@Table(name = "movie")
public class Movie {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", updatable = false, nullable = false)
    private int id;

    @Column(unique = true)
    private String title;
    private int year;
    private String genre;
    private int rating;
    private int duration;
    private int price;

    private Integer version;

    public Movie(int id, String title, int year, String genre, int rating, int duration, int price, Integer version) {
        this.id = id;
        this.title = title;
        this.year = year;
        this.genre = genre;
        this.rating = rating;
        this.duration = duration;
        this.price = price;
        this.version = version;
    }

    public Movie() {
        // Конструктор по умолчанию
    }

    @Override
    public String toString() {
        return "movie{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", year=" + year +
                ", genre='" + genre + '\'' +
                ", rating=" + rating +
                ", duration=" + duration +
                ", price=" + price +
                ", version=" + version +
                '}';
    }
}
