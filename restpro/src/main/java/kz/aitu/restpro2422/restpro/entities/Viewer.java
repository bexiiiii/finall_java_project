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
@Table(name = "viewer")
public class Viewer {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", updatable = false, nullable = false)
    private int id;

    @Column(unique = true)
    private String name;
    private int age;

    private Integer version;

    public Viewer(int id, String name, int age, Integer version) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.version = version;
    }

    public Viewer() {
        // Конструктор по умолчанию
    }

    @Override
    public String toString() {
        return "viewer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", version=" + version +
                '}';
    }
}
