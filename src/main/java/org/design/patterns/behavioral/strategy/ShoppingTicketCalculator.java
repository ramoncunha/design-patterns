package org.design.patterns.behavioral.strategy;

import java.math.BigDecimal;
import java.time.Duration;
import java.time.LocalDateTime;

public class ShoppingTicketCalculator implements TicketCalculator {

    // 3 hours = 30
    // +3 hours = $10 per hour
    @Override
    public BigDecimal calculateTicket(LocalDateTime checkIn, LocalDateTime checkOut) {
        Duration duration = Duration.between(checkIn, checkOut);
        long hours = ((duration.getSeconds() / 60) / 60) - 3;
        BigDecimal price = BigDecimal.TEN;
        if (hours > 0) {
            BigDecimal totalAmount = BigDecimal.valueOf(hours * 10);
            return price.add(totalAmount);
        }
        return price;
    }
}
