package Mitarbeiter;

public class DemoEmployee {
    public static void main(String[] args) {
        FixCommissionEmployee Niki = new FixCommissionEmployee("Niki", "Kachelmaier", "It", 5000 ,1000);
        System.out.println("Niki = " + Niki);
        System.out.println("Niki.getFullsalary() = " + Niki.getFullsalary());
        System.out.println("----------------------------------");

        PercentCommisionEmployee Hannes = new PercentCommisionEmployee("Hannes", "Temmel", "IT", 18000, 10);
        System.out.println("Hannes = " + Hannes);
        System.out.println("Hannes.getFullsalary() = " + Hannes.getFullsalary());
    }
}
