public class EvenFibonacciNumbers {
    public static void main(String[] args) {
        
        int sum = 0;
        int penultNumber = 1;
        int lastNumber = 1;

        for (int nextNumber = 1; nextNumber < 4_000_000; nextNumber = lastNumber + penultNumber){

            if (isEven(nextNumber)){
                sum += nextNumber;
            }

            penultNumber = lastNumber;
            lastNumber = nextNumber;
        }

        System.out.print(sum);
    }

    static boolean isEven(int number){
        if (number % 2 == 0){
            return true;
        }
        else {
            return false;
        }
    }
}