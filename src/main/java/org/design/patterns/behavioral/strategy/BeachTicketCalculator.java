package org.design.patterns.behavioral.strategy;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class BeachTicketCalculator implements TicketCalculator {

    @Override
    public BigDecimal calculateTicket(LocalDateTime checkIn, LocalDateTime checkOut) {
        return BigDecimal.valueOf(20);
    }
}
