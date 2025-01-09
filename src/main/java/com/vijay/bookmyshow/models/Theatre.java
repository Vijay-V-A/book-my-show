package com.vijay.bookmyshow.models;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.Data;

import java.util.List;

@Entity
@Data
public class Theatre extends BaseModel {
    private String name;
    private String address;

    @OneToMany
    private List<Screen> screens;

    @ManyToOne
    private Region region;

}
