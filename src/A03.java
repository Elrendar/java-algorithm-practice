
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
