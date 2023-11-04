package stechuhr;

import java.util.List;

public class Stechuhr {

  public String computeWorkingTime(List<String> workingSessions) {
    return computeTotalTime(workingSessions)
        .makeItReadable()
        .toString();
  }


  public WorkingTime computeTotalTime(List<String> workingSessions) {
    var totalWorkingTime= new WorkingTime();
    workingSessions.stream()
        .map(WorkingTime::createWorkingTime)
        .forEach(session -> {
          totalWorkingTime.setWorkingWeeks(
              totalWorkingTime.getWorkingWeeks() + session.getWorkingWeeks());
          totalWorkingTime.setWorkingDays(
              totalWorkingTime.getWorkingDays() + session.getWorkingDays());
          totalWorkingTime.setHours(
              totalWorkingTime.getHours() + session.getHours());
          totalWorkingTime.setMinutes(
              totalWorkingTime.getMinutes() + session.getMinutes());
        });
    return totalWorkingTime;
  }


}

