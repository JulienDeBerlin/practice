package stechuhr;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;
import lombok.SneakyThrows;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class StechuhrTest {

  @Test
  @DisplayName("return expected computation")
  @SneakyThrows
  void testMethodName_ReturnExpectedTimes() {
    // Preparation
    var underTest = new Stechuhr();

    // Execution
    var result = underTest.computeWorkingTime(List.of(
        "8h 30m", "2d 1h", "45m"
    ));

    // Assertion
    assertEquals("3d 2h 15m", result);
  }


  @Test
  @DisplayName("computing ok")
  @SneakyThrows
  void computeTotalTime_ComputingOk() {
    // Preparation
    var underTest = new Stechuhr();

    // Execution
    var result = underTest.computeTotalTime(List.of("8h 30m", "2d 1h", "45m"));

    // Assertion
    assertAll(
        () -> assertEquals(75, result.getMinutes()),
        () -> assertEquals(9, result.getHours()),
        () -> assertEquals(2, result.getWorkingDays()),
        () -> assertEquals(0, result.getWorkingWeeks())
    );

  }

}
