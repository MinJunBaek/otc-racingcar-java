package racingcar.model;

import java.util.ArrayList;
import java.util.List;

public class CarRepository<Car> {

  public List<Car> carList = new ArrayList<>();
  
  public void current() {
    carList.stream().forEach(each -> System.out.println(each));
    System.out.println();
  }
}
