package com.scaler.bookmyshow.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Theatre extends BaseModel {

    @ManyToOne
    @JoinColumn(name = "city_id")
    @JsonIgnore
    private City city;

    private String name;
    private String address;

    @OneToMany
    private List<Hall> halls = new ArrayList<>();

    @OneToMany
    private List<Show> shows = new ArrayList<>();
}

// 1. Which is the parent entity