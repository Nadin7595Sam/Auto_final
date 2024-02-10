package com.max;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PositiveBookingTest extends AbstractBookingTest {

    private static final Logger logger = LoggerFactory.getLogger(PositiveBookingTest.class);

    @Test
    void testPositiveBooking() {
        // Реализация позитивного теста
        logger.info("Running positive booking test");
    }
}
