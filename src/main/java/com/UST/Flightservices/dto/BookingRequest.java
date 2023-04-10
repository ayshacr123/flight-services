package com.UST.Flightservices.dto;


import com.UST.Flightservices.entity.Passengerinfo;
import com.UST.Flightservices.entity.PaymentInfo;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BookingRequest {
    private Passengerinfo passangerinfo;
    private PaymentInfo paymentInfo;
}
