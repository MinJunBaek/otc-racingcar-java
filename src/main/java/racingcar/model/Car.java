package racingcar.model;

import camp.nextstep.edu.missionutils.Randoms;

public class Car {

  // 이름부여
  private String name;
  private Integer distance = 0;

  // 이름은 5자 이하
  public Car(String name) {
    if (name.length() > 5) {
      throw new IllegalArgumentException("잘못 입력하였습니다.");
    }
    this.name = name;
  }

  public void move() {
    if (Randoms.pickNumberInRange(0, 9) < 4) {
      this.distance += 1;
    }
  }

  private String distanceTraveled() {
    return "-".repeat(distance);
  }

  // 이름출력
  @Override
  public String toString() {
    return this.name + ": " + distanceTraveled();
  }
}
