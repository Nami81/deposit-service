package com.deposit.model;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Deposit {
    private long id;
    private BigDecimal amount;
    private int termMonths;
    private BigDecimal interestRate;
    private String currency;
    private LocalDate openDate;
    private DepositStatus status;
    private Customer customer;

    public Deposit(long id, BigDecimal amount, int termMonths, BigDecimal interestRate, String currency, LocalDate openDate, Customer customer){
        this.id = id;
        this.amount = amount;
        this.termMonths = termMonths;
        this.interestRate = interestRate;
        this.currency = currency;
        this.openDate = openDate;
        this.status = DepositStatus.ACTIVE;
        this.customer = customer;

    }

    public long getId(){
        return id;
    }
    public BigDecimal getAmount(){
        return amount;
    }
    public int getTermMonths(){
        return termMonths;
    }
    public BigDecimal getInterestRate(){
        return interestRate;
    }
    public String getCurrency(){
        return currency;
    }
    public LocalDate getOpenDate(){
        return openDate;
    }
    public DepositStatus getStatus(){
        return status;
    }

    public Customer getCustomer() {
        return customer;
    }
}



