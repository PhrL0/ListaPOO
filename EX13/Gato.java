public class Gato extends Animal {
    @Override
    public void fazerSom() {
        System.out.println("Miando...");
    }

    public static void main(String[] args) {
        Gato draco = new Gato();

        draco.fazerSom();
    }
}
