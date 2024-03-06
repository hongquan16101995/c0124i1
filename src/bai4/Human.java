package bai4;

public class Human {
    // thành phần của lớp: được gọi là thuộc tính
    // mô tả cho đặc tính của đối tương
    String name;
    int age;
    double weight;
    double height;

    // hàm khởi tạo: constructor(tham số tương ứng thuộc tính)
    // constructor trong Java: có tên trung tên lớp, không có void hoặc kdl trả về
    // phương thức này chuyên để tạo đối tuợng bằng từ khóa new
    // gán giá trị thuộc tính nếu có
    // lớp trong Java sẽ có 1 constructor mắc định không tham số
    // nếu không có constructor nào được khai báo

    // constructor không tham số
    public Human() {}

    // constructor full tham số
    public Human(String name, int age, double weight, double height) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.height = height;
    }

    // thành phần của lớp: gọi là phương thức
    // mô tả cho hành vi của đối tượng
    // ngoài ra, còn có các cặp getter/setter để lấy dữ liệu hoặc cài đặt dữ liệu cho thuộc tính
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
