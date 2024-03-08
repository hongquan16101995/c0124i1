package bai5;

public class Main {
    public static void main(String[] args) {
        Demo demo = new Demo();
//        System.out.println(demo.age);
//        System.out.println(demo.address);
//        System.out.println(demo.test);
        // đối tượng truy cập thành phần non-static
        System.out.println(demo.nonStatics);
        // đối tượng truy cập thành phần static
        System.out.println(demo.statics);
        // lớp truy cập thành phần static
        System.out.println(Demo.statics);
    }
}
