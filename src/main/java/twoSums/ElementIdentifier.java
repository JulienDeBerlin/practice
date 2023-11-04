package twoSums;


import java.util.HashMap;
import java.util.Map;

public class ElementIdentifier {

  public int[] withTwoLoops(final int[] inputArray, final int target) {

    for (int i = 0; i < inputArray.length; i++) {
      if (inputArray[i] >= target) {
        continue;
      }
      for (int y = i + 1; y < inputArray.length; y++) {
        if (inputArray[i] + inputArray[y] == target) {
          return new int[]{i, y};
        }
      }
    }
    return null;
  }

  public int[] withMap(final int[] inputArray, final int target) {

    final Map<Integer, Integer> map = new HashMap<>();
    for (int i = 0; i < inputArray.length; i++) {
      final int complement = target - inputArray[i];
      if (map.containsKey(complement)) {
        return new int[]{map.get(complement), i};
      }
      map.put(inputArray[i], i);
    }
    return null;
  }
}
