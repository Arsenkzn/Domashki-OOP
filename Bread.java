public class Bread extends Foods {
    public Bread(String name, int price, int amount, String unit, int mountInPckage, double beforeDate,
            String typeFlour) {
        this.name = name;
        this.price = price;
        this.amount = amount;
        this.unit = unit;
        this.mountInPckage = mountInPckage;
        this.beforeDate = beforeDate;
        this.typeFlour = typeFlour;
    }

    public String info() {
        return ("Name: " + name + "; " + "Pice: " + price + "; " + "Amount: " + amount + "; " + "Unit: " + unit + "; "
                + "Amount in package: " + mountInPckage + "; " + "Before date: " + beforeDate + "; " + "Muka: "
                + typeFlour + ".");
    }
}
