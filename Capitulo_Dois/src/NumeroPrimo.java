// Desafio dado pelo livro. Fazer um programa para encontrar
// os números primos de 2 a 100.

public class NumeroPrimo {
    public static void main(String[] args) {

        int i, j;
        boolean primo;

        for(i =2; i < 100; i++){
            primo = true;

            // verifica se o número tem a divisão exata
            for(j = 2; j <= i/j; j++) {
                // se tiver, não é primo
                if((i % j) == 0) primo = false;
            }

            if(primo){
                System.out.println(i + " é primo.");
            }
        }
    }
}
