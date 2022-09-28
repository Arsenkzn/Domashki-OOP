public class Soska extends ChildrensProducts {
    public Soska(String name, int price, int amount, String unit, int minimumAge, boolean allergenicity) {
        this.name = name;
        this.price = price;
        this.amount = amount;
        this.unit = unit;
        this.minimumAge = minimumAge;
        this.allergenicity = allergenicity;
    }

    public String info() {
        return ("Name: " + name + "; " + "Pice: " + price + "; " + "Amount: " + amount + "; " + "Unit: " + unit + "; "
                + "Minimum age: " + minimumAge + "; " + "Hiperallergenicity: " + allergenicity + ".");
    }
}
