package vehicle4;

public class Vehicle {
    int passengers; // númerode passageiros
    int fuelcap; // capacidade de armazenamento de combustivel em galões
    int mpg; // consumo de combustivel em milhas por galão

    // Retorna a autoomia
    int range(){
        return mpg * fuelcap;
    }
}

class RetMeth {
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

        range1 = minivan.range();
        range2 = sportscar.range();

        System.out.println("Minivan can carry " + minivan.passengers + " with range of "+ range1 + " Miles.");
        System.out.println("Sportscar can carry " + sportscar.passengers + " with range of "+ range2 + " Miles.");
    }
}
