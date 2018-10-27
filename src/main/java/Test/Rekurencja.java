package Test;

import java.util.Arrays;
import java.util.List;

public class Rekurencja {
    public static void main(String[] args) {

        List<Integer> chain = Arrays.asList(1, 2, 3, 8, 5, 3, 8);
        System.out.println(chain);
        int length = chain.size();
        writeOnScreenBackwards(chain, length - 1);
    }

    private static void writeOnScreenBackwards(List<Integer> array, int length) {

        if (length < 0) {
            return;
        }
        System.out.print(array.get(length));
        writeOnScreenBackwards(array, length - 1);

    }
}
