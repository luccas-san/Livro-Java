// Uma classe de fila de caracteres melhorada
public class Queue {

    //agora esses membros são privados
    private char q[]; // esse array contém a fila
    private int putloc, getloc; // os indices put e get

    Queue(int size) {
        q = new char[size]; // aloca memória para a fila
        putloc = getloc = 0;
    }

    void put(char ch) {
        if(putloc == q.length) {
            System.out.println(" - Queue is full.");
            return;
        }

        q[putloc++] = ch;
    }

    // Obtém um caractere na fila.
    char get() {
        if(getloc == putloc) {
            System.out.println(" - Queue is empty.");
            return (char) 0;
        }
        return q[getloc++];
    }
}
