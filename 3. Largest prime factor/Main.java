public class Main {

    static long number = 600851475143L;
    static long backup = 8462696833L;

    public static void main(String[] args) {
        
        System.out.print(getBiggestPrimeFactor(number - 2));

    }

    static long getBiggestPrimeFactor(long n){
        long prime = 2;
        long factorResult = n;

        while (factorResult != 1){
            factorResult = divideNumberByPrime(factorResult, prime);
            prime = factorResult == 1 ? prime : prime + 1;
        }
        
        return prime;
    }

    static long divideNumberByPrime(long n, long prime){

        long numberToDivide = n;
        while (numberToDivide % prime == 0){
            numberToDivide = numberToDivide / prime;
        }

        return numberToDivide;
    }
}