package bai5;

public class Demo2 {
    int a;
    static int b;

    public void m1() {
        System.out.println(a);
        System.out.println(b);
        m2();
    }

    public static void m2() {
        System.out.println(b);
//        System.out.println(a);
//        m1();
    }
}
