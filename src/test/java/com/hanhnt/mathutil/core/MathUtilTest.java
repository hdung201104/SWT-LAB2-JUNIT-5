package com.hanhnt.mathutil.core;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MathUtilTest {

    @Test
    public void testFactorialGivenRightArgumentReturnsWell() {
        assertEquals(1, MathUtil.getFactorial(0));
        assertEquals(1, MathUtil.getFactorial(1));
        assertEquals(2, MathUtil.getFactorial(2));
        assertEquals(6, MathUtil.getFactorial(3));
        assertEquals(24, MathUtil.getFactorial(4));
        assertEquals(120, MathUtil.getFactorial(5));
    }

    @Test
    public void testFactorialGivenWrongArgumentThrowsException() {
        assertThrows(IllegalArgumentException.class, () -> MathUtil.getFactorial(-5));
        assertThrows(IllegalArgumentException.class, () -> MathUtil.getFactorial(21));
    }
}
