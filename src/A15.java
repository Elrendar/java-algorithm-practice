// 같은 숫자는 싫어
// https://school.programmers.co.kr/learn/courses/30/lessons/12906

import java.util.ArrayList;
import java.util.LinkedHashSet;

public class A15 {
    public static int[] solution(int[] arr) {
        var list = new ArrayList<Integer>();

        int temp = 10;
        for (int i = 0; i < arr.length; i++) {
            if (temp != arr[i]) {
                list.add(arr[i]);
            }
            temp = arr[i];
        }

        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}
