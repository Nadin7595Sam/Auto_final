package com.max;

import java.time.LocalDateTime;

public class Booking {
    private String userId;
    private LocalDateTime from;
    private LocalDateTime to;

    public Booking(String userId, LocalDateTime from, LocalDateTime to) {
        this.userId = userId;
        this.from = from;
        this.to = to;
    }

    public String getUserId() {
        return userId;
    }

    public LocalDateTime getFrom() {
        return from;
    }

    public LocalDateTime getTo() {
        return to;
    }
}