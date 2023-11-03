package ss3_mang_va_phuong_thuc_trong_java.bai_tap;

import java.util.Scanner;

public class TinhTongCacPhanTuCuaMotMang {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Nhập số hàng của mảng: ");
            int rows = sc.nextInt();
            System.out.print("Nhập số cột của mảng: ");
            int cols = sc.nextInt();

            double[][] matrix = new double[rows][cols];
            System.out.println("Nhập giá trị cho từng phần tử trong mảng:");
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    System.out.print("Nhập giá trị cho phần tử ở hàng " + i + ", cột " + j + ": ");
                    matrix[i][j] = sc.nextDouble();
                }
            }
            System.out.print("Nhập thứ tự của cột để tính tổng (tính từ 0): ");
            int colToSum = sc.nextInt();

            double columnSum = 0;
            for (int i = 0; i < rows; i++) {
                columnSum += matrix[i][colToSum];
            }

            System.out.println("Tổng của cột " + colToSum + " là: " + columnSum);
        }
    }


