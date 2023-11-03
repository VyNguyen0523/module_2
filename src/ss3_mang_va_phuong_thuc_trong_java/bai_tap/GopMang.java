package ss3_mang_va_phuong_thuc_trong_java.bai_tap;

import java.util.Scanner;

public class GopMang {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int X,Y;
        System.out.println("Nhập số lượng phần tử trong mảng 1: ");
         X = sc.nextInt();
        System.out.println("Nhập số lượng phần tử trong mảng 2: ");
        Y = sc.nextInt();
        int[] array1 = new int[X];
        int[] array2 = new int[Y];

        System.out.println("Nhập các phần tử trong mảng 1: ");
        for (int i = 0; i < X; i++) {
            array1[i] = sc.nextInt();
        }
        System.out.println("Nhập các phần tử trong mảng 2: ");
        for (int i = 0; i < Y; i++) {
            array2[i] = sc.nextInt();
        }
        int[] array3 = new int[X + Y];

        for (int i = 0; i < X; i++) {
            array3[i] = array1[i];
        }
        for (int i = 0; i < Y; i++) {
            array3[X + i] = array2[i];
        }
        System.out.print("Mảng 3 là: ");
        for (int i = 0; i < X + Y; i++) {
            System.out.print(array3[i] + " ");
        }
    }
}
