public class Main {

    static double number = 6008514751434332424545342353323D;
    static long backup = 8462696833L;

    public static void main(String[] args) {
        
        int INIT_NUMBER = 100;
        int FINAL_NUMBER = 999;
        int INIT_RANGE = INIT_NUMBER * INIT_NUMBER;
        int FINAL_RANGE = FINAL_NUMBER * FINAL_NUMBER;
        for (int i = FINAL_RANGE; i >= INIT_RANGE; i--){
            if (isPalindrome(i)){
                if (hasFactorsInterval(i, INIT_NUMBER, FINAL_NUMBER)){
                    System.out.println(i);
                    break;
                }
            }
        }



    }


    static boolean isPalindrome(int n){

        String strInversed = new StringBuffer(String.valueOf(n)).reverse().toString();
        String strNormal = String.valueOf(n);

        if (strNormal.equals(strInversed)){
            return true;
        }
        else {
            return false;
        }
    }

    static boolean hasFactorsInterval(int n, int initN, int finalN){
        for (int i = finalN; i >= initN; i--){
            if (n % i == 0 && n / i < finalN){
                return true;
            }
        }
        return false;
    }

}