package programmers;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {
    Solution sl = new Solution();

    @Test
    void solutionTest() {
        Assertions.assertEquals(12, sl.solution(2, 2, new int[][]{{1, 1}, {2, 2}}));
        Assertions.assertEquals(3225685, sl.solution(51, 37, new int[][]{{17, 19}}));
    }
}



