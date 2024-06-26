package com.scaler.bookmyshow.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "shows")
@NoArgsConstructor
@Builder(toBuilder = true)
@AllArgsConstructor
public class Show extends BaseModel {

    @ManyToOne
    @JoinColumn(name = "movie_id")
    @JsonIgnore
    private Movie movie;
    private Date startTime;
    private Integer duration;

    @ManyToOne
    private Hall hall;

    @OneToMany(mappedBy = "show")
    private List<ShowSeat> showSeats = new ArrayList<>();
}