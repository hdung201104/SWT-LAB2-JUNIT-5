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

        // LẦN 2 - ĐÃ SỬA LỖI (GREEN):
        // Khởi tạo product = 1 để nhân dồn giai thừa chính xác
        long product = 1;
        for (int i = 2; i <= n; i++) {
            product *= i;
        }
        return product;
    }
}
