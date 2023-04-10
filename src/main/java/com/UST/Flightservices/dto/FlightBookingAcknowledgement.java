package com.UST.Flightservices.dto;


import com.UST.Flightservices.entity.Passengerinfo;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;



@Data
@AllArgsConstructor
@NoArgsConstructor
public class FlightBookingAcknowledgement {
    private String status;
    private double amount;
    private String pnrNo;
    private Passengerinfo passangerinfo;

}
