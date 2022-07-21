import java.util.Locale;

public class A05 {
    public static String solution(String s) {
        var answer = new StringBuilder();
        var charArr = s.split("");

        int index = 0;
        for (int i = 0; i < charArr.length; i++) {
            if (charArr[i].equals(" ")) {
                index = 0;
            } else if (index % 2 == 0){
                charArr[i] = charArr[i].toUpperCase();
                ++index;
            } else if (index % 2 == 1){
                charArr[i] = charArr[i].toLowerCase();
                ++index;
            }

            answer.append(charArr[i]);
        }

        return answer.toString();
    }
}
