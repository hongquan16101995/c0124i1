package bai3;

public class StackHeap {
    static int b;

    public static void m1() {
        int a = 11;
        System.out.println(a);
        System.out.println(b);
    }

    public static void main(String[] args) {
        // tham trị và tham chiếu
        // biến local và biến global
        // biến local là biến được khai báo trong phương thức, biến local sẽ không có giá trị mặc định mà phải được khai báo giá trị cụ thể trước khi sử dụng
        // biến global là biến được khai báo trong lớp, hay nó chính là 1 thuộc tính của lơp, khi đó nếu không khai báo giá trị, thì biến sẽ có giá tr mặc định tùy theo kiểu dữ liệu khai báo
        m1();
    }
}
