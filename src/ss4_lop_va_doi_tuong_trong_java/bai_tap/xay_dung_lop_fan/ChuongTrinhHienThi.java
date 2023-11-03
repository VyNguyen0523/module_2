package ss4_lop_va_doi_tuong_trong_java.bai_tap.xay_dung_lop_fan;

import java.util.Scanner;

public class ChuongTrinhHienThi {
    public static void main(String[] args) {
        Fan f1 = new Fan();
        Fan f2 = new Fan();

        f1.setSpeed(Fan.FAST);
        f1.setRadius(10);
        f1.setColor("yellow");
        f1.setOn(true);
        System.out.println("Đối tượng Fan 1 "+f1);

        f2.setSpeed(Fan.MEDIUM);
        f2.setRadius(5);
        f2.setColor("blue");
        f2.setOn(false);
        System.out.println("Đối tượng Fan 2 "+f2);

    }
}
