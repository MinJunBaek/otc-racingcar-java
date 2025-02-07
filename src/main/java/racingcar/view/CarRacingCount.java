package racingcar.view;

import camp.nextstep.edu.missionutils.Console;

public class CarRacingCount {

  public static Integer carRacingCount() {
    System.out.print("시도할 횟수를 입력해주세요: ");
    return Integer.valueOf(Console.readLine());
  }
}