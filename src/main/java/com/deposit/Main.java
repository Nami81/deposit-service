package com.deposit;

import com.deposit.model.Customer;
import com.deposit.model.Deposit;
import java.math.BigDecimal;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer(1,"Test", "User", "00000000000");
        Deposit deposit = new Deposit(1, new BigDecimal("500.5"),6,new BigDecimal(3), "GEL", LocalDate.now(), customer);

        System.out.println(deposit.getId());
        System.out.println(deposit.getAmount());
        System.out.println(deposit.getTermMonths());
        System.out.println(deposit.getInterestRate());
        System.out.println(deposit.getCurrency());
        System.out.println(deposit.getOpenDate());
        System.out.println(deposit.getStatus());
        System.out.println(customer.getFirstName());
        System.out.println(customer.getLastName());
        System.out.println(deposit.getCustomer().getFirstName());





    }
}
