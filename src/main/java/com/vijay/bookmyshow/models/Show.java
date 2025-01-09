package com.vijay.bookmyshow.models;

import jakarta.persistence.Entity;
import lombok.Data;

import java.util.Date;
import java.util.List;

@Entity
@Data
public class Show extends BaseModel {

    private Date date;
    private int duration;
    private Movie movie;
    private Theatre theatre;
    private  Screen screen;
    private List<ShowSeat> showSeats;
    private List<ShowSeatType> showSeatTypes;
}
