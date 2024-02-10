package com.max;

import java.time.LocalDateTime;
import java.util.List;

public class DatabaseService {

    private List<Booking> bookings;

    public DatabaseService(List<Booking> bookings) {
        this.bookings = bookings;
    }

    public boolean isSlotAvailable(LocalDateTime from, LocalDateTime to) {
        for (Booking booking : bookings) {
            LocalDateTime bookingFrom = booking.getFrom();
            LocalDateTime bookingTo = booking.getTo();
            if ((from.isEqual(bookingFrom) || from.isAfter(bookingFrom)) && (to.isEqual(bookingTo) || to.isBefore(bookingTo))) {
                return false;
            }
        }
        return true;
    }

    public boolean bookSlot(String userId, LocalDateTime from, LocalDateTime to) {
        if (isSlotAvailable(from, to)) {
            bookings.add(new Booking(userId, from, to));
            return true;
        }
        return false;
    }
}