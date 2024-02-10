package com.max;

import com.github.tomakehurst.wiremock.WireMockServer;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static com.github.tomakehurst.wiremock.client.WireMock.configureFor;

public abstract class AbstractBookingTest {

    protected static WireMockServer wireMockServer;
    protected static final int port = 8080;
    protected static String baseUrl;

    protected static final Logger logger = LoggerFactory.getLogger(AbstractBookingTest.class);

    @BeforeAll
    static void startServer() {
        wireMockServer = new WireMockServer(port);
        wireMockServer.start();
        configureFor("localhost", port);
        baseUrl = "http://localhost:" + port;
        logger.info("Start WireMockServer on port {}", port);
    }

    @AfterAll
    static void stopServer() {
        wireMockServer.stop();
        logger.info("Stop WireMockServer");
    }

    public static String getBaseUrl() {
        return baseUrl;
    }
}
