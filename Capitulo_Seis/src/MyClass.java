// Acesso publico versus privado
public class MyClass {

    private int alpha; // acesso privado
    public int beta; // acesso publico
    int gamma; // acesso padrão

    /* Métodos para acessar alpha. Não há problema
    * em um membro de uma classe acessar um membro
    * privado da mesma classe.
    * */

    void setAlpha(int a) {
        alpha = a;
    }

    int getAlpha() {
        return alpha;
    }
}

class AcessDemo {
    public static void main(String[] args) {

        MyClass ob = new MyClass();

        /* O Acesso a alpha só é permitido por intermédio
        * de seus métodos acessadores. */
        ob.setAlpha(-99);
        System.out.println("ob.alpha is "+ ob.getAlpha());

        // Você não pode acessar alpha dessa forma:
        // ob.alpha = 10; // Errado! alpha é privado!

        // Essas linhas estão corretas porque beta e gama são públicos
        ob.beta = 88;
        ob.gamma = 99;
    }
}
