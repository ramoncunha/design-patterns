package org.design.patterns.behavioral.strategy;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

public class ParkingLot {

    private final int capacity;
    private final List<ParkedCar> parkedCars;
    private final TicketCalculator ticketCalculator;

    public ParkingLot(int capacity, List<ParkedCar> parkedCars, TicketCalculator ticketCalculator) {
        this.capacity = capacity;
        this.parkedCars = parkedCars;
        this.ticketCalculator = ticketCalculator;
    }

    public void checkIn(String plate, LocalDateTime checkInDate) {
        parkedCars.add(new ParkedCar(plate, checkInDate));
    }

    public void checkOut(String plate) {
        ParkedCar parkedCar = parkedCars.stream()
                .filter(car -> plate.equals(car.plate()))
                .findFirst()
                .orElseThrow();
        parkedCars.remove(parkedCar);
    }

    public BigDecimal calculateTicket(String plate, LocalDateTime checkOut) {
        ParkedCar parkedCar = parkedCars.stream()
                .filter(car -> plate.equals(car.plate()))
                .findFirst()
                .orElseThrow();
        return ticketCalculator.calculateTicket(parkedCar.checkInDate(), checkOut);
    }

    public int getEmptySpace() {
        return capacity - parkedCars.size();
    }
}
