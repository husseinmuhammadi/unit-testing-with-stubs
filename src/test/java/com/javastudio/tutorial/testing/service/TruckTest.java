package com.javastudio.tutorial.testing.service;

import com.javastudio.tutorial.testing.stub.MercedesBenzEngine;
import org.junit.jupiter.api.Test;

import java.util.logging.Logger;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class TruckTest {

    private Logger logger = Logger.getLogger(TruckTest.class.getName());

    @Test
    void truckTest() {
        logger.info("Testing truck starting and stopping");
        Truck truck = new Truck(new MercedesBenzEngine());
        truck.start();
        assertTrue(truck.isStart());
        truck.stop();
        assertFalse(truck.isStart());
    }
}