package bai5;

public class Demo {
    private String name = "A";
    int age = 20;
    protected String address = "HN";
    public String test = "CG";

    public String nonStatics = "non-static";
    public static String statics = "static";

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getAddress() {
        return address;
    }

    public String getTest() {
        return test;
    }
}
