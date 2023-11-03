package ss3_mang_va_phuong_thuc_trong_java.bai_tap;

import java.util.Scanner;

public class DemSolanXuatHienCuaKiTu {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Nhập chuỗi: ");
            String str = sc.nextLine();

            System.out.print("Nhập ký tự cần đếm: ");
            char targetChar = sc.next().charAt(0);

            int count = 0;
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == targetChar) {
                    count++;
                }
            }
            System.out.println("Số lần xuất hiện của ký tự '" + targetChar + "' trong chuỗi là: " + count);
        }
    }

