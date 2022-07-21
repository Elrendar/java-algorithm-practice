// 최소직사각형
// https://school.programmers.co.kr/learn/courses/30/lessons/86491

import java.util.ArrayList;
import java.util.Collections;

public class A14 {
    public static int solution(int[][] sizes) {
        var larger = new ArrayList<Integer>();
        var smaller = new ArrayList<Integer>();

        for (int i = 0; i < sizes.length; i++) {
            if (sizes[i][0] > sizes[i][1]) {
                larger.add(sizes[i][0]);
                smaller.add(sizes[i][1]);
            } else {
                larger.add(sizes[i][1]);
                smaller.add(sizes[i][0]);
            }
        }
        int w = Collections.max(larger);
        int h = Collections.max(smaller);

        return w * h;

//        int width = 0;
//        int height = 0;
//
//        for (int[] size : sizes) {
//            width = Math.max(width, Math.max(size[0], size[1]));
//            height = Math.max(height, Math.min(size[0], size[1]));
//        }
//
//        return width * height;
    }
}
