package series;

public interface Series {
    int getNext(); // Retorna o próximo número da série
    void reset(); // reinicia
    void setStart(int x); // define o valor inicial
}
