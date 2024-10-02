package org.design.patterns.behavioral.command;

import java.math.BigDecimal;

public class Account {

    private final String account;
    private BigDecimal balance;

    public Account(String account) {
        this.account = account;
        this.balance = BigDecimal.ZERO;
    }

    void credit(BigDecimal amount) {
        balance = balance.add(amount);
    }

    public void debit(BigDecimal amount) {
        balance = balance.subtract(amount);
    }

    public BigDecimal getBalance() {
        return balance;
    }
}
