package longestSubstring;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class LongestSubstringTest {

  LongestSubstring underTest = new LongestSubstring();

  @Test
  void findOutLongestSubstring() {

    // Preparation
    // Execution and Assertion
    assertAll(
        () -> assertEquals("abc", underTest.findOutLongestSubstring("abcabcbb")),
        () -> assertEquals("b", underTest.findOutLongestSubstring("bbbbbb")),
        () -> assertEquals("wke", underTest.findOutLongestSubstring("pwwkew")),
        () -> assertEquals("abcdefg", underTest.findOutLongestSubstring("abcdabcdefg")),
        () -> assertEquals("solei", underTest.findOutLongestSubstring("soleil"))
    );
  }
}
