package org.example;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Unit test for simple App.
 */
public class MyClassTest
{
    @Test
    @DisplayName("Name")
    public void testMaven(){
        MyClass tester = new MyClass();
        assertEquals(50,tester.multiply(5,10));
    }

}
