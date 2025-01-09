package com.vijay.bookmyshow.models;

import jakarta.persistence.Entity;
import lombok.Data;

@Entity
@Data
public class Region extends BaseModel {
    private String name;

}
