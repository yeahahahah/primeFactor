import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;


class PrimeFactorTest {
    PrimeFactor primeFactor;

    @BeforeEach
    void setUp() {
        primeFactor = new PrimeFactor();
    }

    @Test
    void testPrimefactorOf1() {

        assertEquals(Arrays.asList(),primeFactor.of(1));

    }

    @Test
    void testPrimeFactorOf2() {

        assertEquals(Arrays.asList(2),primeFactor.of(2));
    }

    @Test
    void testPrimeFactorOf3() {

        assertEquals(Arrays.asList(3),primeFactor.of(3));
    }
}