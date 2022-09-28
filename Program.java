import javax.swing.GrayFilter;

public class Program {
    private static void printInfo(General general) {
        System.out.println(general.getClass().getName() + " parametrs: " + general.info());
    }

    public static void main(String[] args) {
        General general = new General();
        Egg egg = new Egg("Yaratel", 55, 1, "Upakovka", 10, 12.2022);
        Soska soska = new Soska("Litle Baby", 120, 1, "Shtuka", 0, false);
        Pampers pampers = new Pampers("Litle Baby", 1200, 1, "Shtuka", 1, false, 22, 6, 10, "girl");
        Masks masks = new Masks("Maska", 555, 20, "Upakovka", 100);
        ToiletPepper toiletPepper = new ToiletPepper("Zeva", 235, 4, "Upakovka", 8, 3);
        Bread bread = new Bread("Bulka", 35, 1, "Shtuka", 1, 30.09, "White");
        Lemonade lemonade = new Lemonade("Buratino", 50, 1, "bottle", 1, 5.2023);
        Milk milk = new Milk("Proctokbvashino", 130, 1, "bottle", 1.2023, 1, 3.2);

        // printInfo(general);
        System.out.println("Foods:");
        printInfo(egg);
        printInfo(bread);
        System.out.println("------------------------------------------------------------");
        System.out.println("Drinks:");
        printInfo(lemonade);
        printInfo(milk);
        System.out.println("------------------------------------------------------------");
        System.out.println("Children products:");
        printInfo(soska);
        printInfo(pampers);
        System.out.println("------------------------------------------------------------");
        System.out.println("Higienes:");
        printInfo(masks);
        printInfo(toiletPepper);

    }
}