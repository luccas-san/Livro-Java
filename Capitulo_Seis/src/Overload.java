// Demonstra a sobrecarga de métodos
public class Overload {

    void ovlDemo() {
        System.out.println("No parameters");
    }

    // Sobrecarga ovlDemo para um parâmetro inteiro.
    void ovlDemo(int a) {
        System.out.println("One parameter: "+ a);
    }

    // Sobrecarga ovlDemo para dois parâmetros inteiros
    int ovlDemo(int a, int b) {
        System.out.println("Two parameters: "+ a + " "+ b);
        return a + b;
    }

    // Sobrecarga ovlDemo para dois parâmetros double
    double ovlDemo(double a, double b) {
        System.out.println("Two double parameters: " + a + " "+ b);
        return a + b;
    }
}

class OverloadDemo {
    public static void main(String[] args) {

        Overload ob = new Overload();
        int resI;
        double resD;

        // chama todas as versões de ovlDemo()
        ob.ovlDemo();
        System.out.println();

        ob.ovlDemo(2);
        System.out.println();

        resI = ob.ovlDemo(4, 6);
        System.out.println("Result of ob.oovlDemo(4, 6): "+ resI);
        System.out.println();

        resD = ob.ovlDemo(1.1, 2.32);
        System.out.println("Result of ob.ovlDemo(1.1, 2.32): "+ resD);
    }
}
