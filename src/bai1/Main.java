package bai1;

public class Main {
    public static void main(String[] args) {
        System.out.println("HelloWorld CodeGym");
        // let a = 10
        int a = 10;
        String b = "10";

        // 6 nhóm toán tử:
        // toán học: + - * / %
        // gán: = += -= *= /= %=
        // cộng chuỗi: +
        // so sánh: == != (không có === và !==) > < >= <=
        // logic: || && !
        // typeof: dùng để kiểm tra kiểu dữ liệu
        // => java có cần làm cái này nữa k? => không có toán tử typeof
        // kiểm tra dạng của biến thuộc lớp nào: instance of (học thêm ở bài 4)

        // kld: 2 dạng kiểu dữ liệu: nguyên thủy và tham chiếu
        // nguyên thủy: 8 kiểu riêng biệt, bao gồm:
        // ký tự: char => 'a', 'b'
        // boolean: true / false
        // number: 6 kiểu; mã máy: 0 va 1 (1 bit)
        // số nguyên: int (32 bit)
        // số nguyên rất lớn: long (64 bit)
        // số thập phân: float (32 bit)
        // số thập phân rất lớn: double (64 bit)
        // short (16 bit)
        // byte (8 bit)
        // tham chiếu: object

        // khác nhau giữa character và String
        // ký tự: kld định danh cho giá trị của biến chứa 1 ký tự duy nhất
        // dạng số hoặc chữ cái
        char demo = 'a';
        char demo1 = '1';
        // chuỗi: kld định danh cho giá trị của biến chứa tập hợp nhiều ký tự
        String demo2 = "abc";
        String demo3 = "123";
        String demo4 = "1b7";
        // ví dụ:
        char d = 'a';
        String d1 = "a";
        String d2 = "a";
        String test = d1 + d;
        String test1 = d1 + true;
        String test2 = d1 + 123;
        System.out.println(test);
        System.out.println(test1);
        System.out.println(test2);
    }
}
