package com.max;

import java.time.LocalDateTime;

public class BookingService {

    private DatabaseService databaseService;

    public BookingService(DatabaseService databaseService) {
        this.databaseService = databaseService;
    }

    public boolean book(String userId, LocalDateTime from, LocalDateTime to) throws CantBookException {
        if (checkTimeInBD(from, to)) {
            return createBook(userId, from, to);
        }
        throw new CantBookException();
    }

    public boolean checkTimeInBD(LocalDateTime from, LocalDateTime to) {
        return databaseService.isSlotAvailable(from, to);
    }

    public boolean createBook(String userId, LocalDateTime from, LocalDateTime to) {
        return databaseService.bookSlot(userId, from, to);
    }
}