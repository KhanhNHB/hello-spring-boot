package com.khanhnhb.springboot.hellospringboot.service;

import com.khanhnhb.springboot.hellospringboot.dao.PaymentDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PaymentServiceImpl implements PaymentService {

    @Autowired
    private PaymentDao paymentDao;

    public PaymentDao getPaymentDao() {
        return paymentDao;
    }

    public void setPaymentDao(PaymentDao paymentDao) {
        this.paymentDao = paymentDao;
    }

    @Override
    public double sumOfTwoNumber(double numberOne, double numberTwo) {
        return numberOne + numberTwo;
    }
}
