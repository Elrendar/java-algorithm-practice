package old;// 자연수 뒤집어 배열로 만들기
// https://school.programmers.co.kr/learn/courses/30/lessons/12932

import java.util.ArrayList;

public class A07 {
    public static int[] solution(long n) {
        var str = Long.toString(n);
        var strArr = str.split("");
        ArrayList<Integer> intArr = new ArrayList<>();
        int j = 0;
        for (var i = str.length() - 1; i > -1; --i) {
            intArr.add(Integer.valueOf(strArr[i]));
        }

        int[] answer = new int[intArr.size()];
        for (int i = 0; i < intArr.size(); ++i) {
            answer[i] = intArr.get(i);
        }

        return answer;
    }
}
