
public class Egg extends Foods {
    public Egg(String name, int price, int amount, String unit, int mountInPckage, double beforeDate) {
        this.name = name;
        this.price = price;
        this.amount = amount;
        this.unit = unit;
        this.mountInPckage = mountInPckage;
        this.beforeDate = beforeDate;
    }

    public String info() {
        return ("Name: " + name + "; " + "Pice: " + price + "; " + "Amount: " + amount + "; " + "Unit: " + unit + "; "
                + "Amount in package: " + mountInPckage + "; " + "Before date: " + beforeDate + ".");
    }
}
