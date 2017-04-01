package codility;

/**
 * Created by faiaz on 01.04.17.
 */
public class Radius {
    public static void main(String[] args) {
        System.out.println(solution(4));
    }

    public static int solution(int N) {
        return (4 * N + 1) + (4 * (int)Math.pow((double)(N - 1), 2.0));
    }
}
