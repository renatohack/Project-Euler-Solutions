public class MultiplesThreeFive {
    public static void main(String[] args) {
        
        int sum = 0;

        for (int i = 0; i < 1000; i++){
            if (isMultiple(i)){
                sum += i;
            }
        }

        System.out.print(sum);
    }

    static boolean isMultiple(int number){
        if (number % 3 == 0 || number % 5 == 0){
            return true;
        }
        else {
            return false;
        }
    }
}