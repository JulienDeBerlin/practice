package palindromeNumber;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import lombok.SneakyThrows;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class PalindromeNumberTest {

  @Test
  @DisplayName("palindrome detector works as expected")
  @SneakyThrows
  void testMethodName_PalindromeDetectorWorksAsExpected() {
    // Preparation
    final var underTest = new PalindromeNumber();

    // Execution
    final var result1 = underTest.isAPalindrom(121);
    final var result2 = underTest.isAPalindrom(-121);
    final var result3 = underTest.isAPalindrom(5);
    final var result4 = underTest.isAPalindrom(11);
    final var result5 = underTest.isAPalindrom(547);

    // Assertion
    assertAll(
        () -> assertTrue(result1),
        () -> assertFalse(result2),
        () -> assertTrue(result3),
        () -> assertTrue(result4),
        () -> assertFalse(result5)
    );
  }

}
