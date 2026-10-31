package com.hanhnt.mathutil.core;

/**
 * Lớp tiện ích toán học tính giai thừa
 * Minh họa kiểm thử đơn vị với JUnit 5
 */
public class MathUtil {

    public static long getFactorial(int n) {
        if (n < 0 || n > 20) {
            throw new IllegalArgumentException("Invalid argument. n must be between 0 and 20.");
        }
        if (n == 0 || n == 1) {
            return 1;
        }

        // BUG LẦN 1: Cố tình để product = 0 thay vì 1 để Unit Test bắt lỗi (MÀU ĐỎ)
        long product = 0;
        for (int i = 2; i <= n; i++) {
            product *= i;
        }
        return product;
    }
}
