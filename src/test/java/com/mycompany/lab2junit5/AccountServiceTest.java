package com.mycompany.lab2junit5;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import static org.junit.jupiter.api.Assertions.*;

public class AccountServiceTest {

    private AccountService accountService;

    @BeforeEach
    public void setUp() {
        accountService = new AccountService();
    }

    @ParameterizedTest
    @DisplayName("Test registerAccount với dữ liệu từ file CSV (DDT)")
    @CsvFileSource(resources = "/test-data.csv", numLinesToSkip = 1)
    public void testRegisterAccountFromCsv(String username, String password, String email, boolean expected) {
        boolean actual = accountService.registerAccount(username, password, email);
        assertEquals(expected, actual, 
            String.format("Register with username='%s', password='%s', email='%s' failed", username, password, email));
    }

    @Test
    @DisplayName("Test registerAccount khi username hoặc password null")
    public void testRegisterAccountNullUsernameOrPassword() {
        assertFalse(accountService.registerAccount(null, "pass123", "john@example.com"));
        assertFalse(accountService.registerAccount("john123", null, "john@example.com"));
    }

    @Test
    @DisplayName("Test isValidEmail với email hợp lệ")
    public void testIsValidEmailValid() {
        assertTrue(accountService.isValidEmail("john@example.com"));
        assertTrue(accountService.isValidEmail("carol@domain.com"));
    }

    @Test
    @DisplayName("Test isValidEmail với email không hợp lệ")
    public void testIsValidEmailInvalid() {
        assertFalse(accountService.isValidEmail(null));
        assertFalse(accountService.isValidEmail(""));
        assertFalse(accountService.isValidEmail("   "));
        assertFalse(accountService.isValidEmail("bobmail.com"));
        assertFalse(accountService.isValidEmail("user@.com"));
    }
}
