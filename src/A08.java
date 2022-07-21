// 정수 내림차순으로 배치하기
// https://school.programmers.co.kr/learn/courses/30/lessons/12933

import java.util.Arrays;
import java.util.Comparator;

public class A08 {
    public long solution(long n) {
//        long answer = 0;
//
//        String s = Long.toString(n);
//        String[] sarr = s.split("");
//
//        Arrays.sort(sarr, Comparator.reverseOrder());
//        answer = Long.parseLong(String.join("", sarr));
//
//        return answer;
        return Long.parseLong(String.valueOf(n).chars()
                .mapToObj(ch -> (char) ch)
                .sorted(Comparator.reverseOrder())
                .collect(StringBuilder::new,
                        StringBuilder::appendCodePoint,
                        StringBuilder::append)
                .toString());
    }
}
