package baitap;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Car[] cars = new Car[3];

        // thêm thông tin cho các đối tượng, đưa vào mảng
        add(cars, scanner);

        // duyệt mảng, gọi phương thức
        m1(cars);
    }

    public static void add(Car[] cars, Scanner scanner) {
        for (int i = 0; i < cars.length; i++) {
            System.out.println("Nhập hãng xe: ");
            String brand = scanner.nextLine();
            System.out.println("Nhập màu xe: ");
            String color = scanner.nextLine();
            System.out.println("Nhập tên động cơ xe: ");
            String engine = scanner.nextLine();
            System.out.println("Nhập số nhiên liệu tiêu thụ của xe: ");
            long oil = Long.parseLong(scanner.nextLine());
            Car car = new Car(brand, color, engine, oil);
            cars[i] = car;
        }
    }

    public static void m1(Car[] cars) {
        for (Car c : cars) {
            c.display();
            c.information();
        }
    }
}
