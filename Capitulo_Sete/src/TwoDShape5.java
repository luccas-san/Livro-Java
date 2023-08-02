// Um desoacho dinâmico de métodos
public class TwoDShape5 {
    private double width;
    private double height;
    private String name;

    // Construtor padrão.
    TwoDShape5() {
        width = height = 0.0;
        name = "nome";
    }

    // Construtor parametrizado
    TwoDShape5(double w, double h, String n) {
        width = w;
        height = h;
        name = n;
    }

    // Constrói objeto com largura e altura iguais
    TwoDShape5(double x, String n) {
        width = height = x;
        name = n;
    }

    // Constrói um objeto a partir do outro.
    TwoDShape5(TwoDShape5 ob) {
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

    double area() {
        System.out.println("area() must be overridden");
        return 0.0;
    }
}

// Subclasse de TwoDShape para triângulos.
class Triangle5 extends TwoDShape5 {
    private String style;

    // Construtor padrão
    Triangle5() {
        super();
        style = "none";
    }

    // Construtor para Triangle.
    Triangle5(String s, double w, double h) {
        super(w , h, "Triangle");

        style = s;
    }

    // Construtor com um argumento
    Triangle5(double x) {
        super(x, "Triangle"); // chama construtor da superclasse

        style = "filled";
    }

    // Constrói um objeto a partir de outro.
    Triangle5(Triangle5 ob) {
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
class Rectangle extends TwoDShape5 {
    // Construtor padrão
    Rectangle() {
        super();
    }

    // Construtor para Rectangle.
    Rectangle(double w, double h) {
        super(w, h, "Rectangle"); // chama construtor da superclasse
    }

    // Constrói um quadrado.
    Rectangle(double x) {
        super(x, "rectangle"); // chama construtor da superclasse
    }

    // Constrói um objeto a partir de outro.
    Rectangle(Rectangle ob) {
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

class DynShape {
    public static void main(String[] args) {
        TwoDShape5 shapes[] = new TwoDShape5[5];

        shapes[0] = new Triangle5("outlined", 8.0, 12.0);
        shapes[1] = new Rectangle(10);
        shapes[2] = new Rectangle(10, 4);
        shapes[3] = new Triangle5(7.0);
        shapes[4] = new TwoDShape5(10, 20, "generic");

        for(int i = 0; i < shapes.length; i++) {
            System.out.println("object is " + shapes[i].getName());
            System.out.println("Area is " + shapes[i].area());
            System.out.println();
        }
    }
}