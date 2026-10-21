package com.deposit.service;

import com.deposit.model.Deposit;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class DepositService {


    public BigDecimal calculateSimpleInterest(Deposit deposit){

        BigDecimal amountTimesInterest = deposit.getAmount().multiply(deposit.getInterestRate());
        BigDecimal term = BigDecimal.valueOf(deposit.getTermMonths());
        BigDecimal amountInterestTerm = amountTimesInterest.multiply(term);
        return (amountInterestTerm.divide(BigDecimal.valueOf(1200), 2, RoundingMode.HALF_UP));

    }
}