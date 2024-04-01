package com.scaler.bookmyshow.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.scaler.bookmyshow.enums.SeatType;
import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class Seat extends BaseModel {

    private Integer rowNo;
    private Integer columnNo;
    @Enumerated
    private SeatType seatType;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "hall_id")
    @JsonIgnore
    private Hall hall;

}