package exemplo02;

import java.util.ArrayList;

public class Exemplo02 {
    public static void main(String[] args) {

        ArrayList<String> nomes = new ArrayList<>();

        System.out.println(nomes);

        nomes.add("Huginho");
        nomes.add("Zezinho");
        nomes.add("Luzinho");

        System.out.println(nomes);

        for (int i = 0 ; i < nomes.size() ; i++){
            System.out.println(nomes.get(i));
        }

    }
    
}