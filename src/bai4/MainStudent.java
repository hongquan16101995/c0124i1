package bai4;

public class MainStudent {
    public static void main(String[] args) {
        // dùng constructor không tham số => thuộc tính có giá trị mặc định
        Student student = new Student();
        // dùng constructor full tham số => cài đặt giá trị cho các thuộc tính
        Student student1 = new Student("nguyen van a", 20, "HN");
        // truy xuất thuộc tính: tên đối tượng + . + tên thuộc tính
        // lưu ý: nếu access cho phép truy cập
        System.out.println(student1.name);
        // truy xuất phương thức: tên đối tượng + . + tên phương thức + (đối số nếu có)
        // lưu ý: nếu access cho phép truy cập
        student1.setName("nguyen van b");
    }
}
