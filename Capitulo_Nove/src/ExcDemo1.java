public class ExcDemo1 {
    public static void main(String[] args) {
        int nums[] = new int[4];

        try {
            System.out.println("Before exception is generated.");

            // Gera uma exceção de índice fora dos limites.
            nums[7] = 10;
            System.out.println("this won't be displayed");
        }
        catch (ArrayIndexOutOfBoundsException exc) {
            // captura a exceção
            System.out.println("Index out-of-bounds!");
        }
        System.out.println("After catch statement.");
    }
}
