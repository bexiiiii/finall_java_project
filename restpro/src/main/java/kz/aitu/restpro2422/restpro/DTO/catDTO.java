package kz.aitu.restpro2422.restpro.DTO;

import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class catDTO {
    String name;
    int weight;
    int age;



}
