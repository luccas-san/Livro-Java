import java.io.*;

// Usa um BefferedReader para ler caracteres do console
public class ReadChars {
    public static void main(String[] args) throws IOException {
        char c;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter characters, period to quit.");

        // lê caracteres
        do {
            c = (char) br.read();
            System.out.println(c);
        } while(c != '.');
    }
}
