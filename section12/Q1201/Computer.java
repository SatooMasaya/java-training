package section12.Q1201;

public class Computer extends TangibleAsset {

    private String makerName;

    public Computer(String name, int price, String color, String makerName) {
        super(name, price, color);
        this.makerName = makerName;
    }

    @Override
    String getName() {
        return this.name;
    }

    @Override
    int getPrice() {
        return this.price;
    }

    @Override
    String getColor() {
        return this.color;
    }

    String getMakerName() {
        return this.makerName;
    }

}
