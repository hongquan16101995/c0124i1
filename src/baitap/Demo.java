package baitap;

public class Demo {
    public static void main(String[] args) {
        Car car = new Car("nissan", "black", "v8", 50);
        System.out.println(car.getBrand());
        System.out.println(car.oil);
        car.setBrand("BMW");
        // Car.brand;
        // Car.getBrand();
        System.out.println(car.getBrand());
        // access modifier
        // 4 level: private, default, protected, public
        // 3 từ khóa: private, protected, public

        Car car1 = new Car();
        System.out.println(car1.getBrand());
        System.out.println(car1.getColor());
        System.out.println(car1.getEngine());
        System.out.println(car1.getOil());
        car1.setBrand("kia");

        Animal animal = new Animal();
    }
}
