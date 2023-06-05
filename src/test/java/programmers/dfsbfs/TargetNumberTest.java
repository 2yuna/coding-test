package programmers.dfsbfs;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class TargetNumberTest {

    TargetNumber tn = new TargetNumber();

    @Test
    public void test() {
        Assertions.assertEquals(5, tn.solution(new int[]{1, 1, 1, 1, 1},3));
        Assertions.assertEquals(2, tn.solution(new int[]{4, 1, 2, 1},4));
    }
}