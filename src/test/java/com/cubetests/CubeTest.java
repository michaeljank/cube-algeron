package com.cubetests;

import org.jboss.arquillian.junit.Arquillian;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.assertEquals;

@RunWith(Arquillian.class)
public class CubeTest {

    @Test
    public void shouldFail() throws Exception {
        assertEquals(1, 2);
    }
}