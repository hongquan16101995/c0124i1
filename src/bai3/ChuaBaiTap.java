package bai3;

import java.util.Scanner;

public class ChuaBaiTap {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ChuaBaiTap chuaBaiTap = new ChuaBaiTap();
        int[] ints = chuaBaiTap.createArray(scanner);
        System.out.println("Trước khi thêm p.tử: ");
        chuaBaiTap.display( ints);
//        ints = chuaBaiTap.addElementInArray(scanner, ints);
//        System.out.println("Sau khi thêm p.tử: ");
//        chuaBaiTap.display(ints);
        ints = chuaBaiTap.deleteElementInArray(scanner, ints);
        System.out.println("Sau khi xóa p.tử: ");
        chuaBaiTap.display(ints);
    }

    public int[] createArray(Scanner scanner) {
        System.out.println("Nhập độ dài mảng bạn muốn: ");
        int length = scanner.nextInt();
        int[] ints = new int[length];
        for (int i = 0; i < ints.length; i++) {
            System.out.println("Nhập phần tử thứ " + (i + 1));
            ints[i] = scanner.nextInt();
        }
        return ints;
    }

    public int[] addElementInArray(Scanner scanner, int[] ints) {
        System.out.println("Nhập giá trị bạn muốn thêm: ");
        int element = scanner.nextInt();
        System.out.println("Nhập vị trí bạn muốn thêm: ");
        int index = scanner.nextInt();
        if (index < 0 || index > ints.length) {
            System.out.println("Vị trí không tồn tại!");
        } else {
            int[] newInt = new int[ints.length + 1];
            for (int i = 0; i < ints.length; i++) {
                if (i < index) {
                    newInt[i] = ints[i];
                } else {
                    newInt[i + 1] = ints[i];
                }
            }
            newInt[index] = element;
            return newInt;
        }
        return null;
    }

    public int[] deleteElementInArray(Scanner scanner, int[] ints) {
        System.out.println("Nhập vị trí bạn muốn xóa: ");
        int index = scanner.nextInt();
        if (index < 0 || index > ints.length) {
            System.out.println("Vị trí không tồn tại!");
        } else {
            int[] newInt = new int[ints.length - 1];
            for (int i = 0; i < newInt.length; i++) {
                if (i < index) {
                    newInt[i] = ints[i];
                } else {
                    newInt[i] = ints[i + 1];
                }
            }
            return newInt;
        }
        return null;
    }

    public void display(int[] ints) {
        for (int i : ints) {
            System.out.print(i + ", ");
        }
        System.out.println();
    }
}
