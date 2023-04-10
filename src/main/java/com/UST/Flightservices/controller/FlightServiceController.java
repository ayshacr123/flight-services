package com.UST.Flightservices.controller;


import com.UST.Flightservices.dto.BookingRequest;
import com.UST.Flightservices.dto.FlightBookingAcknowledgement;
import com.UST.Flightservices.exception.InsufficentAmountException;
import com.UST.Flightservices.service.FlightBookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FlightServiceController {
    @Autowired
    private FlightBookingService flightBookingService;

    @PostMapping("/booking")
    public FlightBookingAcknowledgement bookingAcknowledgement(@RequestBody BookingRequest request) throws InsufficentAmountException {
        return flightBookingService.bookingFlightTicket(request);
    }


}
