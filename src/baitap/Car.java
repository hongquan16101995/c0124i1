package baitap;

public class Car {
    private String brand;
    private String color;
    private String engine;
    long oil;

    public Car() {
    }

    public Car(String brand, String color, String engine, long oil) {
        this.brand = brand;
        this.color = color;
        this.engine = engine;
        this.oil = oil;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public long getOil() {
        return oil;
    }

    public void setOil(long oil) {
        this.oil = oil;
    }

    public void display() {
        System.out.println("Car of " + this.brand + "; have color is: " + this.color );
    }

    public void information() {
        System.out.println("Car have engine is: " + this.engine + "; spend over : " + this.oil );
    }
}
