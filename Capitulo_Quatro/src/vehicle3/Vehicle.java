// Adiciona range a vehicle
package vehicle3;

public class Vehicle {
    int passengers; // número de passageiros
    int fuelcap; // capacidade de armazenamento de combustivel em galôes
    int mpg; // consumo de combustivel em milhas por galão

    //  Exibe a autonomia
    void range() {
        System.out.println("Range is "+ fuelcap * mpg);
    }
}

class AddMeth {
    public static void main(String[] args) {
        Vehicle minivan = new Vehicle();
        Vehicle sportscar = new Vehicle();

        int range1, range2;

        // Atribui valores a campos de minivan
        minivan.passengers = 7;
        minivan.fuelcap = 16;
        minivan.mpg = 21;

        // Atribui valores a campos de sportscar
        sportscar.passengers = 2;
        sportscar.fuelcap = 14;
        sportscar.mpg = 12;

        System.out.print("Minivan can carry "+ minivan.passengers + ". ");
        minivan.range();

        System.out.print("Sportscar can carry "+ sportscar.passengers+ ". ");
        sportscar.range();
    }
}
