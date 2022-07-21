// 3진법 뒤집기
// https://school.programmers.co.kr/learn/courses/30/lessons/68935

public class A13 {
    public static int solution(int n) {
        var ternary = Integer.toString(n, 3);
        ternary = new StringBuilder(ternary).reverse().toString();

        int answer = Integer.parseInt(ternary, 3);
        return answer;
    }
}
