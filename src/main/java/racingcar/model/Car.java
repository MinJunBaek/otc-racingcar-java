package racingcar.model;

public class Car {

  // 이름부여
  private String name;
  private Integer distanceTraveled;

  // 이름은 5자 이하
  public Car(String name) {
    if (name.length() <= 5) {

    }
  }

  public void distanceTraveledAdd() {
    this.distanceTraveled += 1;
  }

  public String distanceTraveled() {
    return "-".repeat(distanceTraveled);
  }

  // 이름출력
  @Override
  public String toString() {
    return this.name + ": ";
  }
}
