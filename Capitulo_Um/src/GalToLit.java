/*
 * Tente isto 1-1
 *
 * Esse programa converte galôes em litros.
 *
 * Chame-o de GalToLit.java
 * */
public class GalToLit {

    public static void main(String args []) {
        double gallons; // contém o número de galões
        double liters; // contém a conversão para litros

        gallons = 10; // começa com 10 galôes

        liters = gallons * 3.7854; // converte para litros

        System.out.println(gallons + " gallons is " + liters + " liters.");
    }
}