package com.example;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class MathUtilTest {
    @Test
    void testCalcularMDC() {
        int x = 6; 
        int y = 3; 

        int esperado = 3;
        int obtido = MathUtil.calcularMDC(6,3);

        assertEquals(esperado, obtido);

    }
}
