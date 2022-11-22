package org.example;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class PalindromeTest {

    @ParameterizedTest
    @ValueSource()
    void isPalindrome() {
        assertTrue(true);
    }
}