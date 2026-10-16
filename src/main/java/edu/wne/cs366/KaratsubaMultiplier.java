package edu.wne.cs366;

import java.math.BigInteger;

/**
 * CS366 Programming Assignment 02: Karatsuba Multiplication.
 *
 * @author Your Name
 */
public class KaratsubaMultiplier {

    private static final BigInteger TEN = BigInteger.TEN;

    /**
     * Multiplies two signed integers using recursive Karatsuba multiplication.
     *
     * @param x first factor
     * @param y second factor
     * @return x multiplied by y
     * @throws NullPointerException when either argument is null
     */
    public static BigInteger karatsuba(BigInteger x, BigInteger y) {
        // TODO: Handle signs, call the nonnegative recursive helper, and restore the sign.
        throw new UnsupportedOperationException("TODO: implement karatsuba");
    }

    private static BigInteger karatsubaNonnegative(BigInteger x, BigInteger y) {
        // TODO: Apply the decimal Karatsuba recurrence with exactly three recursive products.
        throw new UnsupportedOperationException("TODO: implement karatsubaNonnegative");
    }

    private static int decimalDigits(BigInteger value) {
        // TODO: Return the number of decimal digits in a nonnegative value; zero has one digit.
        throw new UnsupportedOperationException("TODO: implement decimalDigits");
    }

    public static void main(String[] args) {
        BigInteger x = new BigInteger("3412");
        BigInteger y = new BigInteger("1523");
        System.out.printf("%s × %s = %s%n", x, y, karatsuba(x, y));
    }
}
