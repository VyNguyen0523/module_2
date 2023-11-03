package ss2_vong_lap_to_java.bai_tap;

import java.util.Scanner;

public class HienThiSoNguyenToDauTien {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Nhập số lượng số nguyên tố cần in ra (tối đa 20): ");
        int numbers = input.nextInt();
        input.close();

        if (numbers > 20) {
            System.out.println("Số lượng số nguyên tố cần in ra không được vượt quá 20.");
            return;
        }

        int count = 0;
        int N = 2;

        while (count < numbers) {
            if (isPrime(N)) {
                System.out.print(N + " ");
                count++;
            }
            N++;
        }
    }
    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
