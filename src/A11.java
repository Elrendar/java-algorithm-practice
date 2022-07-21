// 콜라츠 추측
// https://school.programmers.co.kr/learn/courses/30/lessons/12943

public class A11 {
    public static int solution(int num) {
        if (num == 1) {
            return 0;
        }

        long temp = num;
        int count = 0;
        while (count < 500) {
            if (temp == 1) {
                return count;
            }

            if (temp % 2 == 0) {
                temp /= 2;
                ++count;
                continue;
            }

            if (temp % 2 == 1) {
                temp *= 3;
                ++temp;
                ++count;
            }
        }

        return -1;
    }
}
