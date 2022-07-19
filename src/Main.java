public class Main {
    public static void main(String[] args) {
        var method = new Test();
        int[] checkIn = { 9, 7, 8, 9, 7, 9, 8 };
        int[] checkOut = { 23, 22, 26, 26, 29, 27, 22 };
        System.out.println(method.solution(1, 18));
    }
}