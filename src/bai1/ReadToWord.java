package bai1;

import java.util.Scanner;

public class ReadToWord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Nhập số bạn muốn đọc: ");
            int number = Integer.parseInt(scanner.nextLine());
            int unit = number % 10;
            int dozen = (number % 100) / 10;
            int hundred = number / 100;
            String data = "";
            if (number < 0 || number > 999) {
                data += "Out of ability";
            } else if (number == 0) {
                data += "zero";
            } else if (number < 20) {
                data += unit(number);
            } else if (number < 100) {
                data += dozen(dozen) + " " + unit(unit);
            } else if (number < 999) {
                data += unit(hundred) + " hundred and " + dozen(dozen) + " " + unit(unit);
            }
            System.out.println(data);
            if (number == -1) {
                break;
            }
        } while (true);

    }

    public static String unit(int number) {
        String unit = "";
        switch (number) {
            case 1:
                unit = "one";
                break;
            case 2:
                unit = "two";
                break;
            case 3:
                unit = "three";
                break;
            case 4:
                unit = "four";
                break;
            case 5:
                unit = "five";
                break;
            case 6:
                unit = "six";
                break;
            case 7:
                unit = "seven";
                break;
            case 8:
                unit = "eight";
                break;
            case 9:
                unit = "nine";
                break;
            case 10:
                unit = "ten";
                break;
            case 11:
                unit = "eleven";
                break;
            case 12:
                unit = "twelve";
                break;
            case 13:
                unit = "thirteen";
                break;
            case 14:
                unit = "fourteen";
                break;
            case 15:
                unit = "fifteen";
                break;
            case 16:
                unit = "sixteen";
                break;
            case 17:
                unit = "seventeen";
                break;
            case 18:
                unit = "eighteen";
                break;
            case 19:
                unit = "nineteen";
                break;
        }
        return unit;
    }

    public static String dozen(int number) {
        String dozen = "";
        switch (number) {
            case 2:
                dozen = "twenty";
                break;
            case 3:
                dozen = "thirty";
                break;
            case 4:
                dozen = "forty";
                break;
            case 5:
                dozen = "fifty";
                break;
            case 6:
                dozen = "sixty";
                break;
            case 7:
                dozen = "seventy";
                break;
            case 8:
                dozen = "eighty";
                break;
            case 9:
                dozen = "ninety";
                break;
        }
        return dozen;
    }
}
