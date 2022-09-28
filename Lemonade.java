public class Lemonade extends Drinks {
    public Lemonade(String name, int price, int amount, String unit, int mountInPckage, double beforeDate) {
        this.name = name;
        this.price = price;
        this.amount = amount;
        this.unit = unit;

    }

    public String info() {
        return ("Name: " + name + "; " + "Pice: " + price + "; " + "Amount: " + amount + "; " + "Unit: " + unit + ".");
    }
}