/* Exibe um arquivo de texto
*
* Para usar este programa, especifique
* o nome do arquivo que deseja ver.
* Por exemplo, para ver um arquivo chamado
* TEST.TXT, use a linha de comando abaixo.
*
* java ShowFile TEST.TXT
* */

import java.io.*;

public class ShowFile {
    public static void main(String[] args) {
        int i;
        FileInputStream fin;

        // Primeiro verifica se um arquivo foi especificado.
        if(args.length != 1) {
            System.out.println("Usage: ShowFile File");
            return;
        }

        try {
            fin = new FileInputStream(args[0]);
        } catch(FileNotFoundException exc) {
            System.out.println("File Not Found");
            return;
        }

        try {
            // lê bytes até o EOF ser alcançado
            do {
                i = fin.read();
                if(i != -1) System.out.println((char) i);
            } while (i != -1);
        } catch(IOException exc) {
            System.out.println("Error Reading File.");
        } finally {
            // Fecha o arquivo quando está para sair do bloco try
            try {
                fin.close();
            } catch(IOException exc) {
                System.out.println("Error Closing File.");
            }
        }

    }
}
