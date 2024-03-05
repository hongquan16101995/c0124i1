package bai3;

public class ArrayJava {
    public static void main(String[] args) {
        // khái niệm array
        // mảng trong Java sẽ chỉ chứa 1 kiểu dữ liệu
        // mảng trong Java sẽ cố định về độ dài
        // ví dụ: khai báo mảng 5 phần tử => nếu muốn thêm phần tử thứ 6 thì phải tạo mảng mới có 6 phần từ, sau đó copy 5 phần tử ban đầu sang và thêm phần tử thứ 6
        // mảng trong Java không có các hàm có sẵn
        // khai báo mảng có 2 cách:
        // trực tiếp với dấu ngoặc nhọn
        // cú pháp: KDL [] <tên mảng> = {các phần tử};
        int[] ints = {1,2,3,4};
        // c2: dùng từ khóa new
        // cú pháp: KDL [] <tên mảng> = new KDL[độ dài mảng];
        // cú pháp: KDL [] <tên mảng> = new KDL[]{các phần tử};
        int[] ints1 = new int[5];
//        ints1[5] = 10;
        int[] ints2 = new int[]{1,2,3,4};

        int[][] ints3 = {{1,2}, {3,4}, {5,6}};
        int[][] ints4 = new int[3][2];

        // lớp Arrays: là lớp có sẵn trong Java
        // hỗ trợ 1 số phương thức để thao tác với mảng
        // bt: cho mảng 3 phần tử, thêm phần tử bất kỳ vào mảng
        int[] ints5 = {1,2,3};
        int a = 100;
        int[] ints6 = new int[ints5.length + 1];
        for (int i = 0; i < ints5.length; i++) {
            ints6[i] = ints5[i];
        }
        ints6[ints6.length - 1] = a;
        for (int o : ints6) {
            System.out.println(o);
        }
    }
}
