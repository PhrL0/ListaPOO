public class Carro implements Veiculo{
    @Override
    public void mover() {
        System.out.println("Stututu");
    }

    public static void main(String[] args) {
        Carro hondaNSX = new Carro();

        hondaNSX.mover();
    }
}
