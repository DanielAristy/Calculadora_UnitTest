package com.example.calculadora;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class OperacionTest {

    private Operacion mOperacion;

    @Before
    public void setUp(){
        mOperacion = new Operacion();
    }

    @Test
    public void operacionNotNull(){
        assertNotNull(mOperacion);
    }

    @Test
    public void suma() throws Exception {
        assertEquals("7", mOperacion.suma("4","3"));
    }

    @Test
    public void resta() throws Exception {
        assertEquals("-1", mOperacion.resta("3","4"));
    }

    @Test
    public void multiplicacion() throws Exception {
        assertEquals("12",mOperacion.multiplicacion("4","3"));
    }
}