package com.deposit;

import com.deposit.model.Deposit;
import java.math.BigDecimal;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Deposit deposit = new Deposit(1, new BigDecimal("500.5"),6,new BigDecimal(3), "GEL", LocalDate.now());

        System.out.println(deposit.getId());
        System.out.println(deposit.getAmount());
        System.out.println(deposit.getTermMonths());
        System.out.println(deposit.getInterestRate());
        System.out.println(deposit.getCurrency());
        System.out.println(deposit.getOpenDate());





    }
}
