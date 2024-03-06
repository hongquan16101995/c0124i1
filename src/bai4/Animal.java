package bai4;

public class Animal {
    // thuộc tính: <access modifier> <non-access> <static> KDL <tên>;
    // KDL, tên: bắt buộc có
    // 3 thành phần còn lại có thể có hoặc không
    String name;
    double weight;
    double height;

    public Animal() {
    }

    // constructor: <access> <tên lớp> (tham số)
    // access: không bắt buộc, thường là public
    // tên lớp: bắt buộc
    public Animal(String name, double weight, double height) {
        this.name = name;
        this.weight = weight;
        this.height = height;
    }

    public Animal(double weight, double height) {
        this.weight = weight;
        this.height = height;
    }

    // phương thức: <access> <non-access> <static> <KDL trả về / void> <tên>() {};
    // KDL hoặc void, tên: bắt buộc có
    // 3 thành phần còn lại có thể có hoặc không
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
}
