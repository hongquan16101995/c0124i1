import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        // phương thức siêu main: phương thức đầu tiên được gọi khi JMV thực thi chương trình java
        // cấu trúc của siêu main là duy nhất
        // public: access modifier (học ở bài 5), liên quan đến phạm vi sử dụng
        // static: tài nguyên tĩnh (học ở bài 5)
        // phương thức là tên gọi khác của hàm trong lớp
        // void: định danh cho các phương thức không có giá trị trả về, không chứa từ khóa return
        // main: tên của phương thức
        // String[] args: tham số của phương thức

        // System.out và phương thức
        // System: là 1 lớp có sẵn trong Java, đại diện cho hệ thống chương trình Java đang viết
        // .out: trả về đối tượng hỗ trợ outcome của chương trình
        // => System.out giúp trả ra kết quả của chương trình Java
        // 1 vài phương thức giúp hiển thị kết quả:
        // print(): in kết quả ra console, in trên 1 dòng
        // println(): in kết quả ra console, in trong 1 dòng và xuống dòng
        // printf(): in kết quả ra console, in theo định dạng mong muốn
        // ví dụ: viết tắt là sout + phím Tab
        System.out.print("Hello");
        System.out.print("World");
        System.out.print("123");
        System.out.println();
        System.out.println("-----------");
        System.out.println("Hello");
        System.out.println("World");

        // lớp Scanner
        // Scanner: lớp có sẵn trong thư viện của Java, thuộc java.util
        // hiểu rằng, lớp Scanner sẽ quét qua màn hình console với System.in
        // sau đó sẽ lấy về các giá trị được nhập từ màn hình console
        // và gán và biến tương ứng
        // Giải nghĩa: chương trình Java core không có giao diện
        // mọi thứ đều thao tác trên console của IDEA
        // vậy nên: System.in là lấy dữ liệu từ console vào chương trình Java
        // nhờ hỗ trợ bởi lớp Scanner
        // System.out là in dữ liệu từ chương trình Java ra console
        // ví dụ:
        System.out.println("Nhập 1 số bất kỳ: ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        System.out.println("Bình phương số đó là: " + (Math.pow(number, 2)));


    }

    // phương thức không giá trị trả về; phương thức void
    public static void m1() {
        System.out.println("HelloWorld");
    }

    // phương thức có giá trị trả về; cần phải khai báo giá trị trả về
    public static String m2() {
//        return 123;
        return "ByeWorld";
    }
}
