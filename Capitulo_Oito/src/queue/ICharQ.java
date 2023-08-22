package queue;
// Interface da fila de caracteres
public interface ICharQ {
    // Insere um caractere na fila.
    void put(char ch);

    // Remove um caractere da fila.
    char get();
}
