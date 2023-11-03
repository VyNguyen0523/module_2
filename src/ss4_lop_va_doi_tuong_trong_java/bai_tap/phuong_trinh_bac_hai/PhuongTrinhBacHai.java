package ss4_lop_va_doi_tuong_trong_java.bai_tap.phuong_trinh_bac_hai;

import java.util.Scanner;

public class PhuongTrinhBacHai {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a;
        do {
            System.out.print("Nhập hệ số a (a>0): ");
            a = Double.parseDouble(sc.nextLine());
        } while (a == 0);

        double b;
        System.out.println("Nhâp b: ");
        b = Double.parseDouble(sc.nextLine());

        double c;
        System.out.println("Nhâp c: ");
        c = Double.parseDouble(sc.nextLine());

        System.out.println("Phương trình bạn vừa nhập là: ");
        QuadraticEquation quadraticEquation = new QuadraticEquation(a, b, c);
        if (quadraticEquation.getDiscriminant() < 0) {
            System.out.println("Phương trình vô nghiệm");
        } else if (quadraticEquation.getDiscriminant() == 0) {
            System.out.println("Phương trình có 1 nghiệm");
        } else {
            System.out.println("Phương trình có 2 nghiệm phân biệt: ");
            System.out.println("X1: " + quadraticEquation.getRoot1());
            System.out.println("X2: " + quadraticEquation.getRoot2());

        }

    }
}
