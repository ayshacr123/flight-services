package com.UST.Flightservices.utils;

import com.UST.Flightservices.exception.InsufficentAmountException;

import java.util.HashMap;
import java.util.Map;

public class PaymentUtils {

    private static Map<String, Double> paymentmap=new HashMap<>();
    static {
        paymentmap.put("acc1",20000.00);
        paymentmap.put("acc2",30000.00);
        paymentmap.put("acc3",15000.00);
        paymentmap.put("acc4",45000.00);
        paymentmap.put("acc5",80000.00);
        paymentmap.put("acc6",30000.00);
        paymentmap.put("acc7",13000.00);
        paymentmap.put("acc8",17000.00);
        paymentmap.put("acc9",40000.00);
        paymentmap.put("acc10",660000.00);

    }
    public static boolean validateCreditLimit(String accountNumber, double paidamount) throws InsufficentAmountException {
        if(paidamount>paymentmap.get(accountNumber)){
            throw new InsufficentAmountException("insufficent amount .........");
        }
        else{
            return true;
        }
    }
}
