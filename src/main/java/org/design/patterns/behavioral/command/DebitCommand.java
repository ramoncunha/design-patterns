package org.design.patterns.behavioral.command;

import java.math.BigDecimal;

public class DebitCommand implements Command {
    private final Account account;
    private final BigDecimal amount;

    public DebitCommand(Account account, BigDecimal amount) {
        this.account = account;
        this.amount = amount;
    }

    @Override
    public void execute() {
        account.debit(amount);
    }
}
