// Adiciona um construtor a Triangle.

// Uma classe para objetos bidimensionais
public class TwoDShape2 {

    private double width; // agora esses
    private double height; // membros são privados

    // Membros acessadores para width e height
    double getWidth(){ return width; }
    double getHeight(){ return height; }
    void setWidth(double w){width = w; }
    void setHeight (double h){height = h; }

    void showDim() {
        System.out.println("Width and height are "+ width + " and "+ height);
    }
}

// Uma subclasse de TwoShape para triângulos.
class Triangle2 extends TwoDShape2 {
    private String style;

    // Construtor
    Triangle2(String s, double w, double h) {
        setWidth(w);
        setHeight(h);

        style = s;
    }

    double area() {
        return getWidth() * getHeight() / 2;
    }

    void showStyle() {
        System.out.println("Triangle is " + style);
    }
}

class Shape2 {
    public static void main(String[] args) {
        Triangle2 t1 = new Triangle2("filled", 4.0, 4.0);
        Triangle2 t2 = new Triangle2("outlined", 8.0, 12.0);

        System.out.println("Info for t1: ");
        t1.showStyle();
        t1.showDim();
        System.out.println("Area is " + t1.area());

        System.out.println();

        System.out.println("Info for t2: ");
        t2.showStyle();
        t2.showDim();
        System.out.println("Area is " + t2.area());
    }
}