package com.UST.Flightservices.repo;

import com.UST.Flightservices.entity.PaymentInfo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaymentRepo extends JpaRepository<PaymentInfo, String> {

}
