package old;// 나누어 떨어지는 숫자 배열
// https://school.programmers.co.kr/learn/courses/30/lessons/12910

//import java.util.ArrayList;
//import java.util.Collections;

import java.util.Arrays;

public class A02 {
    public static int[] solution(int[] arr, int divisor) {
        // ArrayList<Integer> answerList = new ArrayList<Integer>();
        // for (var i = 0; i < arr.length; i++) {
        // if (arr[i] % divisor == 0) {
        // answerList.add(arr[i]);
        // }
        // }
        // if (answerList.size() == 0) {
        // return new int[] { -1 };
        // }
        // Collections.sort(answerList);

        // int[] answer = new int[answerList.size()];
        // for (int i = 0; i < answerList.size(); i++) {
        // answer[i] = answerList.get(i).intValue();
        // }

        var ans = Arrays.stream(arr)
                .filter(factor -> factor % divisor == 0)
                .sorted().toArray();

        if (ans.length == 0)
            return new int[]{-1};

        return ans;
    }
}
