public class SixthProgram {
    static void main(String[] args) {
        int age = 17;
        Boolean access = age >= 18 ? true : false;
        System.out.println("Your access are "  + access);

        int dinheiro = 1000;
        String conseguecomprar = "Você tem o saldo disponível";
        String naoconseguecomprar = "Você não tem o dinheiro disponível";
        String resultado  = dinheiro >= 1000 ? conseguecomprar : naoconseguecomprar;
        System.out.printf(resultado);
    }
}
