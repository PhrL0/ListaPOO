public class Cachorro extends  Animal{
    @Override
    public void fazerSom() {
        System.out.println("Latindo...");
    }

    public static void main(String[] args) {
        Cachorro spike = new Cachorro();
        spike.fazerSom();
    }
}
