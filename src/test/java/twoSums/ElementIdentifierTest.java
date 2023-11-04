package twoSums;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import org.junit.jupiter.api.Test;

class ElementIdentifierTest {

  ElementIdentifier underTest = new ElementIdentifier();

  @Test
  void findTwoElementsInArrayToReachTarget_elementsIncreaseOrder() {
    //Preparation
    final var inputArray = new int[]{1, 5, 8, 10, 15};
    final var target = 6;

    //Execution
    final var result = underTest.withMap(inputArray, target);

    //Assertion
    assertThat(result, is(new int []{0,1}));
  }

  @Test
  void findTwoElementsInArrayToReachTarget_elementsDecreaseOrder() {
    //Preparation
    final var inputArray = new int[]{15, 10, 8, 5, 1};
    final var target = 6;

    //Execution
    final var result = underTest.withMap(inputArray, target);

    //Assertion
    assertThat(result, is(new int []{3,4}));
  }

  @Test
  void findTwoElementsInArrayToReachTarget_elementsUnordered() {
    //Preparation

    final var inputArray = new int[]{15, 1, 10, 5, 8};
    final var target = 6;

    //Execution
    final var result = underTest.withMap(inputArray, target);

    //Assertion
    assertThat(result, is(new int []{1,3}));
  }
}
