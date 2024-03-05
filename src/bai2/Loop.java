package bai2;

public class Loop {
    public static void main(String[] args) {
        // vòng lặp java vẫn có break và continue
        // for
        for (int i = 0; i < 5; i++) {
            System.out.println(i);
        }

        // while
        int i = 0;
        while (i < 5) {
            System.out.println(i);
            i++;
        }

        // do-while
        int j = 0;
        do {
            System.out.println(j);
            j++;
        } while(j < 5);

        // forEach
        int[] ints = {5,4,3,2,1};
        for (int k = 0; k < ints.length; k++) {
            System.out.println(ints[k]);
            System.out.println(k);
        }

        // forEach sẽ không biết vị trí phần tử
        for (int element : ints) {
            System.out.println(element);
        }
    }
}
