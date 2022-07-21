// 제일 작은 수 제거하기
// https://school.programmers.co.kr/learn/courses/30/lessons/12935

import java.util.Arrays;

public class A10 {
    public static int[] solution(int[] arr) {
        if (arr.length == 1) {
            return new int[]{-1};
        }

        int[] answer = new int[arr.length - 1];
        var smallest = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (smallest > arr[i]) {
                smallest = arr[i];
            }
        }

        var answerIndex = 0;
        for (int j : arr) {
            if (smallest == j) {
                continue;
            } else {
                answer[answerIndex] = j;
                ++answerIndex;
            }
        }

        return answer;

//        int min = Arrays.stream(arr).min().getAsInt();
//        return Arrays.stream(arr).filter(i -> i != min).toArray();
    }
}
