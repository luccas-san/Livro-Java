// Adiciona um construtor
package vehicle6;

public class Vehicle {
    int passengers; // número de passageiros
    int fuelcap; // capacidade de armazenamento de combustível em galões
    int mpg; // consumo de combustível em milhas por galão

    // Esse é um construtor para Vehicle
    Vehicle(int p, int f, int m){
        passengers = p;
        fuelcap = f;
        mpg = m;
    }

    // Retorna a autonomia
    int range() {
        return mpg * fuelcap;
    }

    // Calcula o combustível necessário para cobrir uma determinada distância.
    double fuelneeded(int miles) {
        return (double) miles / mpg;
    }
}

class VehConsDemo {
    public static void main(String[] args) {

        // constrói veiculos completos
        Vehicle minivan = new Vehicle(7, 16, 21);
        Vehicle sportscar = new Vehicle(2, 14, 12);

        double gallons;
        int dist = 252;

        gallons = minivan.fuelneeded(dist);

        System.out.println("To go "+ dist + " miles minivan needs "+ gallons + " gallons of fuel.");

        gallons = sportscar.fuelneeded(dist);

        System.out.println("To go "+ dist + " miles sportscar needs "+ gallons + " gallons of fuel.");
    }
}
