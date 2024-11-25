public class TesteContaBancaria {
    public static void main(String[] args) {
        ContaBancaria conta1 = new ContaBancaria();

        double pix = 2000;

        System.out.println("Seu saldo atual é: " + conta1.getSaldo());
        conta1.depositar(pix);
        System.out.println("Seu saldo atual é: " + conta1.getSaldo());

    }
}
