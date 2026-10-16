package edu.wne.cs366;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.math.BigInteger;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class KaratsubaMultiplierTest {

    @ParameterizedTest
    @DisplayName("Karatsuba returns known products")
    @CsvSource({
        "0, 0, 0",
        "0, 918273645, 0",
        "7, 8, 56",
        "12, 34, 408",
        "3412, 1523, 5196476",
        "12345, 6789, 83810205",
        "123456789, 987654321, 121932631112635269"
    })
    void returnsKnownProducts(String x, String y, String expected) {
        assertEquals(new BigInteger(expected),
                KaratsubaMultiplier.karatsuba(new BigInteger(x), new BigInteger(y)));
    }

    @ParameterizedTest
    @DisplayName("Karatsuba handles signs")
    @CsvSource({
        "-1234, 5678, -7006652",
        "1234, -5678, -7006652",
        "-1234, -5678, 7006652"
    })
    void handlesSigns(String x, String y, String expected) {
        assertEquals(new BigInteger(expected),
                KaratsubaMultiplier.karatsuba(new BigInteger(x), new BigInteger(y)));
    }

    @Test
    @DisplayName("Karatsuba handles unequal digit counts")
    void handlesUnequalDigitCounts() {
        BigInteger x = new BigInteger("12345678901234567890");
        BigInteger y = new BigInteger("321");
        assertEquals(x.multiply(y), KaratsubaMultiplier.karatsuba(x, y));
    }

    @Test
    @DisplayName("Karatsuba handles large values")
    void handlesLargeValues() {
        BigInteger x = new BigInteger("123456789012345678901234567890");
        BigInteger y = new BigInteger("987654321098765432109876543210");
        assertEquals(x.multiply(y), KaratsubaMultiplier.karatsuba(x, y));
    }

    @Test
    @DisplayName("Karatsuba rejects null arguments")
    void rejectsNullArguments() {
        assertThrows(NullPointerException.class,
                () -> KaratsubaMultiplier.karatsuba(null, BigInteger.ONE));
        assertThrows(NullPointerException.class,
                () -> KaratsubaMultiplier.karatsuba(BigInteger.ONE, null));
    }
}
