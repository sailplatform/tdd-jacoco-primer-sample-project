package edu.cmu.scs.devops;

public class Fraction {
    int numerator;
    int denominator;

    Fraction() {
        this.numerator = 1;
        this.denominator = 1;
    }

    Fraction(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    @Override
    public String toString() {
        return Integer.toString(numerator)+"/"+Integer.toString(denominator);
    }

    double toDecimal() {
        return (double) numerator/(double)denominator;
    }

    Fraction add(Fraction f) {
        int buf_numerator = this.numerator*f.denominator + f.numerator*this.denominator;
        int buf_denominator = this.denominator*f.denominator;

        int GCD = findGCD(buf_numerator, buf_denominator);
        buf_numerator /= GCD;
        buf_denominator /= GCD;

        return new Fraction(buf_numerator, buf_denominator);
    }

    int findGCD(int numerator, int denominator) {
        if (numerator==0) {
            return 1;
        }
        if(denominator==0) {
            return numerator;
        }

        return findGCD(denominator, numerator%denominator);
    }

    Fraction absolute() {
        int numerator = this.numerator < 0 ? - this.numerator : this.numerator;
        int denominator = this.denominator < 0 ? - this.denominator : this.denominator;
        return new Fraction(numerator, denominator);
    }
}
