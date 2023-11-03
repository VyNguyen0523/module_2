package ss1_Introduction_To_Java.bai_tap;

import java.util.Scanner;

        public class UngDungDoiSoThanhChu {

            public static String numberToWords(int number) {
                String[] ones = {"", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"};
                String[] teens = {"", "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen"};
                String[] tens = {"", "Ten", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"};


                if (number < 0 || number > 999) {
                    return "Out of range";
                }

                if (number == 0) {
                    return "Zero";
                }

                StringBuilder words = new StringBuilder();

                if (number >= 100) {
                    words.append(ones[number / 100]).append(" Hundred ");
                    number %= 100;
                }

                if (number >= 10 && number <= 19) {
                    words.append(teens[number - 10]);
                    number = 0;
                } else if (number >= 20) {
                    words.append(tens[number / 10]);
                    number %= 10;

                    if (number > 0) {
                        words.append(" ");
                    }
                }

                if (number > 0) {
                    words.append(ones[number]);
                }

                return words.toString();
            }

            public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);
                char choice;
              do {
                System.out.print("Enter a number (0-999): ");
                int number = scanner.nextInt();
                scanner.nextLine();

                String words = numberToWords(number);
                System.out.println(number + " in words: " + words);

                System.out.print("Do you want to enter another number? (Y/N): ");
                choice = scanner.nextLine().charAt(0);
            } while (choice == 'Y' || choice == 'y');
            }
        }



