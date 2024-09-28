package org.design.patterns.behavioral.strategy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;

class ParkingLotTest {

    @Test
    void checkIn_deveRealizarCheckIn() {
        ParkingLot actual = new ParkingLot(100, new ArrayList<>(), new BeachTicketCalculator());
        actual.checkIn("AAA-999", LocalDateTime.of(2024, 9, 20, 9, 7));
        Assertions.assertEquals(99, actual.getEmptySpace());
    }

    @Test
    void checkOut_deveRealizarCheckOut() {
        ParkingLot actual = new ParkingLot(100, new ArrayList<>(), new BeachTicketCalculator());
        actual.checkIn("AAA-999", LocalDateTime.of(2024, 9, 20, 9, 7));
        actual.checkOut("AAA-999");
        Assertions.assertEquals(100, actual.getEmptySpace());
    }

    @Test
    void calculateTicket_deveCalcularTicketEstacionamentoShopping() {
        ParkingLot actual = new ParkingLot(100, new ArrayList<>(), new ShoppingTicketCalculator());
        actual.checkIn("AAA-999", LocalDateTime.of(2024, 9, 20, 9, 7));
        BigDecimal price = actual.calculateTicket("AAA-999", LocalDateTime.of(2024, 9, 20, 15, 7));
        Assertions.assertEquals(BigDecimal.valueOf(40), price);
    }

    @Test
    void calculateTicket_deveCalcularTicketEstacionamentoBeach() {
        ParkingLot actual = new ParkingLot(100, new ArrayList<>(), new BeachTicketCalculator());
        actual.checkIn("AAA-999", LocalDateTime.of(2024, 9, 20, 9, 7));
        BigDecimal price = actual.calculateTicket("AAA-999", LocalDateTime.of(2024, 9, 20, 15, 7));
        Assertions.assertEquals(BigDecimal.valueOf(20), price);
    }

    @Test
    void calculateTicket_deveCalcularTicketEstacionamentoAirport() {
        ParkingLot actual = new ParkingLot(100, new ArrayList<>(), new AirportTicketCalculator());
        actual.checkIn("AAA-999", LocalDateTime.of(2024, 9, 20, 9, 7));
        BigDecimal price = actual.calculateTicket("AAA-999", LocalDateTime.of(2024, 9, 20, 15, 7));
        Assertions.assertEquals(BigDecimal.valueOf(60), price);
    }
}
