package ss2_vong_lap_to_java.bai_tap;

import java.util.Scanner;

public class HienThiCacLoaiHinh {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Choose option:\n " +
                    "1. Print the rectangle:\n " +
                    "2. Print the square triangle:\n " +
                    "3. Print isosceles triangle:\n " +
                    "4. Exit:\n");
            int choose = Integer.parseInt(scanner.nextLine());

            switch (choose) {
                case 1:
                    System.out.println("---The rectangle---");
                    int height;
                    int width;

                    System.out.print("height = ");
                    height = Integer.parseInt(scanner.nextLine());
                    System.out.print("width = ");
                    width = Integer.parseInt(scanner.nextLine());

                    for (int i = 1; i <= height; i++) {
                        for (int j = 1; j <= width; j++) {
                            System.out.print("*  ");
                        }
                        System.out.println("");
                    }
                    break;

                case 2:
                    System.out.println("---The square triangle---");
                    System.out.print("Input Height:");
                    height = Integer.parseInt(scanner.nextLine());

                    System.out.println("Choose corner: ");
                    System.out.println("1: top-left");
                    System.out.println("2: top-right");
                    System.out.println("3: bottom-left");
                    System.out.println("4: bottom-right");
                    int corner = Integer.parseInt(scanner.nextLine());

                    switch (corner) {
                        case 1:
                            for (int i = height; i >= 1; i--) {
                                for (int j = 1; j <= i; j++) {
                                    System.out.print("*");
                                }
                                System.out.println();
                            }
                            break;
                        case 2:
                            for (int i = height; i >= 1; i--) {
                                for (int j = 1; j <= height - i; j++) {
                                    System.out.print(" ");
                                }
                                for (int j = 1; j <= i; j++) {
                                    System.out.print("*");
                                }
                                System.out.println();
                            }
                            break;
                        case 3:
                            for (int i = 1; i <= height; i++) {
                                for (int j = 1; j <= i; j++) {
                                    System.out.print("*");
                                }
                                System.out.println();
                            }
                            break;
                        case 4:
                            for (int i = 1; i <= height; i++) {
                                for (int j = 1; j <= height - i; j++) {
                                    System.out.print(" ");
                                }
                                for (int j = 1; j <= i; j++) {
                                    System.out.print("*");
                                }
                                System.out.println();
                            }
                            break;
                    }
                    break;

                case 3:
                    System.out.println("---The isosceles triangle---");
                    System.out.print("Input Height:");
                    height = Integer.parseInt(scanner.nextLine());

                    for (int i = 1; i <= height; i++) {
                        for (int j = 1; j <= height - i; j++) {
                            System.out.print(" ");
                        }
                        for (int j = 1; j <= 2 * i - 1; j++) {
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                    break;

                case 4:
                    System.out.println("Goodbye!");
                    System.exit(0);

                default:
                    System.out.println("Invalid option. Please choose again.");
            }
        }
    }
}



