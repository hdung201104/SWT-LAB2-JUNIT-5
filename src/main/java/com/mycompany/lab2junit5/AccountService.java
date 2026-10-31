package com.mycompany.lab2junit5;

import java.util.regex.Pattern;

/**
 * Bài tập nộp Lab 2: Viết unit test cho chức năng Đăng ký tài khoản
 */
public class AccountService {

    private static final String EMAIL_REGEX = "^[A-Za-z0-9+_.-]+@([A-Za-z0-9.-]+\\.[A-Za-z]{2,})$";
    private static final Pattern EMAIL_PATTERN = Pattern.compile(EMAIL_REGEX);

    /**
     * Kiểm tra tính hợp lệ của email
     */
    public boolean isValidEmail(String email) {
        if (email == null || email.trim().isEmpty()) {
            return false;
        }
        return EMAIL_PATTERN.matcher(email.trim()).matches();
    }

    /**
     * Đăng ký tài khoản
     * Yêu cầu:
     * - Username không được null hoặc rỗng
     * - Password phải lớn hơn 6 kí tự
     * - Email phải hợp lệ
     */
    public boolean registerAccount(String username, String password, String email) {
        if (username == null || username.trim().isEmpty()) {
            return false;
        }
        if (password == null || password.length() <= 6) {
            return false;
        }
        if (!isValidEmail(email)) {
            return false;
        }
        return true;
    }
}
