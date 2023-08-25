package com.example;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class MathUtilTest {
    @Test
    void testCalcularMDC_P1() {
        int x = 6; 
        int y = 3; 

        int esperado = 3;
        int obtido = MathUtil.calcularMDC(x,y);

        assertEquals(esperado, obtido);

    }
    @Test
    void testCalcularMDC_P2() {
        int x = 6; 
        int y = 2; 

        int esperado = 2;
        int obtido = MathUtil.calcularMDC(x,y);

        assertEquals(esperado, obtido);

    }
    @Test
    void testCalcularMDC_P3() {
        int x = 6; 
        int y = 0; 

        int esperado = 6;
        int obtido = MathUtil.calcularMDC(x,y);

        assertEquals(esperado, obtido);

    }

    @Test
    void testCalcularMDC_P4() {
        int x = 6; 
        int y = 2; 

        int esperado = MathUtil.calcularMDC(y, x);
        int obtido = MathUtil.calcularMDC(x,y);

        assertEquals(esperado, obtido);

    }

    @Test
    void testCalcularMDC_P5() {
        int x = 6; 
        int y = 6; 

        int esperado = MathUtil.calcularMDC(y, x);
        int obtido = MathUtil.calcularMDC(x,y);

        assertEquals(esperado, obtido);

    }
}
