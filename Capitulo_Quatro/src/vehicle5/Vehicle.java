/*
* Adiciona um método parametrizado que calcula o combustível
* necessario para cobrir uma determinada distância.
* */
package vehicle5;
public class Vehicle {
    int passengers; // número de passageiros
    int fuelcap; // capacidade de armazenamento de combustível em galões
    int mpg; // consumo de combustível em milhas por galão

    // Retorna a autonomia
    int range() {
        return mpg * fuelcap;
    }
    // Calcula o combustével necessario para cobrir uma determinada distância
    double fuelneeded(int miles) {
        return (double) miles / mpg;
    }
}
class CompFuel {
    public static void main(String[] args) {
        Vehicle minivan = new Vehicle();
        Vehicle sportscar = new Vehicle();
        double gallons;
        int dist = 252;

        // atribui valores a campos de minivan
        minivan.passengers = 7;
        minivan.fuelcap = 16;
        minivan.mpg = 21;

        // atribui valores a campos de sportscar
        sportscar.passengers = 2;
        sportscar.fuelcap = 14;
        sportscar.mpg = 12;

        gallons = minivan.fuelneeded(dist);

        System.out.println("To go " + dist + " miles minivan needs " + gallons + " gallons of fuel.");

        gallons = minivan.fuelneeded(dist);

        System.out.println("To go "+ dist + " miles sportscar needs "+ gallons + " gallons of fuel.");
    }
}
