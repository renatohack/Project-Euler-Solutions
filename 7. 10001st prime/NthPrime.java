import java.util.*;

public class NthPrime {

    public static void main(String[] args) {

        List<Integer> listPrimes = new ArrayList<>();
        listPrimes.add(2);
        int nPrime = 10001;

        int number = 3;
        while (listPrimes.size() != nPrime){
            int primeNumber = number;
            for (int i : listPrimes){
                primeNumber = (int) divideNumberByPrime(primeNumber, i);
                if (primeNumber == 1){
                    break;
                }
            }
            if (primeNumber != 1){
                listPrimes.add(primeNumber);
            }
            number++;
        }

        System.out.println(listPrimes.get(listPrimes.size() - 1));

    }

    static double divideNumberByPrime(double n, long prime){

        double numberToDivide = n;
        while (numberToDivide % prime == 0){
            numberToDivide = numberToDivide / prime;
        }

        return numberToDivide;
    }

}