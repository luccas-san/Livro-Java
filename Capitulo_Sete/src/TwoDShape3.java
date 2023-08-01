// Adiciona mais construtores a TwoDShape
public class TwoDShape3 {
    private double width;
    private double height;

    // Construtor padrão.
    TwoDShape3() {
        width = height = 0.0;
    }

    // Construtor parametrizado.
    TwoDShape3(double w, double h) {
        width = w;
        height = h;
    }

    // Constrói o objeto com altura e largura iguais.
    TwoDShape3(double x) {
        width = height = x;
    }

    // Métodos acessadores para width e height
    double getWidth() {return width;}
    double getHeight() {return height; }
    void setWidth(double w) { width = w; }
    void setHeight(double h) { height = h; }

    void showDim() {
        System.out.println("Width and height are " + width + " and " + height);
    }
}

// Subclasse de TwoDShape3 para triângulos.
class Triangle3 extends TwoDShape3 {
    private String style;

    // Construtor padrão.
    Triangle3() {
        super();
        style = "none";
    }
    // Construtor
    Triangle3(String s, double w, double h) {
        super(w, h); // chama construtor da superclasse

        style = s;
    }

    // Construtor um argumento.
    Triangle3 (double x) {
        super(x); // chama o construtor da superclasse

        style = "filled";
    }

    double area() {
        return getWidth() * getHeight() / 2;
    }

    void showStyle() {
        System.out.println("Triangle is " + style);
    }
}

class Shape5 {
    public static void main(String[] args) {
        Triangle3 t1 = new Triangle3();
        Triangle3 t2 = new Triangle3("outlined", 8.0, 12.0);
        Triangle3 t3 = new Triangle3(4.0);

        t1 = t2;

        System.out.println("Info for t1: ");
        t1.showStyle();
        t1.showDim();
        System.out.println("Area is " + t1.area());

        System.out.println();

        System.out.println("Info for t2: ");
        t2.showStyle();
        t2.showDim();
        System.out.println("Area is " + t2.area());

        System.out.println();

        System.out.println("Info for t3: ");
        t3.showStyle();
        t3.showDim();
        System.out.println("Area is " + t3.area());

        System.out.println();
    }
}