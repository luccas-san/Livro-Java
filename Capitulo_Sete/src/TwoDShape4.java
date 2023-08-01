// Hierarquia de vários níveis
public class TwoDShape4 {
    private double width;
    private double height;

    // Construtor padrão
    public TwoDShape4() {
        width = height = 0.0;
    }

    // Construtor parametrizado
    public TwoDShape4(double w, double h) {
        width = w;
        height = h;
    }

    // Constrói objeto com largura e altura iguais.
    TwoDShape4(double x) {
        width = height = x;
    }

    // Métodos acessadores para width e heigth
    double getWidth() {return width; }
    double getHeight() {return height; }
    void setWidth(double w) {width = w; }
    void setHeight(double h) {height = h; }

    void showDim() {
        System.out.println("Width and height are " + width + " and " + height);
    }
}

// Estende TwoDShape.
class Triangle4 extends TwoDShape4 {
    private String style;

    // Construtor padrão
    Triangle4(){
        super();
        style = "none";
    }

    Triangle4(String s, double w, double h) {
        super(w, h); // chama construtor da superclasse
        style = s;
    }

    // Construtor com argumento
    Triangle4(double x) {
        super(x); // chama construtor da super classe

        style = "filled";
    }

    double area() {
        return getWidth() * getHeight() / 2;
    }

    void showStyle() {
        System.out.println("Triangle is " + style);
    }
}

// Estende Triangle4.
class ColorTriangle extends Triangle4 {
    private String color;

    ColorTriangle(String c, String s, double w, double h) {
        super(s, w, h);
        color = c;
    }

    String getColor() {return color; }

    void showColor() {
        System.out.println("Color is " + color);
    }
}

class Shapes6 {
    public static void main(String[] args) {
        ColorTriangle t1 = new ColorTriangle("Blue", "outlined", 8.0, 12.0);
        ColorTriangle t2 = new ColorTriangle("Red", "filled", 2.0, 2.0);

        System.out.println("Info for t1: ");
        t1.showStyle();
        t1.showDim();
        t1.showColor();
        System.out.println("Area is " + t1.area());

        System.out.println();

        System.out.println("Info for t2: ");
        t2.showStyle();
        t2.showDim();
        t2.showColor();
        System.out.println("Area is " + t2.area());
    }
}