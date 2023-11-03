package ss1_Introduction_To_Java.bai_tap;

import java.util.Scanner;

public class UngDungChuyenDoiTienTe {
    public static void main(String[] args) {
        double vnd = 23000;
        double usd;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter usd amount is: ");
        usd = sc.nextDouble();
        double convert = 23000 * usd;
        System.out.println("The value vnd is: " + convert);
    }
}

