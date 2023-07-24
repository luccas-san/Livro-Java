import java.util.Scanner;
import java.util.Locale;

public class MetrosPolegadas {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double polegadas, metros;
        int contador;

        contador = 0;
        for(polegadas = 1; polegadas <= 144; polegadas++) {
            metros = polegadas / 39.37;
            System.out.println(polegadas + " polegadas é "+ metros +" metros.");

            contador++;

            if(contador == 12) {
                System.out.println();
                contador = 0;
            }
        }

        sc.close();
    }
}
