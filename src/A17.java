// 로또의 최고 순위와 최저 순위
// https://school.programmers.co.kr/learn/courses/30/lessons/77484

import java.util.ArrayList;
import java.util.Arrays;

public class A17 {
    public static int[] solution(int[] lottos, int[] win_nums) {
        int[] ranking = {6, 6, 5, 4, 3, 2, 1};

        var noZero = new ArrayList<Integer>();
        var zeroCount = 0;
        for (int lotto : lottos) {
            if (lotto != 0) {
                noZero.add(lotto);
            } else {
                ++zeroCount;
            }
        }

        int winCount = 0;
        for (Integer integer : noZero) {
            if (Arrays.stream(win_nums).anyMatch(num -> num == integer)) {
                ++winCount;
            }
        }
        
        return new int[]{ranking[zeroCount + winCount], ranking[winCount]};
    }
}
