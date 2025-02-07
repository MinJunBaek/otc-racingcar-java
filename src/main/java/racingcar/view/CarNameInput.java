package racingcar.view;

import camp.nextstep.edu.missionutils.Console;

public class CarNameInput {

  // 실행 시켰으면 입력값 받기
  // 입력값 받기
  public static String[] CarInput() {
    System.out.print("자동차 이름을 ,(쉼표)를 기준으로 입력해주세요");
    return Console.readLine().trim().split(",");
  }
}
