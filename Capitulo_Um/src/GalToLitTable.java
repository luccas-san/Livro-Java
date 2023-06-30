/*
* Tente isto 1 - 2
*
* Este programa exibe uma tabela de
* conversões de galões em litros
*
* Chame-o de "GalToLitTable.java".
* */
public class GalToLitTable {
    public static void main(String args[]) {
        double gallons, liters;
        int counter;

        counter = 0;
        for(gallons = 1; gallons <= 100; gallons++) {
            liters = gallons * 3.7854; // converte para litros
            System.out.println(gallons + " gallons is " + liters + " liters.");

            counter++;
            // a cada décima linha, exibe uma linha em branco
            if(counter == 10) {
                System.out.println();
                counter = 0; // zera o contador de linhas
            }
        }
    }
}
