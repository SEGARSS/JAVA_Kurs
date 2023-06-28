package Java_DZ.dz_07.Domen;

public class HotDrink extends Product {
    private int temperature;

    public HotDrink(int price, int place, String name, long id, int temperature) {
        super(price, place, name, id);
        this.temperature = temperature;
    }

    public int getTemperature() {
        return temperature;
    }

    @Override
    public String toString() {
        return super.toString() + "Temperature = " + temperature + "\n";
    }
}
