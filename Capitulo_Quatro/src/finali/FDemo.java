/*
 * Tente isto 4 - 2
 *
 * Demonstre a coleta de lixo e o método finalize().
 */
package finali;

public class FDemo {
    int x;

    FDemo(int i) {
        x = i;
    }

    // chamada quando o objeto é reciclado
    protected void finalmente() {
        System.out.println("Finalizing "+ x);
    }

    // gera um objeto que é imediatamente destruido
    void generator(int i){
        FDemo o = new FDemo(i);
    }
}

class Finalize {
    public static void main(String[] args) {
        int count;

        FDemo ob = new FDemo(0);

        /* Agora, gera um grande número de objetos.
        * Em algum momento, a coleta de lixo ocorrerá.
        * Nota: você pode ter de aumentar o número
        * de objetos gerados para forçar a coleta de lixo. */

        for(count = 1; count < 100000; count++) ob.generator(count);
    }
}