public class A01 {
    public static String solution(int a, int b) {
        String[] day = { "FRI", "SAT", "SUN", "MON", "TUE", "WED", "THU" };
        int[] month = { 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
        int dif = 0;

        for (int i = 0; i < a - 1; i++) {
            dif += month[i];
        }
        dif += b - 1;

        return day[dif % 7];
    }
}
