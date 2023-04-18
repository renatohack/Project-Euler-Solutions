public class Main {

    public static void main(String[] args) {
        
        int n = 100;
        int squareSum = (int) Math.pow(sumPA(1, n), 2);
        int sumSquares = sumSquares(n);

        System.out.println(squareSum - sumSquares);
        
    }

    static int sumPA(int initialN, int finalN){
        int sum = finalN * (initialN + finalN) / 2;

        System.out.println(sum);
        return sum;
    }

    static int sumSquares(int n){
        int sum = n * (2*n + 1) * (n + 1) / 6;
        System.out.println(sum);
        return sum;
    }

}