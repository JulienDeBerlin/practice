package stechuhr;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

import lombok.SneakyThrows;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class WorkingTimeTest {

  @Test
  @DisplayName("eachUnitOneTime")
  @SneakyThrows
  void createWorkingTime_eachUnitOneTime() {
    // Preparation

    // Execution
    var result = WorkingTime.createWorkingTime("5w 3d 2h 15m");

    // Assertion
    assertAll(
        () -> assertEquals(5, result.getWorkingWeeks()),
        () -> assertEquals(3, result.getWorkingDays()),
        () -> assertEquals(2, result.getHours()),
        () -> assertEquals(15, result.getMinutes())
    );
  }

  @Test
  @DisplayName("some unit missings")
  @SneakyThrows
  void testMethodName_SomeTestDescription() {

  }

  @Test
  @DisplayName("input not correct")
  @SneakyThrows
  void testMethodName_inputNotCorrect() {

  }

}
