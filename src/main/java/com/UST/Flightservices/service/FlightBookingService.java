package com.UST.Flightservices.service;

import com.UST.Flightservices.dto.BookingRequest;
import com.UST.Flightservices.dto.FlightBookingAcknowledgement;
import com.UST.Flightservices.entity.Passengerinfo;
import com.UST.Flightservices.entity.PaymentInfo;
import com.UST.Flightservices.exception.InsufficentAmountException;
import com.UST.Flightservices.repo.PassengerRepo;
import com.UST.Flightservices.repo.PaymentRepo;
import com.UST.Flightservices.utils.PaymentUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.UUID;

@Service
public class FlightBookingService {

    @Autowired
    public PassengerRepo passengerRepo;
    @Autowired
    public PaymentRepo paymentRepo;
    @Transactional
    public FlightBookingAcknowledgement bookingFlightTicket(BookingRequest request) throws InsufficentAmountException {
        Passengerinfo passengerinfo = request.getPassangerinfo();
        passengerinfo=passengerRepo.save(passengerinfo);
        PaymentInfo paymentinfo = request.getPaymentInfo();
        PaymentUtils.validateCreditLimit(paymentinfo.getAccountNumber(),passengerinfo.getFare());
        paymentinfo.setPassengerId(passengerinfo.getPId());
        paymentinfo.setAmount(passengerinfo.getFare());
        paymentRepo.save(paymentinfo);

        return new FlightBookingAcknowledgement("success",passengerinfo.getFare(),
                UUID.randomUUID().toString().split("-")[0],passengerinfo);

    }
}
