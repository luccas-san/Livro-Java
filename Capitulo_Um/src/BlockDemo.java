/*
* Demonstra um bloco de código
*
* Chame este arquivo de BlockDemo.java
* */

public class BlockDemo {
    public static void main(String args []){
        double i, j, d;

        i = 5;
        j = 10;

        // o alvo desta instrução if é um bloco de Código
        if(i != 0) {
            System.out.println("i does not equal zero");
            d = j / i;
            System.out.println("j / i is "+ d);
        }
    }
}
