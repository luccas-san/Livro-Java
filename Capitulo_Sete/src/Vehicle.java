// Tente isto 7 - 1
//
// Constrói uma subclasse de Vehicle para caminhões
public class Vehicle {
    private int passengers; // número de passageiros
    private int fuelcap; // capacidade de armazenamento de combustivel em galões
    private int mpg;

    // Este é um construtor para Vehicle.
    Vehicle(int p, int f, int m) {
        passengers = p;
        fuelcap = f;
        mpg = m;
    }

    // Retorna a autonomia.
    int range() {
        return mpg * fuelcap;
    }

    // Calcula o combustivel necessário para uma dada distãncia
    double fuelneeded(int miles){
        return (double) miles / mpg;
    }

    // Métodos de acesso de variáveis de instância.
    int getPassengers() { return passengers; }
    void setPassengers(int p) {passengers = p; }
    int getFuelcap() {return fuelcap; }
    void setFuelcap(int f) {fuelcap = f; }
    int getMpg() {return mpg; }
    void setMpg(int m) {mpg = m; }
}

// Estende Vehicle para criar a especialidade Truck.
class Truck extends Vehicle {

    private int cargocap; // capacidade de carga em libras

    // Este é um construtor para Truck
    Truck(int p, int f, int m, int c){
        // Inicializa membros de Vehicle usando o construtor de Vehicle
        super(p, f, m);
        cargocap = c;
    }

    // Métodos acessadores para cargocap
    int getCargo() { return cargocap; }
    void putCargo(int c) { cargocap = c; }
}

class TruckDemo {
    public static void main(String[] args) {

        // Constrói alguns caminhões
        Truck semi = new Truck(2, 200, 7, 44000);
        Truck pickup = new Truck(3, 28, 15, 2000);

        double gallons;
        int dist = 252;

        gallons = semi.fuelneeded(dist);

        System.out.println("Semi can carry " + semi.getCargo() + " pounds.");
        System.out.println("To go " + dist + " miles semi needs " + gallons + " gallons of fuel.\n");

        gallons = pickup.fuelneeded(dist);

        System.out.println("Pickup can carry " + pickup.getCargo() + " pounds.");
        System.out.println("To go "+ dist + " miles pickup needs " + gallons + " gallons of fuel.");
    }
}