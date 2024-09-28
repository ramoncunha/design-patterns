package org.design.patterns.behavioral.strategy;

import java.math.BigDecimal;
import java.time.Duration;
import java.time.LocalDateTime;

public class AirportTicketCalculator implements TicketCalculator {

    @Override
    public BigDecimal calculateTicket(LocalDateTime checkIn, LocalDateTime checkOut) {
        long durationInHours = (Duration.between(checkIn, checkOut).getSeconds() / 60) / 60;
        BigDecimal price = BigDecimal.TEN;
        return BigDecimal.valueOf(durationInHours).multiply(price);
    }
}
