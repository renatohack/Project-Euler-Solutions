import java.util.*;
import java.util.stream.IntStream;

public class Main {

    static double number = 6008514751434332424545342353323D;
    static long backup = 8462696833L;

    public static void main(String[] args) {
        
        int[] arrNumbers = IntStream.range(3, 21).toArray();

        List<Integer> listaFatores = new ArrayList<>();
        listaFatores.add(2);

        for (int i : arrNumbers){
            for (int j : listaFatores){
                if (i % j == 0){
                    i = i / j;
                }
            }
            if (i != 1){
                listaFatores.add(i);
            }
        }

        int product = 1;
        for (int i : listaFatores){
            product = product * i;
        }

        System.out.println(product);

    }

}