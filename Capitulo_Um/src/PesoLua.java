import java.util.Scanner;
import java.util.Locale;

public class PesoLua {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double peso = 0.0;

        System.out.print("Informe o seu peso: ");
        peso = sc.nextDouble();

        double pesoLua = peso * 0.17;

        System.out.println("O seu Peso na Lua é de: "+ pesoLua);

        sc.close();
    }
}
