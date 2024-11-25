public class ContaBancaria {
    private double saldo;
    private int numero;

    public double getSaldo() {
        return saldo;
    }

    public void depositar(double saldo) {
        this.saldo = saldo;
        System.out.println("Dinheiro depositado com sucesso!");
    }
}
