/* Esta variação encapsula o código que abre
* e acessa o arquivo dentro do mesmo bloco try.
* O arquivo é fechado pelo bloco finally.
* */

import java.io.*;

public class ShowFile2 {
    public static void main(String[] args) {
        int i;
        FileInputStream fin = null;

        // Primeiro, confirma se um nome de arquivo foi esepcificado
        if(args.length != 1) {
            System.out.println("Usage: ShowFile filename");
            return;
        }

        // a seguir abre um arquivo, lê caracteres até EOF ser alcançado
        // e então fecha o arquivo via um bloco finally.
        try {
            fin = new FileInputStream(args[0]);

            do {
                i = fin.read();
                if(i != -1) System.out.print((char) i);
            } while(i != -1);

        } catch(FileNotFoundException exc) {
            System.out.println("File Not Found.");
        } catch(IOException exc) {
            System.out.println("An I/O Error Occurred");
        } finally {
            // fecha o arquivo em todos os casos.
            try {
                if(fin != null) fin.close();
            } catch(IOException exc) {
                System.out.println("Error Closing File");
            }
        }
    }
}
