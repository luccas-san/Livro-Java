// Uma classe de fila de caracteres melhorada
public class Queue {

    //agora esses membros são privados
    private char q[]; // esse array contém a fila
    private int putloc, getloc; // os indices put e get

    Queue(int size) {
        q = new char[size]; // aloca memória para a fila
        putloc = getloc = 0;
    }

    // Constrói uma fila a partir de outra
    Queue(Queue ob) {
        putloc = ob.putloc;
        getloc = ob.getloc;
        q = new char[ob.q.length];

        // copia elementos
        for(int i = getloc; i < putloc; i++)
            q[i] = ob.q[i];

    }

    // Constrói uma fila com valores iniciais
    Queue(char a[]){
        putloc = 0;
        getloc = 0;
        q = new char[a.length];

        for(int i = 0; i < a.length; i++) put(a[i]);
    }

    // Insere um caractere na fila
    void put(char ch) {
        if(putloc == q.length) {
            System.out.println(" - Queue is full.");
            return;
        }

        q[putloc++] = ch;
    }

    // Obtém um caractere da fila.
    char get() {
        if(getloc == putloc) {
            System.out.println(" - Queue is empty.");
            return (char) 0;
        }

        return q[getloc++];
    }
}

// Demonstra a classe Queue
class QDemo2 {
    public static void main(String[] args) {

        // constrói uma fila vazia para 10 elementos
        Queue q1 = new Queue(10);

        char name[] = {'T', 'o', 'm'};
        // constrói uma fila a partir do array
        Queue q2 = new Queue(name);

        char ch;
        int i;

        // insere alguns caracteres em q1
        for(i = 0; i < 10; i++)
            q1.put((char) ('A' + i));

        // constrói uma fila a partir de outra
        Queue q3 = new Queue(q1);

        // Exibe as filas
        System.out.print("Content of q1: ");
        for(i = 0; i < 10; i++) {
            ch = q1.get();
            System.out.print(ch);
        }

        System.out.println("\n");

        System.out.print("Content of q2: ");
        for(i = 0; i < 3; i++) {
            ch = q2.get();
            System.out.print(ch);
        }

        System.out.println("\n");

        System.out.print("Contents of q3: ");
        for(i = 0; i < 10; i++) {
            ch = q3.get();
            System.out.print(ch);
        }
    }
}
