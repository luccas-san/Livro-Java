import java.io.*;

// Lê um string no console usando um BufferedReader
public class ReadLines {
    public static void main(String[] args) throws IOException {

        // cria um BufferedReader usando System.in
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        String str;

        System.out.println("Enter lines of text.");
        System.out.println("Enter 'stop' to quit.");
        do {
            str = br.readLine();
            System.out.println(str);
        } while(!str.equals("stop"));
    }
}
