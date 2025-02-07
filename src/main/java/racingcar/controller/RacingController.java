package racingcar.controller;

import java.util.Arrays;
import java.util.List;
import racingcar.model.Car;
import racingcar.view.CarNameInput;
import racingcar.view.CarRacingCount;

public class RacingController {

  public void start() {
    List<Car> carList = carConstructor(CarNameInput.CarInput());
    int count = CarRacingCount.carRacingCount();
    for (int i = 0; i < count; i++) {
      carMove(carList);
      carView(carList);
    }
  }

  private List<Car> carConstructor(String[] carNames) {
    return Arrays.stream(carNames).map(Car::new).toList();
  }

  private void carMove(List<Car> carList) {
    carList.stream().forEach(car -> car.move());
  }

  private void carView(List<Car> carList) {
    carList.stream().forEach(each -> System.out.print(each + "\n"));
    System.out.println();
  }
}
