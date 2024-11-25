public class Bicicleta implements Veiculo{
    @Override
    public void mover() {
        System.out.println("Trim trim");
    }

    public static void main(String[] args) {
        Bicicleta bike = new Bicicleta();

        bike.mover();
    }
}
