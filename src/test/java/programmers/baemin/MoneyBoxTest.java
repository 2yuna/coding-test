package programmers.baemin;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class MoneyBoxTest {

    MoneyBox box = new MoneyBox();

    @Test
    void test() {
        Assertions.assertEquals(1294200, box.solution(new int[]{1000, 800, 900}, 1000000, 3));
        Assertions.assertEquals(209000, box.solution(new int[]{9000, 10000, 8520, 9500}, 110000, 4));
    }

}