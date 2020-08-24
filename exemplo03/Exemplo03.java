package exemplo03;

import java.util.ArrayList;

public class Exemplo03 {
    public static void main(String[] args) {

        ArrayList<Integer> numeros = new ArrayList<>();
        int soma;

        System.out.println(numeros);

        numeros.add(20);
        numeros.add(5);
        numeros.add(3);

        System.out.println(numeros);

        for (int i = 0 ; i < numeros.size() ; i++){
            System.out.println(numeros.get(i));
        }
        System.out.println(numeros);
    }
    
}