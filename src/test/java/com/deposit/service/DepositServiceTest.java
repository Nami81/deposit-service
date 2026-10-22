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

        Deposit deposit = createDeposit("500.5", 6, "3");
        DepositService depositService = new DepositService();

        BigDecimal result = depositService.calculateSimpleInterest(deposit);
        assertEquals(new BigDecimal("7.51"), result);



    }

    @Test
    void calculateSimpleInterest_roundsToTwoDecimals(){
        DepositService depositService = new DepositService();
        Deposit deposit = createDeposit("1000", 5, "7");
        BigDecimal roundedSimpleInterest = depositService.calculateSimpleInterest(deposit);
        assertEquals(new BigDecimal("29.17"), roundedSimpleInterest, "Interest should be rounded to two decimals");

    }

    @Test
    void calculateTotalAmount_addsInterestToPrincipal(){
        DepositService depositService = new DepositService();
        Deposit deposit = createDeposit("1000", 5, "7");
        BigDecimal totalAmount = depositService.calculateTotalAmount(deposit);
        assertEquals(new BigDecimal("1029.17"), totalAmount, "Invalid total amount");
    }

    private Deposit createDeposit(String amount, int termMonths, String rate){
        Customer customer = new Customer(1, "Test", "User", "00000000000");
        return new Deposit(1, new BigDecimal(amount), termMonths, new BigDecimal(rate), "GEL", LocalDate.now(), customer);


    }

}