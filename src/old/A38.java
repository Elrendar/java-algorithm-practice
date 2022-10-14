package old;

import java.util.ArrayList;
import java.util.Stack;

public class A38 {
    public static int solution(int[][] board, int[] moves) {
        int answer = 0;
        // board
        // {0, 0, 0, 0, 0}, {0, 0, 1, 0, 3}, {0, 2, 5, 0, 1},
        // {4, 2, 4, 4, 2}, {3, 5, 1, 3, 1}
        // moves
        // {1, 5, 3, 5, 1, 2, 1, 4}

        ArrayList<Stack<Integer>> boardStack = new ArrayList<>();
        for (int[] ints : board) {
            boardStack.add(new Stack<>());
        }

        Stack<Integer> bucketStack = new Stack<>();

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                if (board[board.length - 1 - j][i] != 0) {
                    boardStack.get(i).push(board[board.length - 1 - j][i]);
                }
            }
        }

        int next = 0;

        for (int i = 0; i < moves.length; i++) {
            if (boardStack.get(moves[i] - 1).empty()) {
                continue;
            }

            next = boardStack.get(moves[i] - 1).pop();
            if (bucketStack.empty() || bucketStack.peek() != next) {
                bucketStack.push(next);
            } else {
                bucketStack.pop();
                answer += 2;
            }
        }

        System.out.println(answer);

        return answer;
    }
}
