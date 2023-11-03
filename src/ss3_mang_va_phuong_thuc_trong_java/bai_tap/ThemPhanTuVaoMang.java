package ss3_mang_va_phuong_thuc_trong_java.bai_tap;

import java.util.Scanner;

public class ThemPhanTuVaoMang {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] array = new int[10];

        System.out.println("Nhập giá trị cho mảng (10 phần tử):");
        for (int i = 0; i < array.length; i++) {
            System.out.print("Nhập giá trị cho phần tử thứ " + i + ": ");
            array[i] = input.nextInt();
        }

        System.out.print("Nhập giá trị X cần thêm: ");
        int X = input.nextInt();

        System.out.print("Nhập vị trí index cần thêm X: ");
        int index = input.nextInt();

        if (index < 0 || index >= array.length) {
            System.out.println("Không thể thêm phần tử vào vị trí này.");
        } else {
            for (int i = array.length - 1; i > index; i--) {
                array[i] = array[i - 1];
            }
            array[index] = X;

            System.out.println("Mảng sau khi thêm phần tử " + X + " vào vị trí " + index + ":");
            for (int i = 0; i < array.length; i++) {
                System.out.print(array[i] + " ");
            }
        }

        input.close();
    }
}
