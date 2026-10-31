# SWT-LAB2-JUNIT-5 | Math Utility Project (CI included)

[![Math Utility Project (CI included) | © 2026](https://github.com/hdung201104/SWT-LAB2-JUNIT-5/actions/workflows/maven.yml/badge.svg)](https://github.com/hdung201104/SWT-LAB2-JUNIT-5/actions/workflows/maven.yml)

## 📌 Thông tin sinh viên
- **Họ và tên:** Hoàng Ngọc Dũng
- **MSSV:** DE191112
- **Lớp:** SE20B03
- **Email:** hdung201104@gmail.com
- **Môn học:** SWT301 - Software Testing (LAB 2 - JUnit 5 & GitHub Actions CI)

## 🛠️ Công nghệ sử dụng
- Java 17
- Apache Maven
- JUnit 5 (JUnit Jupiter) + Data-Driven Testing (DDT `@ParameterizedTest` với CSV)
- Maven Surefire Plugin (Tạo báo cáo kiểm thử Unit Test)
- JaCoCo Plugin (Đo độ bao phủ mã nguồn - Code Coverage)
- GitHub Actions CI (Tự động hóa kiểm thử liên tục trên máy ảo Ubuntu)

## 🧪 Các chức năng và Test Cases
1. **`MathUtil` (`com.hanhnt.mathutil.core`)**:
   - Hàm `getFactorial(int n)`: Tính giai thừa $n!$ ($0 \le n \le 20$). Ném ngoại lệ `IllegalArgumentException` nếu $n < 0$ hoặc $n > 20$.
   - Test cơ bản (`MathUtilTest.java`).
   - Test nâng cao DDT (`MathUtilTestFromcsv.java`) đọc dữ liệu từ `factorial_test_data.csv`.

2. **`AccountService` (`com.mycompany.lab2junit5`)**:
   - Hàm `isValidEmail(String email)`: Kiểm tra định dạng email hợp lệ.
   - Hàm `registerAccount(String username, String password, String email)`: Kiểm tra đăng ký tài khoản (username không được rỗng, password phải lớn hơn 6 kí tự, email hợp lệ).
   - Test DDT (`AccountServiceTest.java`) đọc từ `test-data.csv` theo 5 bộ dữ liệu kiểm thử chuẩn của đề bài.

## 🚀 Quy trình thực hành TDD & CI
- **Lần 1 (Commit 1 - ĐỎ ❌):** Mã nguồn ban đầu có lỗi logic tính giai thừa -> Test phát hiện bug, GitHub Actions hiển thị **Build Failed (Màu đỏ ❌)**.
- **Lần 2 (Commit 2 - XANH ✅):** Sửa lỗi mã nguồn cho chuẩn -> Toàn bộ Unit Test PASS, GitHub Actions chuyển sang **Build Passing (Màu xanh ✅)**.
