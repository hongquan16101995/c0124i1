package bai2;

import bai5.Demo;

public class Main extends Demo {
    public static void main(String[] args) {
        Demo demo = new Demo();
        Main main = new Main();
        System.out.println(main.address);
    }

    public void m1() {
        System.out.println(this.address);
    }
}
