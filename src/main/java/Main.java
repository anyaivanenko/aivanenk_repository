/**
 * Created by aivanenk on 16.02.2016.
 */
public class Main {
    public static void main(String[] args) {
        Cat Barsik = new Cat(15.6, "Сіамська");
        Cat Masik = new Cat(13.6, "Персидська");
        Cat Tom = new Cat(11.75, "Сибірська");
        Cat Myrka = new Cat(10.05, "Мейн-кун");
        // Barsik.printCat();
        // Masik.printCat();
        // Tom.printCat();
        // Myrka.printCat();
        System.out.print("Швидкість Барсіка=" + Barsik.getMaxSpeed() + "\n");
        Barsik.setMaxSpeed(2 * Barsik.getMaxSpeed());
        System.out.print("Подвоєна швидкість Барсіка=" + Barsik.getMaxSpeed() + "\n");
        System.out.print("Швидкість Масіка=" + Masik.getMaxSpeed() + "\n");
        Masik.setMaxSpeed(2 * Masik.getMaxSpeed());
        System.out.print("Подвоєна швидкість Масіка=" + Masik.getMaxSpeed() + "\n");
        System.out.print("Швидкість Тома=" + Tom.getMaxSpeed() + "\n");
        Tom.setMaxSpeed(2 * Tom.getMaxSpeed());
        System.out.print("Подвоєна швидкість Тома=" + Tom.getMaxSpeed() + "\n");
        System.out.print("Швидкість Мурки=" + Myrka.getMaxSpeed() + "\n");
        Myrka.setMaxSpeed(2 * Myrka.getMaxSpeed());
        System.out.print("Подвоєна швидкість Мурки=" + Myrka.getMaxSpeed() + "\n");
        double averageSpeed = (Barsik.getMaxSpeed() + Masik.getMaxSpeed() + Tom.getMaxSpeed() + Myrka.getMaxSpeed()) / 4;
        System.out.print("Середня швидкість = " + averageSpeed);
        double totalSum = (Barsik.getMaxSpeed() + Masik.getMaxSpeed() + Tom.getMaxSpeed() + Myrka.getMaxSpeed());
        System.out.print("\nЗагальна швидкість = " + totalSum);

    }
}
