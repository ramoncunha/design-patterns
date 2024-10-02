package org.design.patterns.behavioral.command;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

class AccountTest {

    @Test
    void testAccount_deveCriarConta() {
        Account actual = new Account("321971");
        Assertions.assertEquals(BigDecimal.ZERO, actual.getBalance());
    }

    @Test
    void testAccount_deveCreditarConta() {
        Account actual = new Account("321971");
        actual.credit(BigDecimal.TEN);
        Assertions.assertEquals(BigDecimal.TEN, actual.getBalance());
    }

    @Test
    void testAccount_deveDebitarConta() {
        Account actual = new Account("321971");
        actual.credit(BigDecimal.TEN);
        actual.debit(BigDecimal.ONE);
        Assertions.assertEquals(BigDecimal.valueOf(9), actual.getBalance());
    }

    @Test
    void testAccount_deveCreditarConta_usandoCommand() {
        Account actual = new Account("321971");
        CreditCommand command = new CreditCommand(actual, BigDecimal.TEN);
        command.execute();
        Assertions.assertEquals(BigDecimal.TEN, actual.getBalance());
    }

    @Test
    void testAccount_deveDebitarConta_usandoCommand() {
        Account actual = new Account("321971");
        CreditCommand creditCommand = new CreditCommand(actual, BigDecimal.TEN);
        creditCommand.execute();
        DebitCommand debitCommand = new DebitCommand(actual, BigDecimal.ONE);
        debitCommand.execute();
        Assertions.assertEquals(BigDecimal.valueOf(9), actual.getBalance());
    }
}
