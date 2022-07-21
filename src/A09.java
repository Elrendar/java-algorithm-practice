// 정수 제곱근 판별
// https://school.programmers.co.kr/learn/courses/30/lessons/12934
public class A09 {
    public static long solution(long n) {
        // 제곱근을 구한다.
        var sqrt = Math.sqrt(n);
        
        // 제곱근을 반올림했을 때 값이 커진다면 소수점 이하 자리수가 존재하는 것이다
        if (Math.ceil(sqrt) > sqrt) {
            return -1;
        }

        // 그게 아니라면 제곱근 sqrt는 양의 정수이다.
        return (long) Math.pow(sqrt + 1, 2);
    }
}
