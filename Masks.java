public class Masks extends Higienes {
    public Masks(String name, int price, int amount, String unit, int mountInPckage) {
        this.name = name;
        this.price = price;
        this.amount = amount;
        this.unit = unit;
        this.mountInPckage = mountInPckage;
    }

    public String info() {
        return ("Name: " + name + "; " + "Pice: " + price + "; " + "Amount: " + amount + "; " + "Unit: " + unit + "; "
                + "Amount in package: " + mountInPckage + ".");
    }
}
