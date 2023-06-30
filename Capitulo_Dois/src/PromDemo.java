// O inesperado em uma promoção!
public class PromDemo {
    public static void main(String[] args){
        byte b;
        int i;

        b = 10;
        i = b * b; // Certo, não é necessária uma correção!!

        b = 10;
        b = (byte) (b * b); // coerção necessária
        System.out.println("i and b: "+ i + " " + b);
    }
}
