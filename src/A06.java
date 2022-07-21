// 자릿수 더하기
// https://school.programmers.co.kr/learn/courses/30/lessons/12931

public class A06 {
    public static int solution(int n) {
        int answer = 0;
        var sb = new StringBuilder().append(n);

        for (int i = 0; i < sb.length(); ++i) {
            answer += Character.getNumericValue(sb.charAt(i));
        }

        return answer;
    }
}
