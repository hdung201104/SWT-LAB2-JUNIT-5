package com.hanhnt.mathutil.core;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import static org.junit.jupiter.api.Assertions.*;

public class MathUtilTestFromcsv {

    @ParameterizedTest
    @CsvFileSource(resources = "/factorial_test_data.csv")
    public void testFactorialGivenRightArgumentReturnsWellFromCsv(int n, long expected) {
        assertEquals(expected, MathUtil.getFactorial(n));
    }
}
