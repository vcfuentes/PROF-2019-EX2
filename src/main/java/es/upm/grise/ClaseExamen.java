package es.upm.grise;

import java.util.ArrayList;
import java.util.List;

public class ClaseExamen{
    public static List<Integer> primos(int n) throws EntradaInvalida{
        if(n < 1)
            throw new EntradaInvalida(n);

        List<Integer> primosN = new ArrayList<Integer>();
        int i = 2;

        while(n > 1){
            if(n % i == 0){
                primosN.add(i);
                n /= i;
            }else{
                i++;
            }
        }
        return primosN;
    }
}
