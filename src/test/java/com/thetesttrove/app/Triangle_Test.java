package com.thetesttrove.app;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class Triangle_Test
{

    @Test
    public void shouldBeEquilateral()
    {
        Triangle t = new Triangle(2,2,2);
        assertTrue(t.is_equilateral());
    }

    @Test
    public void shouldNotBeEquilateral()
    {
        Triangle t = new Triangle(2,2,1);
        assertFalse(t.is_equilateral());
    }
}
