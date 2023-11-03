package ss3_mang_va_phuong_thuc_trong_java.bai_tap;

import java.util.Scanner;

public class XoaPhanTuKhoiMang {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Nhập số lượng phần tử của mảng: ");
        int N = input.nextInt();
        int[] array = new int[N];

        System.out.println("Nhập các phần tử của mảng:");
        for (int i = 0; i < N; i++) {
            array[i] = input.nextInt();
        }

        System.out.print("Nhập phần tử cần xoá: ");
        int X = input.nextInt();

        int index_del = -1; //mặc định là -1 nếu không tìm thấy
        for (int i = 0; i < N; i++) {
            if (array[i] == X) {
                index_del = i;
                break;
            }
        }

        if (index_del == -1) {
            System.out.println(X + " không xuất hiện trong mảng.");
        } else {
            for (int i = index_del; i < N - 1; i++) {
                array[i] = array[i + 1];
            }
            N--;

        System.out.println("Mảng sau khi xoá phần tử " + X + ":");
            for (int i = 0; i < N; i++) {
                System.out.print(array[i] + " ");
            }
        }

        input.close();
    }
}



