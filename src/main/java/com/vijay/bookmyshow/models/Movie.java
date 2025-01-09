package com.vijay.bookmyshow.models;

import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.Data;

import java.util.List;

@Entity
@Data
public class Movie extends BaseModel {

    private String name;
    private int duration;
    private String genre;
    private  double rating;

    @ElementCollection
    @Enumerated(value = EnumType.ORDINAL)
    private List<Features> features;

    @ElementCollection
    @Enumerated(value = EnumType.ORDINAL)
    private List<Language> languages;

    @ElementCollection
    private List<String> actors;

}
