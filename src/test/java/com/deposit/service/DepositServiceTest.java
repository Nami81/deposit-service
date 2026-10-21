package com.deposit.service;

import com.deposit.model.Customer;
import com.deposit.model.Deposit;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class DepositServiceTest {

    @Test
    void calculateSimpleInterest_returnsCorrectInterest() {

        //Customer customer = new Customer(1, "Test", "User", "00000000000");
        //Deposit deposit = new Deposit(1, new BigDecimal("500.5"), 6, new BigDecimal("3"), "GEL", LocalDate.now(), customer);
        Deposit deposit = createDeposit("500.5", 6, "3");
        DepositService depositService = new DepositService();

        BigDecimal result = depositService.calculateSimpleInterest(deposit);


        assertEquals(new BigDecimal("7.51"), result);



    }

    private Deposit createDeposit(String amount, int termMonths, String rate){
        Customer customer = new Customer(1, "Test", "User", "00000000000");
        return new Deposit(1, new BigDecimal(amount), termMonths, new BigDecimal(rate), "GEL", LocalDate.now(), customer);


    }

}