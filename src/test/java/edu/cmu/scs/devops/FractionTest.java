package edu.cmu.scs.devops;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FractionTest {

    @Test
    public void test1_DefaultConstructor() {
        Fraction f = new Fraction();
        assertEquals(1, f.numerator);
        assertEquals(1, f.denominator);
    }

    @Test
    public void test2_NonDefaultConstructor() {
        Fraction f = new Fraction(3, 4);
        assertEquals(3, f.numerator);
        assertEquals(4, f.denominator);
    }

    @Test
    public void test3_ToString() {
        Fraction f = new Fraction(13, 7);
        assertEquals( "13/7", f.toString());
    }

    @Test
    public void test4_Add() {
        Fraction f1 = new Fraction (1, 2);
        Fraction f2 = new Fraction (3, 4);
        Fraction f3 = f1.add(f2);
        assertEquals(5, f3.numerator);
        assertEquals(4, f3.denominator);
    }

    @Test
    public void test5_ToDecimal() {
        Fraction f = new Fraction (1, 2);
        assertEquals(0.5, f.toDecimal());
    }

    @Test
    public void test6_GCDWithDivisor() {
        Fraction f = new Fraction();
        assertEquals(4, f.findGCD(12,4), "Testing 12/4 ");
    }
    @Test
    public void test7_GCDWithSmallerNumerator() {
        Fraction f = new Fraction();
        assertEquals(5, f.findGCD(5, 15));
    }

    @Test
    public void test8_GCDWithDenominatorZero() {
        Fraction f = new Fraction();
        assertEquals(1, f.findGCD(1,0));
    }

    @Test
    public void test9_GCDWithNumeratorZero() {
        Fraction f = new Fraction();
        assertEquals(1, f.findGCD(0,1));
    }

    @Test
    public void test10_GCDWithoutDivisor() {
        Fraction f = new Fraction();
        assertEquals(1, f.findGCD(13,7));
    }
}
