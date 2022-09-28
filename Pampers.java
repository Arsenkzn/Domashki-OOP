public class Pampers extends ChildrensProducts {
    public Pampers(String name, int price, int amount, String unit, int minimumAge, boolean allergenicity, int size,
            int minimumWeight, int maximumWeight, String type) {
        this.name = name;
        this.price = price;
        this.amount = amount;
        this.unit = unit;
        this.minimumAge = minimumAge;
        this.allergenicity = allergenicity;
        this.size = size;
        this.minimumAge = minimumAge;
        this.maximumWeight = maximumWeight;
        this.type = type;
    }

    public String info() {
        return ("Name: " + name + "; " + "Pice: " + price + "; " + "Amount: " + amount + "; " + "Unit: " + unit + "; "
                + "Minimum age: " + minimumAge + "; " + "Hiperallergenicity: " + allergenicity + "; "
                + "Minimum weight: " + minimumAge + "; " + "Maximum weight: " + maximumWeight + "; " + "Type: " + type
                + ".");
    }
}
