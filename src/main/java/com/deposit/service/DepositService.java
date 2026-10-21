package com.deposit.service;

import com.deposit.exception.InvalidDepositException;
import com.deposit.model.Deposit;
import com.deposit.model.DepositStatus;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.LocalDate;

public class DepositService {


    public BigDecimal calculateSimpleInterest(Deposit deposit){

        BigDecimal amountTimesInterest = deposit.getAmount().multiply(deposit.getInterestRate());
        BigDecimal term = BigDecimal.valueOf(deposit.getTermMonths());
        BigDecimal amountInterestTerm = amountTimesInterest.multiply(term);
        return (amountInterestTerm.divide(BigDecimal.valueOf(1200), 2, RoundingMode.HALF_UP));

    }

    public BigDecimal calculateTotalAmount(Deposit deposit){
        BigDecimal totalAmount = deposit.getAmount().add(calculateSimpleInterest(deposit));
        return totalAmount;
    }

    public BigDecimal closeDeposit(Deposit deposit, LocalDate closeDate){

        if(deposit.getStatus() != DepositStatus.ACTIVE){
            throw new InvalidDepositException("Deposit is not active");
        } else if (closeDate.isBefore(deposit.getMaturityDate())) {
            deposit.close();
            return deposit.getAmount();
        }else {
            deposit.close();
        }
        return calculateTotalAmount(deposit);
    }

}