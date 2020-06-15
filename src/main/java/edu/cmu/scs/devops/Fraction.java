package edu.cmu.scs.devops;

public class Fraction {
    int numerator;
    int denominator;

    Fraction(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public static int findGCD(int n1, int n2) {
        if (n2 == 0) {
            return n1;
        }

        return findGCD(n2, n1 % n2);
    }

    Fraction add(Fraction f) {
        int buf_numerator = this.numerator * f.denominator + f.numerator * this.denominator;
        int buf_denominator = this.denominator * f.denominator;

        int GCD = findGCD(buf_numerator, buf_denominator);
        buf_numerator /= GCD;
        buf_denominator /= GCD;

        return new Fraction(buf_numerator, buf_denominator);
    }

    Fraction absolute() {
        int numerator = this.numerator < 0 ? -this.numerator : this.numerator;
        int denominator = this.denominator < 0 ? -this.denominator : this.denominator;
        return new Fraction(numerator, denominator);
    }
}
