// 수박수박수박수박수박수?
// https://school.programmers.co.kr/learn/courses/30/lessons/12922

public class A03 {
    public static String solution(int count) {
        var sb = new StringBuilder();
        for (int i = 0; i < count; i++) {
            if (i % 2 == 0) {
                sb.append("수");
            } else {
                sb.append("박");
            }
        }

        return sb.toString();
    }
}
