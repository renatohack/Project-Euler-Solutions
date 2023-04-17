public class Main {

    static double number = 6008514751434332424545342353323D;
    static long backup = 8462696833L;

    public static void main(String[] args) {
        
        // System.out.print(getBiggestPrimeFactor(number - 3));
        System.out.print(teste(number));
    }

    static double teste(double n){
        int factor = 2;
        int lastFactor = 1;

        if (n % 2 == 0){
            lastFactor = 2;
            n = n / 2;
            while (n % 2 == 0){
                n = n / 2;
            }
        }
        else {
            lastFactor = 1;
        }

        factor = 3;
        double maxFactor = Math.sqrt(n);

        while (n > 1 && factor < maxFactor){
            if (n % factor == 0){
                n = n / factor; 
                lastFactor = factor;
                while (n % factor == 0){
                    n = n / factor;
                }
                maxFactor = Math.sqrt(n);
            }

            factor = factor + 2;
        }

        if (n == 1){
            return lastFactor;
        }
        else {
            return n;
        }
    }

    static long getBiggestPrimeFactor(double n){
        long prime = 2;
        double factorResult = n;

        while (factorResult != 1){
            factorResult = divideNumberByPrime(factorResult, prime);
            prime = factorResult == 1 ? prime : prime + 1;
        }
        
        return prime;
    }

    static double divideNumberByPrime(double n, long prime){

        double numberToDivide = n;
        while (numberToDivide % prime == 0){
            numberToDivide = numberToDivide / prime;
        }

        return numberToDivide;
    }
}