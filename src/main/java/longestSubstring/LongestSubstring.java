package longestSubstring;

import java.util.HashMap;


public class LongestSubstring {


  public String findOutLongestSubstring(final String input) {

    final var inputAsArray = input.toCharArray();
    final var metCharactersWithIndex = new HashMap<Character, Integer>();
    String actualLongestSequence = "";
    int pointerStart = 0;

    for (int pointerEnd = 0; pointerEnd < inputAsArray.length; pointerEnd++) {

      if (metCharactersWithIndex.containsKey(inputAsArray[pointerEnd])) {

        actualLongestSequence = input.substring(pointerStart, pointerEnd);
        pointerStart = metCharactersWithIndex.get(inputAsArray[pointerEnd]) + 1;
        metCharactersWithIndex.put(inputAsArray[pointerEnd], pointerEnd);
        final var restToAnalyse = input.substring(pointerStart, inputAsArray.length);

        if (!longerSequenceCouldStillPossiblyBeFound(actualLongestSequence, restToAnalyse)) {
          return actualLongestSequence;
        }
      } else {
        actualLongestSequence = input.substring(pointerStart, pointerEnd + 1);
        metCharactersWithIndex.put(inputAsArray[pointerEnd], pointerEnd);
      }
    }
    return actualLongestSequence;
  }

  private static boolean longerSequenceCouldStillPossiblyBeFound(final String actualLongestSubString,
      final String restToAnalyse) {
    return restToAnalyse.length() > actualLongestSubString.length();
  }


}
