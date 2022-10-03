package baseball;

import baseball.controller.BaseBallController;

import static camp.nextstep.edu.missionutils.Console.readLine;

public class BaseBallGame {
    private BaseBallController baseBallController;
    public BaseBallGame(BaseBallController baseBallController) {
        this.baseBallController = baseBallController;
    }

    public void run() {
        String result = "";
        do {
            String data = getUserData();
            if (baseBallController.checkInGameData(data))
                result = baseBallController.checkInputData(data);

            System.out.println(result);
        } while (false);

//            isContinue = baseBallController.checkContinue(data);
    }

    public String getUserData() {
        System.out.print("숫자를 입력해주세요 : ");
        String inputData = readLine();
        return inputData;
    }
}
