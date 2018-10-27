package Test;

import java.util.Scanner;

public class PESELcheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int pesel = scanner.nextInt();
        isPESELGood(pesel);
    }

    private static void isPESELGood(int pesel) {
        int lenghtOfPesel = String.valueOf(pesel).length();
        int remainigValueOfPesel;
        int tempPesel;
        for (int i = 0; i < lenghtOfPesel ; i++) {


        }
    }
}
