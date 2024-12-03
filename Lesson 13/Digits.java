import java.util.ArrayList;
import java.util.List;

public class Digits {
    private final List<Integer> digitList;

    public Digits(int num) {
        digitList = new ArrayList<>();
        if (num == 0) {
            digitList.add(0);
        }
        while (num > 0) {
            digitList.add(0, num % 10);
            num /= 10;
        }
    }

    public List<Integer> getDigitList() {
        return digitList;
    }
}
