package com.saurabh.mystarterapp;

import com.saurabh.mystarterapp.beans.CalService;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.when;

public class TestCalculator {
    Calculator c;
    CalService service;

    @Before
    public void setUp() {
        c = new Calculator();
    }

    @Test
    public void testAdd() {

        /*when(service.add(1,3)).thenReturn(4);
        Assert.assertEquals(4,c.perform(1,3));*/
        /*Assert.assertEquals(5,c.add(2,3));
        Assert.assertEquals(3,c.add(0,3));
        Assert.assertEquals(8,c.add(5,3));
        Assert.assertEquals(4,c.add(1,3));
        Assert.assertEquals(4,c.add(1,3));*/
    }

    @After
    public void derefrnce() {
        c = null;
    }
}
