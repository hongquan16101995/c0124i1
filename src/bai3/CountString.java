package bai3;

import java.util.Scanner;

public class CountString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập chuỗi bất kỳ: ");
        String str = scanner.nextLine();
        System.out.println("Nhập ký tự cần tìm: ");
        String a = scanner.nextLine();
        String[] strings = str.split("");
        int count = 0;
        for (String s : strings) {
            if (s.equals(a)) {
                count++;
            }
        }
        if (count == 0) {
            count = -1;
        }
        System.out.println(count);

//        // lấy ký tự thứ N (với N là số trong hàm charAt())
//        // trong từ khóa được lấy bởi hàm next
//        // hàm next sẽ lấy từ khóa đến khi gặp xuống dòng hoặc dấu cách
//        // next cũng giống nextInt, không làm mất ký tự xuống dòng
//        System.out.println(scanner.next().charAt(1));
//        System.out.println(scanner.next());
//        System.out.println(scanner.nextLine().charAt(8));
//        System.out.println(scanner.next().charAt(8));
    }
}
