import java.util.*;
import java.util.stream.IntStream;

public class SmallestMultiple {

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