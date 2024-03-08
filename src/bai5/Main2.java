package bai5;

public class Main2 {
    public static void main(String[] args) {
        Demo demo1 = new Demo();
        Demo demo2 = new Demo();
        System.out.println(demo1.statics);
        System.out.println(demo1.nonStatics);
        System.out.println(demo2.statics);
        System.out.println(demo2.nonStatics);
        demo1.statics = "HelloWorld";
        demo1.nonStatics = "ByeWorld";
        System.out.println("-------");
        System.out.println(demo1.statics);
        System.out.println(demo1.nonStatics);
        System.out.println(demo2.statics);
        System.out.println(demo2.nonStatics);
    }
}
