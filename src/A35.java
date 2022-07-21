// https://school.programmers.co.kr/learn/courses/30/lessons/17681

import java.util.ArrayList;

public class A35 {
    public static String[] solution(int n, int[] arr1, int[] arr2) {
        var list = new ArrayList<String>();
        var answerList = new ArrayList<String>();

        var temp = new StringBuilder();
        for (int i = 0; i < n; i++) {
            temp.append(Integer.toBinaryString(arr1[i] | arr2[i]));
            while (temp.length() < n) {
                temp.insert(0, "0");
            }
            list.add(temp.toString());

            temp.delete(0, temp.length());
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (list.get(i).charAt(j) == '1') {
                    temp.append("#");
                } else {
                    temp.append(" ");
                }
            }
            answerList.add(temp.toString());
            temp.delete(0, temp.length());
        }

        return answerList.toArray(new String[0]);
    }
}
