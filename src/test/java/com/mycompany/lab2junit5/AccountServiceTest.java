package com.mycompany.lab2junit5;

import org.junit.jupiter.api.BeforeEach;
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
    @CsvFileSource(resources = "/test-data.csv", numLinesToSkip = 1)
    public void testRegisterAccountFromCsv(String username, String password, String email, boolean expected) {
        boolean actual = accountService.registerAccount(username, password, email);
        assertEquals(expected, actual, 
            String.format("Register with username='%s', password='%s', email='%s' failed", username, password, email));
    }

    @Test
    public void testIsValidEmailValid() {
        assertTrue(accountService.isValidEmail("john@example.com"));
        assertTrue(accountService.isValidEmail("carol@domain.com"));
    }

    @Test
    public void testIsValidEmailInvalid() {
        assertFalse(accountService.isValidEmail(null));
        assertFalse(accountService.isValidEmail(""));
        assertFalse(accountService.isValidEmail("bobmail.com"));
        assertFalse(accountService.isValidEmail("user@.com"));
    }
}
