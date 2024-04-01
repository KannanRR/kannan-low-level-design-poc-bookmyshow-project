package com.scaler.bookmyshow.dtos;

import com.scaler.bookmyshow.enums.MovieFeature;
import com.scaler.bookmyshow.enums.SeatType;
import lombok.Data;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Data
public class CreateTestbRequest {
    private String bname;
    private Long testaid;
}