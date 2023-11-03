package ss3_mang_va_phuong_thuc_trong_java.bai_tap;

import java.util.Scanner;

public class TimPhanTuLonNhat{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số hàng của ma trận: ");
        int rows = sc.nextInt();
        System.out.print("Nhập số cột của ma trận: ");
        int cols = sc.nextInt();

        double[][] matrix = new double[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print("Nhập giá trị cho phần tử tại hàng " + (i + 1) + " cột " + (j + 1) + ": ");
                matrix[i][j] = sc.nextDouble();
            }
        }

        double maxValue = matrix[0][0];
        int maxRow = 0, maxCol = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (matrix[i][j] > maxValue) {
                    maxValue = matrix[i][j];
                    maxRow = i;
                    maxCol = j;
                }
            }
        }
        System.out.println("Giá trị lớn nhất trong ma trận: " + maxValue);
        System.out.println("Tọa độ của giá trị lớn nhất: Hàng " + (maxRow + 1) + ", Cột " + (maxCol + 1));
    }
}

