package codility;

/**
 * Created by faiaz on 01.04.17.
 */
public class Closest {
    public static void main(String[] args) {
        int testValue = 25;
        int res = solution(testValue);
        System.out.println(res);
        System.out.println(FuncN(res));

    }

    public static int FuncN(int K) {
        if (K == 0) return 0;
        else return FuncN(K - 1) + K;
    }

    public static int solution(int N) {
        int resN = (int)Math.round((Math.sqrt(8 * N) - 1) / 2);
        if (FuncN(resN) > N) return resN - 1;
        else return resN;
    }
}
