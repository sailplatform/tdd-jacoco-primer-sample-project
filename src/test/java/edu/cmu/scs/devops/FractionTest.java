package edu.cmu.scs.devops;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FractionTest {

    @Test
    public void testFindGCDWithZero() {
        assertEquals(5, Fraction.findGCD(5, 0));
    }

    @Test
    public void testFindGCDWithDivisor() {
        assertEquals(3, Fraction.findGCD(6, 9));
    }

    @Test
    public void testFindGCDWithoutDivisor() {
        assertEquals(1, Fraction.findGCD(13,7));
    }

    @Test
    public void testAdd() {
        Fraction f1 = new Fraction (1, 2);
        Fraction f2 = new Fraction (3, 4);
        Fraction f3 = f1.add(f2);
        assertEquals(5, f3.numerator);
        assertEquals(4, f3.denominator);
    }
}
