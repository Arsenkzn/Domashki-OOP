public class ToiletPepper extends Higienes {
    public ToiletPepper(String name, int price, int amount, String unit, int mountInPckage, int numbersLayers) {
        this.name = name;
        this.price = price;
        this.amount = amount;
        this.unit = unit;
        this.mountInPckage = mountInPckage;
        this.numbersLayers = numbersLayers;
    }

    public String info() {
        return ("Name: " + name + "; " + "Pice: " + price + "; " + "Amount: " + amount + "; " + "Unit: " + unit + "; "
                + "Amount in package: " + mountInPckage + "; " + "Numbers Layers" + numbersLayers + ".");
    }
}
