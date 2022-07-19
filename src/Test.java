
public class Test {
    // int[] checkIn = { 9, 7, 8, 9, 7, 9, 8 };
    // int[] checkOut = { 23, 22, 26, 26, 29, 27, 22 };
    public int solution(int[] checkin, int[] checkout) {
        // 누적 시간
        int answer = 0;

        for (int i = 0; i < checkin.length; i++) {
            // 체크아웃 시간이 새벽 5시, 즉 29(24+5) 이상이면 9시(21)로 처리하고, 아니면 그대로 넣는다.
            var out = checkout[i] > 28 ? 21 : checkout[i];
            // 체크아웃 시간에서 체크인 시간을 빼고 누적시간에 더해준다.
            answer += out - checkin[i];
        }
        return answer;
    }

    public String solution(int month, int day) {
        String answer = "";
        int[] daysOfMonths = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

        int daysLeftThisMonth = daysOfMonths[month - 1] - day;
        int daysLeftFromNextMonth = 98 - daysLeftThisMonth;

        int thisMonth = 0;
        for (int i = 0; i < 3; i++) {
            thisMonth = month + i > 11 ? month + i - 11 : month + i;
            if (daysLeftFromNextMonth > daysOfMonths[thisMonth]) {
                daysLeftFromNextMonth -= daysOfMonths[thisMonth];
            }
        }

        thisMonth++;
        System.out.println("" + thisMonth + "월 " + daysLeftFromNextMonth + "일");

        return answer;
    }
}
