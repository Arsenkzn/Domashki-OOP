public class Milk extends Drinks {
    public Milk(String name, int price, int amount, String unit, double beforeDate, int volume,
            double fatPercent) {
        this.name = name;
        this.price = price;
        this.amount = amount;
        this.unit = unit;
        this.beforeDate = beforeDate;
        this.volume = volume;
        this.fatPercent = fatPercent;
    }

    public String info() {
        return ("Name: " + name + "; " + "Pice: " + price + "; " + "Amount: " + amount + "; " + "Unit: " + unit + "; "
                + "Before date: " + beforeDate + "; " + "Volume: "
                + volume + "; " + "Fat percent: " + fatPercent + ".");
    }
}