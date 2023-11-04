package stechuhr;

import java.util.Arrays;
import java.util.HashMap;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class WorkingTime {

  private int minutes;
  private int hours;
  private int workingDays;
  private int workingWeeks;


  public static WorkingTime createWorkingTime(String inputAsString) {

    HashMap<Character, Integer> timeHolder = new HashMap<>();

    Arrays.stream(inputAsString.split(" "))
        .forEach(timeElement -> timeHolder.put(
            timeElement.charAt(timeElement.length() - 1),
            Integer.valueOf(timeElement.substring(0, timeElement.length() - 1))
        ));

    var parsedValue = new WorkingTime();
    if (timeHolder.containsKey('w')) {
      parsedValue.setWorkingWeeks(timeHolder.get('w'));
    }
    if (timeHolder.containsKey('d')) {
      parsedValue.setWorkingDays(timeHolder.get('d'));
    }
    if (timeHolder.containsKey('h')) {
      parsedValue.setHours(timeHolder.get('h'));
    }
    if (timeHolder.containsKey('m')) {
      parsedValue.setMinutes(timeHolder.get('m'));
    }
    return parsedValue;
  }


  @Override
  public String toString() {
    var timeAsString = "";

    if (workingWeeks!= 0){
      timeAsString = timeAsString.concat(workingWeeks + "w ");
    }

    if (workingDays!= 0){
      timeAsString = timeAsString.concat(workingDays + "d ");
    }

    if (hours!= 0){
      timeAsString = timeAsString.concat(hours + "h ");
    }

    if (minutes!= 0){
      timeAsString = timeAsString.concat(minutes + "m");
    }

    return  timeAsString;
  }


  public WorkingTime makeItReadable() {

    var readableWorkingTime = new WorkingTime();

    readableWorkingTime.setMinutes(minutes % 60);

    var totalHours = hours + minutes / 60;
    readableWorkingTime.setHours(totalHours % 8);

    var totalWorkingDays = workingDays + totalHours / 8;
    readableWorkingTime.setWorkingDays(totalWorkingDays % 40);

    readableWorkingTime.setWorkingWeeks(workingWeeks + totalWorkingDays / 40);
    return readableWorkingTime;
  }
}
