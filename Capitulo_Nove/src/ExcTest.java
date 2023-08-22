public class ExcTest {
    // Gera uma exceção
    static void genException() {
        int nums[] = new int[4];

        System.out.println("Before exception is genereted.");

        // gera uma exceção de índice fora do limite.
        nums[7] = 10;
        System.out.println("this won't be displayed.");
    }
}

class ExcDemo2 {
    public static void main(String[] args) {

        try {
            ExcTest.genException();
        } catch (ArrayIndexOutOfBoundsException exc) {
            // captura a execução
            System.out.println("Index out-of-bounds!");
        }
        System.out.println("After catch statement.");
    }
}
