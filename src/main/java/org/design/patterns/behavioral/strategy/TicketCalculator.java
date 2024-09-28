package org.design.patterns.behavioral.strategy;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public interface TicketCalculator {

    BigDecimal calculateTicket(LocalDateTime checkIn, LocalDateTime checkOut);
}
