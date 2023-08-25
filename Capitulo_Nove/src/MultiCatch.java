// Usa o recurso multi-catch. Nota: Este código requer JDK 7 ou
// posterior para ser compilado.
public class MultiCatch {
    public static void main(String[] args) {
        int a = 88, b = 0;
        int result;
        char chrs[] = {'A', 'B', 'C'};

        for(int i = 0; i < 2; i++) {
            try {
                if(i == 0)
                    result = a / b; // gera uma ArithmeticException
                else
                    chrs[5] = 'X'; // gera uma ArrayIndexOutBoundsException
            } catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {
                System.out.println("Exception caught: " + e);
            }
        }

        System.out.println("After multi-catch.");
    }
}
