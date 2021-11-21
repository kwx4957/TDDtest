package com.rest.app;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalcuratorTest {
    Calcurator calcurator;

    @BeforeEach
    void setUp(){
        calcurator = new Calcurator();
    }

    @Test
    public void testMuiltiply(){
        assertEquals(20, calcurator.mulityply(4, 5));
        assertEquals(25, calcurator.mulityply(5, 5));
    }

    @Test
    public void testDivdie(){
        assertEquals(2, calcurator.divide(4, 2));

    }

}