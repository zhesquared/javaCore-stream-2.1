package twiin;

import java.util.*;

class Main {
    public static void main(String[] args) {
        List<Integer> intList = Arrays.asList(1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4);
        Collections.sort(intList);

        for (Integer value : intList) {
            if (value > 0 && value % 2 == 0) {
                System.out.println(value);
            }
        }
    }
}