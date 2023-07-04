// Um programa que usa a classe Vehicle
package vehicle;

public class Vehicle {
    int passengers; // numero de passageiros
    int fuelcap; // capacidade de armazenamento de combustivel
    int mpg; // consumo de combustivel de milhas por galão
}

// Essa classe declara um objeto do tipo Vehicle.
class VehicleDemo {
    public static void main(String[] args) {
        Vehicle minivan = new Vehicle();
        int range;

        // atribui valores a campos de minivan
        minivan.passengers = 7;
        minivan.fuelcap = 16;
        minivan.mpg = 21;

        // calcula a autonomia presumindo um tanque cheio de gasolina
        range = minivan.fuelcap * minivan.mpg;
        System.out.println("Minivan can carry "+ minivan.passengers + " with a range of "+ range);
    }
}
