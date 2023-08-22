// Usando os métodos Throwable
public class ExcTest2 {
    static void genException() {
        int nums[] = new int[4];

        System.out.println("Before exception is generated.");

        // gera uma exceção de índice fora do limite
        nums[7] = 10;
        System.out.println("this won't be displayed");
    }
}

class UseThrowableMethods {
    public static void main(String[] args) {

        try {
            ExcTest2.genException();
        } catch (ArrayIndexOutOfBoundsException exc) {
            // captura a exceção
            System.out.println("Standard message is: ");
            System.out.println(exc);
            System.out.println("\nStack trace: ");
            exc.printStackTrace();
        }
        System.out.println("After catch statement.");
    }
}