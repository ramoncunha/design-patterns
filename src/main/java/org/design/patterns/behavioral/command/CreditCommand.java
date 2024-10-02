package org.design.patterns.behavioral.command;

import java.math.BigDecimal;

public class CreditCommand implements Command {
    private final Account account;
    private final BigDecimal amount;

    public CreditCommand(Account account, BigDecimal amount) {
        this.account = account;
        this.amount = amount;
    }

    @Override
    public void execute() {
        account.credit(amount);
    }
}
