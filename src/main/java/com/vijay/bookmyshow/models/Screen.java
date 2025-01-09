package com.vijay.bookmyshow.models;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Data
public class Screen extends BaseModel {
    private String name;

    @OneToMany
    private List<Seat> seats;

    @Enumerated(value = EnumType.ORDINAL)
    @ElementCollection(fetch = FetchType.EAGER)
    private  List<Features> features;
}
