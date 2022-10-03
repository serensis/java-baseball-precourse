package baseball.view;

import baseball.model.BaseBall;
import org.mockito.internal.util.StringUtil;

import java.util.ArrayList;
import java.util.List;

public class BaseballView {
    public static String toString(BaseBall data) {
        List<String> result = new ArrayList<>();

        if (data.getBallCount() > 0) result.add(data.getBallCount()+"볼");
        if (data.getStrikeCount() > 0) result.add(data.getStrikeCount()+"스트라이크");

        return result.size() == 0 ? "낫싱" : String.join(" ", result);
    }
}
