package palindromeNumber;

public class PalindromeNumber {

  public boolean isAPalindrom(final int input) {
    if (input < 0) {
      return false;
    } else {
      final char[] chars = ("" + input).toCharArray();
      var pointerStart = 0;
      var pointerEnd = chars.length - 1;

      while (pointerEnd - pointerStart > 1) {
        if (chars[pointerStart] != chars[pointerEnd]) {
          return false;
        }
        pointerStart++;
        pointerEnd--;
      }
      return true;
    }
  }

}
