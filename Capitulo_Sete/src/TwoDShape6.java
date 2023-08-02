// Um desoacho dinâmico de métodos
abstract class TwoDShape6 {
    private double width;
    private double height;
    private String name;

    // Construtor padrão.
    TwoDShape6() {
        width = height = 0.0;
        name = "nome";
    }

    // Construtor parametrizado
    TwoDShape6(double w, double h, String n) {
        width = w;
        height = h;
        name = n;
    }

    // Constrói objeto com largura e altura iguais
    TwoDShape6(double x, String n) {
        width = height = x;
        name = n;
    }

    // Constrói um objeto a partir do outro.
    TwoDShape6(TwoDShape6 ob) {
        width = ob.width;
        height = ob.height;
        name = ob.name;
    }

    // Métodos acessadores para width e heigth.
    double getWidth() { return width; }
    double getHeight() {return height; }
    void setWidth(double w) { width = w; }
    void setHeight(double h) { height = h; }

    String getName() { return name; }

    void showDim() {
        System.out.println("Width and height are: "+ width + " and " + height);
    }

    abstract double area();
}

// Subclasse de TwoDShape para triângulos.
class Triangle6 extends TwoDShape6 {
    private String style;

    // Construtor padrão
    Triangle6() {
        super();
        style = "none";
    }

    // Construtor para Triangle.
    Triangle6(String s, double w, double h) {
        super(w , h, "Triangle");

        style = s;
    }

    // Construtor com um argumento
    Triangle6(double x) {
        super(x, "Triangle"); // chama construtor da superclasse

        style = "filled";
    }

    // Constrói um objeto a partir de outro.
    Triangle6(Triangle6 ob) {
        super(ob); // passa o objeto para demonstrar de TwoDShape
        style = ob.style;
    }

    // Sobrepõe area() para Triangle
    double area() {
        return getWidth() * getHeight() / 2;
    }

    void showStyle() {
        System.out.println("Triangle is " + style);
    }
}

// Subclasse de TwoDShape para retângulos.
class Rectangle2 extends TwoDShape6 {
    // Construtor padrão
    Rectangle2() {
        super();
    }

    // Construtor para Rectangle.
    Rectangle2(double w, double h) {
        super(w, h, "Rectangle"); // chama construtor da superclasse
    }

    // Constrói um quadrado.
    Rectangle2(double x) {
        super(x, "rectangle"); // chama construtor da superclasse
    }

    // Constrói um objeto a partir de outro.
    Rectangle2(Rectangle2 ob) {
        super(ob); // passa objeto para constructor de TwoDShape
    }

    boolean isSquare() {
        if(getWidth() == getHeight()) return true;
        return false;
    }

    // Sobrepõe area() para Rectangle.
    double area() {
        return getWidth() * getHeight();
    }
}

class DynShape2 {
    public static void main(String[] args) {
        TwoDShape6 shapes[] = new TwoDShape6[4];

        shapes[0] = new Triangle6("outlined", 8.0, 12.0);
        shapes[1] = new Rectangle2(10);
        shapes[2] = new Rectangle2(10, 4);
        shapes[3] = new Triangle6(7.0);

        for(int i = 0; i < shapes.length; i++) {
            System.out.println("object is " + shapes[i].getName());
            System.out.println("Area is " + shapes[i].area());
            System.out.println();
        }
    }
}