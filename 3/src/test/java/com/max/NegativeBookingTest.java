package com.max;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NegativeBookingTest extends AbstractBookingTest {

    private static final Logger logger = LoggerFactory.getLogger(NegativeBookingTest.class);

    @Test
    void testNegativeBooking() {
        // Реализация негативного теста
        logger.info("Running negative booking test");
    }
}
