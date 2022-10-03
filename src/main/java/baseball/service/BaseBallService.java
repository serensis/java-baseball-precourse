package baseball.service;

import baseball.model.BaseBall;

import static camp.nextstep.edu.missionutils.Randoms.pickNumberInRange;

public class BaseBallService {
    private BaseBall baseBall;

    public BaseBallService() {
        initData();
    }

    public void initData() {
        baseBall = new BaseBall();

        String conj = "";
        conj += Integer.toString(pickNumberInRange(1,9));
        conj += Integer.toString(pickNumberInRange(1,9));
        conj += Integer.toString(pickNumberInRange(1,9));
        baseBall.setExpectValue(conj);
    }


    public BaseBall checkInputData(String input) { // 값 체크는 이미 완료되어 있어야 함
        // 비교 로직 설정
        // 값 비교값 입력 후 모델값 리턴
        baseBall.setInputValue(input);
        // checkStrikeAndBall();
        return baseBall;
    }
}
