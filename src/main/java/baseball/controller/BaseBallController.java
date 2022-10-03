package baseball.controller;

import baseball.model.BaseBall;
import baseball.service.BaseBallService;
import baseball.view.BaseballView;

public class BaseBallController {
    private BaseBallService baseBallService;

    public BaseBallController(
            BaseBallService baseBallService
    ){
        this.baseBallService = baseBallService;
    }

    public String checkInputData(String input) {
        String result = "";
        if (validNumber(input))
        {
            BaseBall baseBall = baseBallService.checkInputData(input);
            result = BaseballView.toString(baseBall);
        }
        return result;
    }

    public boolean checkInGameData(String data) {
        return data.length() == 3;
    }

    public boolean isStop(String data) {
        if (data.length() <= 0) throw new IllegalArgumentException("길이가 안맞음");
        if (data.equals("1")) return false;
        if (data.equals("2")) return true;
        return false;
    }

    public boolean validNumber(String data) {
        try {
            return Integer.parseInt(data) > 0;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
